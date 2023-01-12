package com.example.adapter.repository;

import com.example.domain.entity.po.PersonPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao extends JpaRepository<PersonPO, String> {

}
