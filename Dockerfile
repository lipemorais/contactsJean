FROM tomcat

EXPOSE 8080

COPY tomcat-users.xml /usr/local/tomcat/conf/
COPY target/contacts-1.0-SNAPSHOT.war /usr/local/tomcat/webapps
