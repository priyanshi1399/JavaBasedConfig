package com.priyanshi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Value("24")
    private int age;

    private Laptop lap;
    private Computer com;
    public Alien(){
        System.out.println("Alien Object Created");
    }



    public Computer getCom() {
        return com;
    }
    @Autowired
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//setter injection
    public Laptop getLap() {
        return lap;
    }

    @Autowired
    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code(){
        System.out.println("Compiling");
        com.compile();
        lap.addCode();
        com.compile();

    }
}
