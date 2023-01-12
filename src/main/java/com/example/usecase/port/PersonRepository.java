package com.example.usecase.port;

import com.example.domain.entity.po.PersonPO;

public interface PersonRepository {

    void insert(PersonPO personPO);

    void update(PersonPO personPO);

    PersonPO findById(String id);

}
