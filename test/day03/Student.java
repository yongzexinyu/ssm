package day03;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

import javax.ws.rs.Encoded;


@Component


public class Student {

    @Value("#{stu.name}")
    private  String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
@Value("#{stu.age}")
    private  String age;
}
