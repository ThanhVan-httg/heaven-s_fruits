package com.thanhvan.apiresponse.domain.service.fruit;

import com.thanhvan.apiresponse.domain.model.Fruit;

import java.util.List;

public interface FruitService {

    List<Fruit> findAllFruitsByCategoryId(String categoryId);
    Fruit findOne(String id);
}
