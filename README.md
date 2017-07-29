# lab-backend

## Para rodar o projeto no Tomcat

`mvn tomcat7:run`

## Para construir o projeto

`mvn clean package`

## Como o projeto foi criado

`mvn archetype:generate -DarchetypeArtifactId=maven-archetype-webapp -DgroupId=lab -DartifactId=lab-backend -DinteractiveMode=false`

"Embutindo" o Maven. Para que não seja necessário instalar e configurar o Maven, ele foi embutido no projeto com o seguinte comando:

`mvn io.takari:maven:0.3.3:wrapper -Dmaven=3.3.9`
