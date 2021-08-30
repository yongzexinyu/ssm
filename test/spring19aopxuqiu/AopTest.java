package spring19aopxuqiu;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AopTest {
    @Test
    public  void test01(){
        //排队
        //存钱
        //之前1个类，现在2个类
      /*  PaiDui  paiDui=new PaiDui();//次要业务  不应该出现在这个方法中，我们该怎么实现排号取钱呢？
        paiDui.paiHao();*/


        Bank bank=new Bank();//主要业务
        bank.cunQian();
        //问题：
        //次要业务  不应该出现在这个方法中，我们该怎么实现排号取钱呢？
    }
    @Test//使用静态代理解决 切面类+主要业务 组合在一起
    public  void test02() {
        BankService bankService = new BankServiceImpl();

        PaiDui paiDui = new PaiDui();

        BankService bankService1 = (BankService) Proxy.newProxyInstance(bankService.getClass().getClassLoader(),
                bankService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        PaiDui.paiHao();
                        System.out.println("被织入了");
                        Object result = method.invoke(bankService, args);
                        return result;
                    }

                });
        bankService1.cunQian();
    }
}
