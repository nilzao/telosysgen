# telosysgen
system to generate telosys xml

something create useful xml files usable for telosys

https://www.telosys.org/

loading dbrep file:

    curl -F "file=@h2test.dbrep" http://localhost:8080/upload

chromium/chrome without cors protection

    chromium  --disable-web-security --user-data-dir="$HOME/.dev-cors/" &
