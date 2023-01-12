package com.example.domain.entity.po;

import com.example.domain.entity.valueobject.PersonStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "person")
@Getter
@Setter
public class PersonPO {

    @Id
    private String personId;
    private String personName;
    private Date createTime;
    private Date lastModifyTime;
    @Enumerated(EnumType.STRING)
    private PersonStatus status;
}
