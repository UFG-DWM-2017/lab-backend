# lab-backend

## Para construir o projeto

`mvn clean package`

## Para rodar o projeto no Tomcat

`mvn org.apache.tomcat.maven:tomcat7-maven-plugin:run -Dmaven.tomcat.port=9090`

## Como o projeto foi criado

`mvn archetype:generate -DarchetypeArtifactId=maven-archetype-webapp -DgroupId=lab -DartifactId=lab-backend -DinteractiveMode=false`