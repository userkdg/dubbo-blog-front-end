package com.isunday.blog.rpc.service.impl;

import com.isunday.blog.rpc.service.ITestDubboService;
import org.springframework.stereotype.Service;

@Service
public class ITestDubboServiceImpl implements ITestDubboService {


    public String testDubbo(){
        System.out.print("service......complete...");
        return "customer connect to provider .....SUCCESS........";
    }

}
