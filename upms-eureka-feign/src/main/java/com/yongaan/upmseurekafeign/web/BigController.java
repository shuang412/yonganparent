package com.yongaan.upmseurekafeign.web;

import com.yongaan.upmseurekafeign.service.AnnuityService;
import com.yongaan.upmseurekafeign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class BigController {

    @Autowired
    private UserService userService;

    @Autowired
    private AnnuityService annuityService;

    @RequestMapping("/userlist")
    public Object userlist(){
        return userService.userlist();
    }

    @RequestMapping("/annuitylist")
    public Object annuitylist(){
        return annuityService.annuitylist();
    }

}
