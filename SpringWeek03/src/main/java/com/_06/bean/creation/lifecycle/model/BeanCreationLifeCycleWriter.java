package com._06.bean.creation.lifecycle.model;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

public class BeanCreationLifeCycleWriter  implements InitializingBean {


    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet is invoked!");
    }

    @PostConstruct
    public void postConstructMethod() {
        System.out.println("postConstructMethod is invoked!");
    }

    public void testInitMethod() {
        System.out.println("testInitMethod is invoked!");
    }
}
