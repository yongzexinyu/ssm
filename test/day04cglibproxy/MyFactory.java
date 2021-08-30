package day04cglibproxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import java.lang.reflect.Method;

public class MyFactory implements MethodInterceptor,Callback {
    private  Browser browser;

    public   MyFactory() {
        browser = new Browser();
    }
        public Browser cglibCreate(){
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(Browser.class);
       enhancer.setCallback(this);
       return (Browser) enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Boolean i = (Boolean) method.invoke(browser, objects);
if(i==false){
    i=true;
}
        return i;
    }
}
