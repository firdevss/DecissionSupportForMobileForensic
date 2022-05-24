package com.example.demo.dao;

import com.example.demo.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelRepository extends JpaRepository<Model, Integer> {
   @Query(value = "SELECT * FROM phonedb.MODEL WHERE BRAND_ID = :brandId", nativeQuery = true)
   List<Model> getModelByBrandId(@Param("brandId") Long brandId);

   @Query(value = "SELECT M.NAME FROM phonedb.model AS M WHERE M.ID = :modelId", nativeQuery = true)
   String getModelNameById(@Param("modelId") Integer modelId);

}
