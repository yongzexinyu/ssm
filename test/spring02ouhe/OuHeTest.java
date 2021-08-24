package spring02ouhe;

import org.junit.Test;

public class OuHeTest {
//创建几个类，模拟耦合
    @Test
    public void test01(){
       /* //如果使用电脑传数据
        Computer computer=new Computer();
        computer.usbData();
        //如果使用 电视传输数据
        MyTv myTv=new MyTv();
        myTv.usbData();*/


        //更新接口后，代码优化了，解耦一次
     /*   Usb u=new Computer();
        u=new MyTv();
        u.usbData();*/

       //需求1：现在 new Computer(); new MyTv(); 都有usbData的功能
       //问题：直接修改，代码修改量比较大
        //想把Computer类不用，修改成Tv
        //要求只修改 new Computer
        //那么 需要 把usbData方法 提取成接口，然后使用多态的是思想进行代码更新，解耦1次
//第一次 使用接口，多态的思想解耦，好处是，可以多次修改代码，不用改变量了；直接一个 u 就可以代替上面的new对象
//第二次解耦，即代码更方便
/*Usb u=FactoryBean.getInstance("Computer");
      u.usbData();*/
      //以上 第二次写法是不是 更优美了，更解耦了，让用户输入字符串，比打开源代码，找到第几行，更放便，将来代码要加密
        /*try {
            Class<Date> aClass = (Class<Date>) Class.forName("java.util.Date");
            Date date1 = aClass.newInstance();

            System.out.println("date1 = " + date1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        Usb instance = FactoryBean1.getInstance("spring02ouhe.Mp4");//spring的底层也是工厂模式
        instance.usbData();

    }
}
