package com.nf.usermanage.web;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.nf.usermanage.dao.UserDAO;
import com.nf.usermanage.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@CrossOrigin(origins = "*")
@Controller
public class UserController {

    @Autowired
    private UserDAO userDAO;

    //获取所有用户
    @RequestMapping(path = "/Users")
    @ResponseBody
    public List<Users> list() {
        return userDAO.findAll();
    }


    //获取单个用户
    @RequestMapping(value="/Users/{id}")
    @ResponseBody
    public Users getUser(@PathVariable("id") Long id) throws JsonProcessingException {
        return userDAO.getUsersById(id);
    }


    //删除用户
    @RequestMapping(value="/Delete/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteUser(@PathVariable("id") Long id) throws JsonProcessingException {
        userDAO.deleteById(id);
    }

   //添加用户
    @RequestMapping(value="/Add")
    @ResponseBody
    public void addUser(HttpServletRequest request) throws JsonProcessingException {

        String name = request.getParameter("name");
        Long phone = Long.parseLong(request.getParameter("phone"));
        String email = request.getParameter("email");
        String education = request.getParameter("education");
        String graduationschool = request.getParameter("graduationschool");
        String profession = request.getParameter("profession");
        String profile = request.getParameter("profile");

        Users user = new Users(name,phone,email,education,graduationschool,profession,profile);
        userDAO.save(user);

    }

    //编辑用户
    @RequestMapping(value="/Edit/{id}")
    @ResponseBody
    public void Edit(@PathVariable("id") Long id,HttpServletRequest request ) throws JsonProcessingException {

        String name = request.getParameter("name");
        Long phone = Long.parseLong(request.getParameter("phone"));
        String email = request.getParameter("email");
        String education = request.getParameter("education");
        String graduationschool = request.getParameter("graduationschool");
        String profession = request.getParameter("profession");
        String profile = request.getParameter("profile");
        Users user = new Users(id,name,phone,email,education,graduationschool,profession,profile);

        userDAO.save(user);

    }


}
