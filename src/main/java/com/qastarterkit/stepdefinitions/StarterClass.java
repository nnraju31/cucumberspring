package com.qastarterkit.stepdefinitions;

import com.qastarterkit.config.SpringAppConfig;
import cucumber.api.java.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StarterClass {
    @Before
    public void readPropertiesFile(){
        ApplicationContext factory = new AnnotationConfigApplicationContext(SpringAppConfig.class);
        System.out.println("in starter" );

    }
}
