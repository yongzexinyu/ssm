package spring18aopcglibdongtaidaili;


import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.Method;

public class CglibFactory implements MethodInterceptor,  Callback{

    private  Man man;

    public  CglibFactory(){
        man=new Man();
    }
    // �ռ�DNA  ��ҽԺ��������
    public  Man cglibCreate(){
        //1.�ֽ������ǿ��
        Enhancer enhancer=new Enhancer();
        //2.ָ��һ������
        enhancer.setSuperclass(Man.class);
        //3.���ù���ִ��
        enhancer.setCallback(this);
        //4.����
        return (Man) enhancer.create();
    }
    //����������  ʵ������������
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Integer integer= (Integer) method.invoke(man,objects);
        integer=integer+410;
        return integer;
    }
}
