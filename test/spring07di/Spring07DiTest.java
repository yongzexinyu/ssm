package spring07di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring07DiTest {
    //构造器注入
    @Test
    public void test0(){
        String xml="spring07di/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        People people = (People) ac.getBean("people");
        people.play();
    }
}
