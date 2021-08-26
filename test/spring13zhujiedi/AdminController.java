package spring13zhujiedi;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class AdminController {
    //controller层依赖了service层
    @Resource
    private  AdminService adminService;//接口的调用
    public  void selectAll(){
       adminService.selectAll();
    }
}
