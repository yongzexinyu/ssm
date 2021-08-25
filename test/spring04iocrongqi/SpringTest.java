package spring04iocrongqi;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Date;

public class SpringTest {
    /*
    * 容器的由来：根据刚刚的工厂模式 得出，一个项目中有着大量的对象
    * 那么 大量的对象需要管理，如果管理更方便，使用容器，把对象统一处理
    *
    * Spring中的容器 IOC
    * IOC有个思想：控制反转，什么叫控制，我控制了你，你控制了我，我如何才算控制你
    * 你的出生*/
    public void test01(){
        //因为我们说 spring容器，管理对象
        //对象的创建 有几种凡是呢？
        //传统的创建对象有三种方式
        //传统的对象，没有容器的统一管理
        //第一种:new 关键字
        Date date=new Date();
        System.out.println("date = " + date);
        System.out.println("------------分隔符-----------------");
        //第二种：static静态方法创建，静态工厂创建
        Calendar calendar=Calendar.getInstance();
        System.out.println("calendar = " + calendar);
        System.out.println("------------分隔符-----------------");
        //第三种：实例工厂创建
        Date time=calendar.getTime();
        System.out.println("time = " + time);
        System.out.println("以上 就是传统创建对象的3种方式");

        //传统的创建对象 的缺点：
        //1.控制权 在哪里？现在 在 test01的方法中
        //2.对象创建的 执行顺序 由谁控制？test01的方法中

        //使用spring 如何管理对象（创建、销毁、实用）
    }
    /*
    * spring容器管理对象，看spring如何创建对象*/

    @Test
    public void test02(){
        //1.加载容器的xml
        String xml="spring04iocrongqi/applicationContext.xml";
        //2.xml文件一经加载，所有的对象都已经诞生了，这就和传统的test0创建的对象不一样了
        //达到了 对象的统一管理，也就是对象创建的控制权被 Sping拿走了
        //以前是new 出来的对象，现在是Sping 通过反射，拿到了对象，这就是控制权的改变，这就是控制反转
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        System.out.println("ac = " + ac);
        //如何取得对象
        Date date=ac.getBean("date",Date.class);
        System.out.println("date = " + date);


        Pc pc1 =ac.getBean("pc",Pc.class);
        System.out.println("pc1 = " + pc1);
        Pc pc2=ac.getBean("pc",Pc.class);
        System.out.println("pc2 = " + pc2);

        System.out.println(pc1==pc2);//默认是单例模式，==为true，即内存地址一样
        //加上scope="prototype"   ==为false

      ((ClassPathXmlApplicationContext) ac).close();//关闭容器

        //如果生命周期使用原型模式看，那么无法调用 无法调用对象的摧毁方法，少用原型模式

    }
}
