package com.isunday.blog.web.dubbo.test;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class TestDubboCustomer {
    private static ClassPathXmlApplicationContext context = null;
    static {
        context = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext-dubbo-customer.xml");
        context.start();
        System.out.println("初始化......context..........");
    }

    @Reference
  //  private ITestDubboService dubboService;
    public void getStr(){
    //    String result = dubboService.testDubbo();
    //    System.out.print(result);

    }


    public static void main(String[] args){
        //获取Spring容器

//      UserServiceImpl userService = (UserServiceImpl)context.getBean("userService");
// 注意：provider只暴露了 UserServiceImpl的IUserService接口而不是暴露了这个实现类、否则
// Exception in thread "main" java.lang.ClassCastException: com.alibaba.dubbo.common.bytecode.proxy0 cannot be cast to blog.service.imp.UserService 	at TestDubboCustomer.main(TestDubboCustomer.java:12)

//        IUserService userService = (IUserService)context.getBean("userService");
//        userService.testDubbo();
//        List<Integer> userRoleList = userService.getUserRoleList(1);
//        System.out.print(userRoleList.get(0));

        new TestDubboCustomer().getStr();


    }
}
