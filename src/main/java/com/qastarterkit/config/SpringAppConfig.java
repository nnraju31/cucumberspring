package com.qastarterkit.config;

import com.qastarterkit.model.SelectUrl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages = "com.qastarterkit")
@PropertySources({
        @PropertySource("classpath:persistence-${urlid:url1}.properties")
})
public class SpringAppConfig {

    public String url;


    @Value("${testingurl.url}")
    public void setUrl(String url) {
        SelectUrl.url = url;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
       return new PropertySourcesPlaceholderConfigurer();
   }


}

