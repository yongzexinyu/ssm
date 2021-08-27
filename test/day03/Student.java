package day03;

import net.sf.log4jdbc.Properties;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

import javax.ws.rs.Encoded;


@Component


public class Student {

    @Value("${name}")//  @Value("#{stu.name}")
    private  String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
@Value("${age}")//  @Value("#{stu.age}")
    private  String age;
}
