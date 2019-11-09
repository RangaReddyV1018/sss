package com.dbs.hack2hire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.hack2hire.entity.FIDEntity;

@Repository
public interface FIDRepository extends JpaRepository<FIDEntity, Long>{

}
