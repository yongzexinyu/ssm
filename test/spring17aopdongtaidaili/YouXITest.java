package spring17aopdongtaidaili;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//jdk动态代理
public class YouXITest {
    @Test
    public  void  test01(){
        YouXi youXi=new YouXi();
      Conn jdkProxy= (Conn) Proxy.newProxyInstance(youXi.getClass().getClassLoader(),
                youXi.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                       Integer integer= (Integer) method.invoke(youXi,args);
                       if(integer!=null){
                           integer=60;
                       }
                        return integer;
                    }
                });
        int i = jdkProxy.conNet();
        System.out.println("i = " + i);
    }
}
