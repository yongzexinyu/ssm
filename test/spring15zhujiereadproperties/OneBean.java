package spring15zhujiereadproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OneBean {
    @Value("#{prop.name}")
    private  String name;
    @Value("19")
    private int age;

    @Override
    public String toString() {
        return "OneBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
