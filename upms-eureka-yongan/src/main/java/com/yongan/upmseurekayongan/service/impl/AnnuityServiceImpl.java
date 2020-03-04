package com.yongan.upmseurekayongan.service.impl;

import com.yongan.upmseurekayongan.entity.Annuity;
import com.yongan.upmseurekayongan.mapper.AnnuityMapper;
import com.yongan.upmseurekayongan.service.AnnuityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnuityServiceImpl implements AnnuityService {

    @Autowired
    private AnnuityMapper annuityMapper;

    @Override
    public List<Annuity> annuitylist() {
        return annuityMapper.annuitylist();
    }
}
