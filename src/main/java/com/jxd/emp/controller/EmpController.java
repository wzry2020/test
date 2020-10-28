package com.jxd.emp.controller;

import com.jxd.emp.model.Dept;
import com.jxd.emp.model.Emp;
import com.jxd.emp.service.IDeptService;
import com.jxd.emp.service.IEmpservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName EmpController
 * @Description TODO
 * @Author caibaobiao
 * @Date 2020/10/22
 * @Version 1.0
 */
@Controller
public class EmpController {
    @Value("${name}")
    private String name;

    @Value("${student.sname}")
    private String sname;

    @Value("${persons[0].pname}")
    private String pname;

    @Autowired
    private IEmpservice empservice;

    @Autowired
    private IDeptService deptService;



    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println(name);
        System.out.println(sname);
        System.out.println(pname);
        return "hello springboot!!热部署测试";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "hello springboot!!热部署测试2";
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Emp> getAll(){
        return empservice.getAll();
    }


    @RequestMapping("/getDept")
    @ResponseBody
    public List<Dept> getDept(){
        //创建条件构造器对象
        //Wrapper<Dept> wrapper = new AbstractWrapper<>() {}

        return deptService.list();
    }

    @RequestMapping("/helloBtl")
    public String helloBtl(Model model){
        model.addAttribute("msg","Hello Btl");
        return "hello.btl";
    }

    @RequestMapping("/helloBtl02")
    public String helloBtl02(Model model){
        model.addAttribute("msg","HTML模板文件");
        return "hello02.html";
    }

    @RequestMapping("/welcome")
    public String welcome(Model model){
        model.addAttribute("msg","改变了模板位置");
        List<Dept> list = deptService.list();
        model.addAttribute("list",list);
        return "welcome.html";
    }

    @RequestMapping("/login/{uname}/{pwd}")
    @ResponseBody
    public String login(@PathVariable("uname") String uname,@PathVariable("pwd") String pwd){
        if ("admin".equals(uname) && "123".equals(pwd)){
            return "success";
        }else {
            return "error";
        }
    }

}
