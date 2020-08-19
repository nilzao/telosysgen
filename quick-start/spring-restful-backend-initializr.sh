#!/bin/bash
if [ "$#" -ne 2 ]; then
    echo "usage spring-restful-backend-initializr.sh groupId artifactId"
    echo "example:"
    echo "./spring-restful-backend-initializr.sh io.github.superdev myproject"
    exit 1
fi
GROUPID=$1
ARTIFACTID=$2

function installTelosysCli() {

  wget http://telosys.org/download/telosys-cli/dl.php?ver=3.2.2-001 -O telosys-cli.zip
  unzip telosys-cli.zip -d telosys-cli
  rm -f telosys-cli.zip

  echo '#!/bin/bash
BASEDIR=$(dirname "$0")
java -cp $BASEDIR/telosys-cli-3.2.2-001.jar org.telosys.tools.launcher.ApplicationLauncher $1 $2
' > telosys-cli/tl

  chmod +x telosys-cli/tt
  chmod +x telosys-cli/tl

}

function callSpringInitializr() {

  curl https://start.spring.io/starter.zip \
  -d name="${ARTIFACTID}" \
  -d groupId="${GROUPID}" \
  -d artifactId="${ARTIFACTID}" \
  -d description="${ARTIFACTID} project with spring boot" \
  -d dependencies=lombok,web,data-rest,h2,data-jpa \
  -o ${ARTIFACTID}.zip

  unzip ${ARTIFACTID}.zip -d ${ARTIFACTID}

  rm -f ${ARTIFACTID}.zip

}

function prepareTelosysTools() {

  mkdir -p ${ARTIFACTID}/TelosysTools/downloads
  mkdir -p ${ARTIFACTID}/TelosysTools/lib
  mkdir -p ${ARTIFACTID}/TelosysTools/templates
  mkdir -p ${ARTIFACTID}/TelosysTools/launchers

  echo '<databases defaultId="1" maxId="10">
</databases>' > ${ARTIFACTID}/TelosysTools/databases.dbcfg

  echo 'SRC=src/main/java
RES=src/main/resources
WEB=src/main/webapp
TEST_SRC=src/test/java
TEST_RES=src/test/resources
DOC=doc
TMP=tmp
ROOT_PKG='${GROUPID}'.'${ARTIFACTID}'
ENTITY_PKG='${GROUPID}'.'${ARTIFACTID}'.entity
# -------------------------------------------
# --- Project Specific Variables
ProjectVariable.MAVEN_ARTIFACT_ID='${ARTIFACTID}'
ProjectVariable.MAVEN_GROUP_ID='${GROUPID}'
ProjectVariable.PROJECT_NAME='${ARTIFACTID}'
ProjectVariable.PROJECT_VERSION=0.1
ProjectVariable.REST_SERVER_PORT=3000
ProjectVariable.REST_API_ROOT=/api/v1
ProjectVariable.REST_URL_ROOT=http://localhost:3000
' > ${ARTIFACTID}/TelosysTools/telosys-tools.cfg

  echo '<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<!-- Not a real dbrep file -->
<root>
    <tableList databaseId="1" databaseName="'${ARTIFACTID}'" databaseProductName="H2" generation="2020-08-11 16:00:06">
</tableList>
</root>' > ${ARTIFACTID}/TelosysTools/${ARTIFACTID}.dbrep

}

function installArfourTemplate() {

  ARFOURTEMPLATE=$1
  wget https://github.com/telosys-templates-arfour/${ARFOURTEMPLATE}/archive/master.zip -O ${ARTIFACTID}/TelosysTools/downloads/${ARFOURTEMPLATE}.zip
  unzip ${ARTIFACTID}/TelosysTools/downloads/${ARFOURTEMPLATE}.zip -d ${ARTIFACTID}/TelosysTools/templates
  mv ${ARTIFACTID}/TelosysTools/templates/${ARFOURTEMPLATE}-master ${ARTIFACTID}/TelosysTools/templates/${ARFOURTEMPLATE}
  echo 'model='${ARTIFACTID}'.dbrep
bundle='${ARFOURTEMPLATE} > ${ARTIFACTID}/TelosysTools/launchers/${ARFOURTEMPLATE}.properties
  touch ${ARTIFACTID}/TelosysTools/launchers/${ARFOURTEMPLATE}.entities
  echo '#!/bin/bash
../telosys-cli/tl '${ARFOURTEMPLATE}' -y
' > ${ARTIFACTID}/tl-${ARFOURTEMPLATE}.sh
  chmod +x ${ARTIFACTID}/tl-${ARFOURTEMPLATE}.sh
}

function installArfourSpringTemplates() {

  installArfourTemplate spring-restful-extjs-config-r4
  installArfourTemplate spring-restful-backend-gen-r4
  installArfourTemplate spring-restful-backend-edit-r4
  
}

installTelosysCli
callSpringInitializr
prepareTelosysTools
installArfourSpringTemplates

