package com.svalero.retrobyte.util;

public class Constants {
    public static final String DATABASE = "tiendaonlineretrov6";
    public static final String USERNAME ="mrubio8";
    public static final String PASSWORD ="mrubio8";


//    public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
//    public static final String CONNECTION_STRING = "jdbc:oracle:thin:@//localhost:1521/xe";

    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String CONNECTION_STRING = "jdbc:mysql://mysql:3306/" + DATABASE;
    // Para su usos en docker, 1. hay que poner nobre del servicio con este nombre --> public static final String CONNECTION_STRING = "jdbc:mysql://mysql:3306/" + DATABASE;
    //                         2. Teclear en consola--------->  mvn package (para que construlla una imagen para que despues la coga como base para el Dokerfile)
    //                         3. Contruir la Imagen con ---->  docker build -t retrobyte .
    //                         4. Lanzar el docker-compose--->  docker compose -f docker-compose.yaml up -d
    // Ademas si quieres que funcionen las imagenes hay que hacer mas cambios....
    //                         5. cambiar las rutas en index.jsp y view-product.jsp--->  en index por ejemplo..---> <img src="/imagenes/<%=products.getImage()%>" style="max-width: 480px;max-height: 360px;"/>
    //                         6. cambiar web.xml con esta ruta--->   <param-value>/opt/retrobyte/pictures</param-value>
    //                         7. cabiar el Dockerfile y añadir una linea--->  RUN mkdir -p /opt/retrobyte/pictures
    //                         8. Una vez hecho esto volver hacer los puntos 1,2,3,4
    //                         9. Entrar en el contenedor y Editar el archivo server.xml de Tomcat: Normalmente se encuentra en /usr/local/tomcat/conf/server.xml
    //                        10.<Host name="localhost"  appBase="webapps" unpackWARs="true" autoDeploy="true">
    //
    //         Poner esta linea---> <Context path="/imagenes" docBase="/opt/retrobyte/pictures" />            ---> las etiquetas host ya existen previamente
    //                          ---> muy importante grabar el archivo¡¡¡¡¡¡¡
    //                          </Host>
    //                         11. Por ultimo parar y volver a empezar el contenedor para que se reinicie tomcat
    // para su uso en el TOMCAT local hay que dejar esta linea..
//    public static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/" + DATABASE;



    public static final String DATE_PATTERN = "yyyy-MM-dd";
    public static final String USER_DATE_PATTERN = "dd.MM.yyyy";
    public static final String ORDER_DATE_PATTERN ="dd-MM-yyyy";
}
