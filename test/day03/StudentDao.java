package day03;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
    public void insertStudent(){
        System.out.println("我是添加的方法");
    }
    public  void  deleteStudent(){
        System.out.println("我是删除的方法");
    }
    public  void  updateStudent(){
        System.out.println("我是修改的方法");
    }
    public  void  selectAll(){
        System.out.println("我是全查的方法");
    }
}
