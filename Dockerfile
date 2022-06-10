FROM tomcat:9-jre11-temurin
COPY target/testapp-0.1.war /usr/local/tomcat/webapps
EXPOSE 8080
ENTRYPOINT ["./bin/catalina.sh", "run"]

