package com.priyanshi.config;

import com.priyanshi.Alien;
import com.priyanshi.Computer;
import com.priyanshi.Desktop;
import com.priyanshi.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.priyanshi")

public class AppConfig {

//
//    @Bean
//    public Alien alien( @Autowired Computer com){ //@Qualifier("laptop1")-->primary
//        Alien obj=new Alien();
//        obj.setAge(24);
//        obj.setCom(com);
//        return obj;
//    }
//
//    //@Bean(name={"com2","desktop1","prior"})
//    @Bean
//   // @Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }

}
