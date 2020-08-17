# telosysgen

java spring framework restful web-server + extjs frontend to edit huge .dbrep telosys files

https://www.telosys.org/

loading dbrep file:

    curl -F "file=@TelosysTools/h2telosysgen.dbrep" http://localhost:8080/upload

chromium/chrome without cors protection

    chromium --disable-web-security --user-data-dir="$HOME/.dev-cors/" &

---

Extjs:

extjs 6.2.0 (GPL v3)

http://cdn.sencha.com/ext/gpl/ext-6.2.0-gpl.zip

---

Sencha cmd 7.1

http://cdn.sencha.com/cmd/7.1.0.15/no-jre/SenchaCmd-7.1.0.15-linux-amd64.sh.zip

or

https://www.sencha.com/products/extjs/cmd-download/

build extjs structure:

    sencha -sdk /path/to/ext-6.2.0 generate app TelosysGen tsg-extjs


---

h2db

https://www.h2database.com/html/main.html

or

https://repo1.maven.org/maven2/com/h2database/h2/1.4.200/h2-1.4.200.jar

---

TelosysTools

https://telosys.org/

tl bash file:

    BASEDIR=$(dirname "$0")
    java -cp $BASEDIR/telosys-cli-3.2.2-001.jar org.telosys.tools.launcher.ApplicationLauncher $1 $2
    
---

Arfour templates

https://github.com/telosys-templates-arfour

---

to build the spring project must generate the sources with the scripts:

    tl-spring-restful-backend-edit-r4.sh
    tl-spring-restful-backend-gen-r4.sh
    tl-spring-restful-extjs-config-r4.sh

---

to run the extjs project must generate the sources with the scripts:

    tl-extjs-edit-r4.sh
    tl-extjs-gen-r4.sh
