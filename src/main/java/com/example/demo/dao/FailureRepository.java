package com.example.demo.dao;

import com.example.demo.entity.Failure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FailureRepository extends JpaRepository<Failure, Integer> {
	void deleteFailureByDeviceId(@Param("deviceId") Integer deviceId);
}
