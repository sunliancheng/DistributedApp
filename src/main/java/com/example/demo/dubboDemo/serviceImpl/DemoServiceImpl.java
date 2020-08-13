package com.example.demo.dubboDemo.serviceImpl;

import com.example.demo.dubboDemo.serviceInterface.DemoService;

public class DemoServiceImpl implements DemoService {


    @Override
    public String sayHello(String name) {
        return "hello: " + name;
    }
}
