#!/bin/bash
export LANG="en_US.UTF-8"
export LANGUAGE="en_US:"
xjc -p io.github.nilzao.teosysgen.jaxb.repo -npa -no-header \
   RepositoryModel.xsd

cp -r io ../src/main/java
rm -rf io
