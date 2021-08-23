package spring02ouhe;

import java.util.Date;

public class FactoryBean1 {
    public static  Usb  getInstance(String beanurl){

        Object o=null;
        try {
         Class<Usb>   aclass= (Class<Usb>) Class.forName(beanurl);
            o = aclass.newInstance();
            //System.out.println("o = " + o);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return (Usb) o;
    }
}
