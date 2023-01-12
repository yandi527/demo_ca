package com.example.domain.entity;

import com.example.domain.entity.valueobject.PersonStatus;
import lombok.Data;

import java.util.Date;

@Data
public class Person {

    String personId;
    String personName;
    Date createTime;
    Date lastModifyTime;
    PersonStatus status;

    public Person disable(){
        this.lastModifyTime = new Date();
        this.status = PersonStatus.DISABLE;
        return this;
    }
}
