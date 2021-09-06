package com.farm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farm.model.FarmingTips;

@Repository
public interface FarmingTipsRepository extends JpaRepository<FarmingTips, Integer> {

}
