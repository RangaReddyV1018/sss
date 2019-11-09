package com.dbs.hack2hire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.hack2hire.entity.MTDEntity;

@Repository
public interface MTDRepository extends JpaRepository<MTDEntity, Long>{

}
