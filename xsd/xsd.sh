#!/bin/bash
export LANG="en_US.UTF-8"
export LANGUAGE="en_US:"
xjc -p org.telosysgen.jaxb.repo -npa -no-header \
   RepositoryModel.xsd

#cp -r com ../src/main/java
#rm -rf com
