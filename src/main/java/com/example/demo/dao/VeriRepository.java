package com.example.demo.dao;

        import com.example.demo.entity.Veri;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.data.repository.query.Param;
        import org.springframework.stereotype.Repository;

        import java.util.List;

@Repository
public interface VeriRepository extends JpaRepository<Veri, Integer> {

    @Query("SELECT st FROM Veri st WHERE st.modelName = :modelName")
    List<Veri> getByModelName(@Param("modelName") String modelName);

    List<Veri> findVeriByBrandName(@Param("brandName") String brandName);

    @Query("SELECT st FROM Veri st WHERE st.brandName = :brandName")
    List<Veri> getVeriByBrandName(@Param("brandName") String brandName);

}