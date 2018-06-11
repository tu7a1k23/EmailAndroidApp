package com.example.administrator.myapplication.configuration;

import java.security.NoSuchProviderException;
import java.util.Properties;

import javax.mail.Session;
import javax.mail.Store;


public class EmailConfiguration {

    private Properties getServerProperties(String protocol, String host, String port) {
        Properties properties = new Properties();
        properties.put(String.format("mail.%s.host", protocol), host);
        properties.put(String.format("mail.%s.port", protocol), port);

        // SSL settings
        properties.setProperty(String.format("mail.%s.socketFactory.class", protocol), "javax.net.ssl.SSLSocketFactory");
        properties.setProperty(String.format("mail.%s.socketFactory.fallback", protocol), "false");
        properties.setProperty(String.format("mail.%s.socketFactory.port", protocol), port);
        return properties;
    }


    public Store getStore() throws javax.mail.NoSuchProviderException {
        Properties properties = getServerProperties("imap", "imap.gmail.com", "993");
        Session session = Session.getInstance(properties);
        return session.getStore("imap");
    }
}