package spring06di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring06diTest {
    //刚刚是以 set的方式注入的，这叫做set注入！！！常用的
@Test
    public  void test01(){
    String xml="spring06di/applicationContext.xml";
    ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
  //  System.out.println("ac = " + ac);
    Person person = ac.getBean("person", Person.class);
    person.play();

    //思考题：现在 2个类之间的关系
    //人...手机  ，电脑，psp,小霸王，有1000个 可以玩游戏的类，那么是不是要修改1000次

    //思考题，如何提高 依赖效率？？？
    //使用接口，同时也解耦了代码，让依赖关系有实体类依赖编程抽象的依赖，依赖关系就解开了
    //同理：也解释了Java3层架构中，为什么要用到接口
}
@Test
    public  void test02(){
    String xml="spring06di/applicationContext.xml";
    ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
    Person1 person1=ac.getBean("person1",Person1.class);
    person1.eatFood();
}
}
