package day05aopban;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class VideoAspect {
    public static void  beforeMsg(){
        System.out.println("插播广告");
    }
    public  static void  afterMsg(){
        System.out.println("亲，办理会员可以看vip");
    }
    public  void roundMsg(ProceedingJoinPoint pj){
        //我是上面的
        System.out.println("验证一下");
        //目标方法
        try {
            Object proceed = pj.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        //我是下面的
        System.out.println("转账成功");
    }
    public  void  errorMsg(JoinPoint joinPoint, Exception e){
        System.out.println("视频已失踪,推荐您看其他同类视频, 并给管理员的邮箱发 异常信息.");
    }
}
