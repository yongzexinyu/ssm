package spring15zhujiereadproperties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring15Test {
    @Test
    public  void  test01(){
        String xml="spring15zhujiereadproperties/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(xml);
        OneBean oneBean = ac.getBean("oneBean", OneBean.class);
        System.out.println("oneBean = " + oneBean);
    }
}
