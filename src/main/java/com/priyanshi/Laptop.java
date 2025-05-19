package com.priyanshi;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Laptop  implements  Computer{

    public Laptop(){
        System.out.println("Laptop Object Created");
    }

    @Override
    public void compile(){
        System.out.println("Compiling using Laptop");
    }

    public void addCode(){
        System.out.println("Hello Java");
    }
}
