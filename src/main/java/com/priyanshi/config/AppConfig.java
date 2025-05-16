package com.priyanshi.config;

import com.priyanshi.Desktop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    //@Bean(name={"com2","desktop1","prior"})
    @Bean
    @Scope("prototype")
public Desktop desktop(){
    return new Desktop();
}

}
