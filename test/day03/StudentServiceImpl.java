package day03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements  StudentService {
    @Autowired
    private  StudentDao studetnDao;
    @Override
    public void insertStudent() {
        studetnDao.insertStudent();
    }

    @Override
    public void deleteStudent() {
        studetnDao.deleteStudent();
    }

    @Override
    public void updateStudent() {
        studetnDao.updateStudent();
    }

    @Override
    public void selectAll() {
        studetnDao.selectAll();
    }
}
