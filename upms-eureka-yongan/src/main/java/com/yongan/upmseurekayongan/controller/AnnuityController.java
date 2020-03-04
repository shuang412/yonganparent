package com.yongan.upmseurekayongan.controller;

import com.yongan.upmseurekayongan.entity.Annuity;
import com.yongan.upmseurekayongan.service.AnnuityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnnuityController {

    @Autowired
    private AnnuityService annuityService;

    @RequestMapping("/rest/annuitylist")
    public List<Annuity> annuitylist(){
        return annuityService.annuitylist();
    }
}
