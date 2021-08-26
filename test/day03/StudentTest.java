package day03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    @Test
    public  void test01(){
        String xml="day03/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(xml);
        StudentController student = ac.getBean("studentController", StudentController.class);
        student.insertStudent();
        student.deleteStudent();
        student.updateStudent();
        student.selectAll();

      //  System.out.println("student = " + student);
    }
    @Test
    public  void  test02(){
        String xml="day03/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(xml);
        Student student = ac.getBean("student", Student.class);

        System.out.println("student = " + student);
    }
}
