package spring13zhujiedi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
    //@Resource //相当于我们的xml中的注入   注解1:tomcat提供的 byName
    @Autowired  //注解2 spring提供的 多用这个sping体系    byType
    private  AdminDAO adminDAO;
    @Override
    public void selectAll() {
        //service层调用dao 层，service依赖了dao层
        adminDAO.selectAll();
    }
}
