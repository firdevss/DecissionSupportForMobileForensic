package com.example.demo.dao;

import com.example.demo.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {
  /*  @Query(value = "select * fROM ", nativeQuery = true)
    List<Brand> get();*/

    @Query(value = "SELECT B.NAME FROM phonedb.brand AS B WHERE B.ID = :brandId", nativeQuery = true)
    String getBrandNameById(@Param("brandId") Integer brandId);
}
