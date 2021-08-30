package spring20aop01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RegTest {
    @Test
    public  void test01(){
        String xml="spring20aop01/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(xml);
        Regservice regService = ac.getBean("regService", Regservice.class);
        regService.addUser();
        System.out.println("===============================");
        regService.loginUer();
        System.out.println("===============================");
        regService.transMoney();
    }
}
