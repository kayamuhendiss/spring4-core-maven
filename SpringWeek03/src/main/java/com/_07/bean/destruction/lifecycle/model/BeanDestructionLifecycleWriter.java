package com._07.bean.destruction.lifecycle.model;

import org.springframework.beans.factory.DisposableBean;

import javax.annotation.PreDestroy;

public class BeanDestructionLifecycleWriter implements DisposableBean {
    @PreDestroy
    public void preDestroyMethod() {
        System.out.println("preDestroyMethod is invoked!");
    }


    public void destroy() throws Exception {
        System.out.println("destroy is invoked!");

    }


    public void testDestroyMethod() {
        System.out.println("testDestroyMethod is invoked!");
    }
}
