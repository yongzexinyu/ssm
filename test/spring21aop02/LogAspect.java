package spring21aop02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component("logAspect")
@Aspect
public class LogAspect {
 @Pointcut("execution ( *  spring21aop02.*.*(..) )")

 public  void  pt(){
  System.out.println("切入点表达式");
 }
 @Before("pt()")
 public  void  beforeMsg(){
  System.out.println("前置通知.....");
 }
 @AfterReturning("pt()")
 public  void  afterMsg(){
  System.out.println("后置通知.....");
 }
 /* •环绕通知是所有通知类型中功能最为强大的, 能够全面地控制连接点. 甚至可以控制是否执行连接点.

         •对于环绕通知来说, 连接点的参数类型必须是 ProceedingJoinPoint . 它是 JoinPoint 的子接口,

              允许控制何时执行, 是否执行连接点.

           •在环绕通知中需要明确调用 ProceedingJoinPoint 的 proceed() 方法来执行被代理的方法.

               如果忘记这样做就会导致通知被执行了, 但目标方法没有被执行.

          •注意: 环绕通知的方法需要返回目标方法执行之后的结果, 即调用 joinPoint.proceed(); 的返回值,

                否则会出现空指针异常*/
/* @Around("pt()")
 public  void  aroundMsg(ProceedingJoinPoint joinPoint){

  System.out.println("环绕通知...前面");
  try {
   Object proceed = joinPoint.proceed();
  } catch (Throwable throwable) {
   throwable.printStackTrace();
  }
  System.out.println("环绕通知...后面");
 }*/
 @AfterThrowing(value="pt()",throwing = "e")
 public  void throwing(JoinPoint joinPoint,Exception e){
  /**
   * 异常通知
   * JoinPoint:代表当前拦截的方法对象，使用该对象可以获取拦截方法的信息（例如：类名，方法名，方法参数等）
   * Throwable e： 该变量为目标方法传递过来的异常对象，里面包含异常信息
   */
  System.out.println("异常通知");
  System.out.println("异常通知"+e.getMessage());
  System.out.println("代理对象类型："+joinPoint.getThis().getClass());
  System.out.println("拦截的方法名称："+joinPoint.getSignature().getName());
  System.out.println("拦截方法的参数列表："+ Arrays.asList(joinPoint.getArgs()));
 }
 @After("pt()")
 public void  afterFinal(){
  System.out.println("最终通知");
 }
}
