FROM tomcat:9.0.104-jdk21-temurin-jammy
# Copia el archivo WAR generado por Maven al directorio webapps de Tomcat
COPY target/RetrobyteJavaApp /usr/local/tomcat/webapps/retrobyte

# Comando para ejecutar Tomcat
RUN mkdir -p /opt/retrobyte/pictures
CMD ["catalina.sh", "run"]