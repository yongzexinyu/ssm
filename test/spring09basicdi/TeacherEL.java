package spring09basicdi;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

//spring el表达式
public class TeacherEL {

    private String name;
    private  int age;
    private String friendName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public String getLoverName() {
        return loverName;
    }

    public void setLoverName(String loverName) {
        this.loverName = loverName;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    private String loverName;

    @Override
    public String toString() {
        return "TeacherEL{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friendName='" + friendName + '\'' +
                ", loverName='" + loverName + '\'' +
                ", db='" + db + '\'' +
                ", score=" + score +
                '}';
    }

    private String db;//没有用到db.properties
    private Double score;


}
