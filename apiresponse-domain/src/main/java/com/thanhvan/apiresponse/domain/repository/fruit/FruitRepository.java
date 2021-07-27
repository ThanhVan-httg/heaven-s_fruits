package com.thanhvan.apiresponse.domain.repository.fruit;

import com.thanhvan.apiresponse.domain.model.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.LockModeType;
import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit , String> {
    @Query("SELECT f FROM Fruit f WHERE f.categoryId = :categoryId")
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    List<Fruit> findFruitsByCategoryId(@Param("categoryId") String categoryId);

    @Query("SELECT f FROM Fruit f WHERE f.id = :id")
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    Fruit findOne(@Param("id") String id);
}
