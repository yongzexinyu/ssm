package day05xmlban;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VideoTest {
    @Test
    public void  test01(){
        String xml= "day05xmlban/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(xml);
        VideoService videoService = ac.getBean("videoService", VideoService.class);
        videoService.boFang();
        System.out.println("=======================");
       videoService.zanTing();
        System.out.println("=======================");
        videoService.zhuanJinBi();
        System.out.println("=======================");
        videoService.noFindVideo();
    }
}
