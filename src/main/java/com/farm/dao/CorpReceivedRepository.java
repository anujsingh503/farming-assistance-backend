package com.farm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farm.model.Supplier_CorpReceived;


@Repository
public interface CorpReceivedRepository extends JpaRepository<Supplier_CorpReceived, Integer>{

}
