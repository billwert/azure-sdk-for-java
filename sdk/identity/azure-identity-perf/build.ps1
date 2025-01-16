copy oldpom.xml .\pom.xml
mvn --%  package  -Dgpg.skip -Dmaven.javadoc.skip=true -Dcodesnippet.skip=true  -Drevapi.skip=true -T 1C
copy .\target\azure-identity-perf-1.0.0-beta.1-jar-with-dependencies.jar ./old.jar
copy newpom.xml .\pom.xml
mvn --%  package  -Dgpg.skip -Dmaven.javadoc.skip=true -Dcodesnippet.skip=true  -Drevapi.skip=true -T 1C
copy .\target\azure-identity-perf-1.0.0-beta.1-jar-with-dependencies.jar ./current.jar

scp -i C:\Users\billwert\billwert-profilevm_key.pem .\old.jar azureuser@20.80.163.15:~ 
scp -i C:\Users\billwert\billwert-profilevm_key.pem .\current.jar azureuser@20.80.163.15:~ 
