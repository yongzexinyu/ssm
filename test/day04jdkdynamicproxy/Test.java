package day04jdkdynamicproxy;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    @org.junit.Test
    public  void  test01(){
        Browser browser=new Browser();
        VisitInterface vie= (VisitInterface) Proxy.newProxyInstance(browser.getClass().getClassLoader(),
                browser.getClass().getInterfaces(),
              new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        boolean invo = (boolean) method.invoke(browser, args);
                        if(invo == false){
                            invo=true;
                        }
                        return invo;
                    }
                });
        boolean visit = vie.visit();
        System.out.println("visit = " + visit);
    }
    }

