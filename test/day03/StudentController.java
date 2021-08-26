package day03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {
    @Autowired
    private  StudentService studentService;
    public  void insertStudent(){
        studentService.insertStudent();
    }
    public  void  deleteStudent(){
        studentService.deleteStudent();
    }
    public  void  updateStudent(){
        studentService.updateStudent();
    }
    public  void  selectAll(){
        studentService.selectAll();
    }
}
