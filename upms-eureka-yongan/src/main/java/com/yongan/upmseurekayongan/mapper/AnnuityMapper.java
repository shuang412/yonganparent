package com.yongan.upmseurekayongan.mapper;

import com.yongan.upmseurekayongan.entity.Annuity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AnnuityMapper {

    //养老保险信息展示
    List<Annuity> annuitylist();
}
