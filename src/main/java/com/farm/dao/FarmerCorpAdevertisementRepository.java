package com.farm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farm.model.FarmerCorpAdevertisement;

@Repository
public interface FarmerCorpAdevertisementRepository extends JpaRepository<FarmerCorpAdevertisement, Integer> {

}
