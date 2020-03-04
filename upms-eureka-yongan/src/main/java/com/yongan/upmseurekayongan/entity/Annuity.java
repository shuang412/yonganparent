package com.yongan.upmseurekayongan.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Annuity {

    private Integer persion_id;
    private String name;
    private String id_number;
    private Integer age;
    private String telephone;
    private String sex;
    private Date birthday;
    private String email;
    private Integer is_buy;
    private Integer kind_id;


}
