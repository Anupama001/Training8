package com.st.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.st.entity.TrainingCenter;

public interface TrainingRepository extends JpaRepository<TrainingCenter, Integer>{

}
