package net.slipp;

import java.io.File;

import org.apache.catalina.startup.Tomcat;

public class WSL {
	public static void main(String[] args) throws Exception {

        String webappDirLocation = "WebContent";
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(7070);

        tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
        System.out.println("configuring app with basedir: " + new File("./" + webappDirLocation).getAbsolutePath());

        tomcat.start();
        tomcat.getServer().await(); 
    }
}
