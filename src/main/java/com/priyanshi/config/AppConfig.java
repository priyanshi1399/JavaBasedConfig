package com.priyanshi.config;

import com.priyanshi.Alien;
import com.priyanshi.Computer;
import com.priyanshi.Desktop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {


    @Bean
    public Alien alien(@Autowired Computer com){
        Alien obj=new Alien();
        obj.setAge(24);
        obj.setCom(com);
        return obj;
    }

    //@Bean(name={"com2","desktop1","prior"})
    @Bean
   // @Scope("prototype")
public Desktop desktop(){
    return new Desktop();
}

}
