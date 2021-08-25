package spring05yanchijiazai;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringYanChiTest {
    @Test
    public void test01(){
        //1.加载容器的xml
        String xml="spring05yanchijiazai/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        System.out.println("ac = " + ac);
        //lazy-init="true"  就是延迟加载
    }

}
