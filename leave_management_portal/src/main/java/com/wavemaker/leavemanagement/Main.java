package com.wavemaker.leavemanagement;

import java.io.File;
public class Main {
    public static void main(String[] args) throws Exception {
        org.apache.catalina.startup.Tomcat tomcat = new org.apache.catalina.startup.Tomcat();
        tomcat.setPort(8088);
        tomcat.addWebapp("/", new File("src/main/webapp").getAbsolutePath());
        tomcat.start();
        System.out.println("Server Started : http://localhost:8088");
	tomcat.getServer().await();
    }
}

