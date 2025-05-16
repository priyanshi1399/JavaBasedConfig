package com.priyanshi;

import com.priyanshi.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        //Desktop dt=context.getBean("com2" ,Desktop.class);
        Desktop dt1=context.getBean(Desktop.class);
        dt1.code();

        Desktop dt2=context.getBean(Desktop.class);
        dt2.code();
    }
}
