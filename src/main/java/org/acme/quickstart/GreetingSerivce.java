package org.acme.quickstart;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingSerivce {

    public String greeting(String name){
        return "hello " + name;
    }
}
