package day021;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public  void  test01(){
        String xml="day021/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        Keyboard keyboard = ac.getBean("keyboard", Keyboard.class);
        keyboard.click();
    }
}
