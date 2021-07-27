package com.thanhvan.apiresponse.domain.service.fruit;
import com.thanhvan.apiresponse.domain.model.Fruit;
import com.thanhvan.apiresponse.domain.repository.fruit.FruitRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;
@Slf4j
@Transactional
@Service
public class FruitServiceImpl implements FruitService {
    @Inject
    FruitRepository fruitRepository;

    @Override
    public List<Fruit> findAllFruitsByCategoryId(String categoryId) {
        categoryId = "C1";
        List<Fruit> fruits = fruitRepository.findFruitsByCategoryId(categoryId);
        return fruits;
    }

    @Override
    public Fruit findOne(String id) {
        Fruit fruit = fruitRepository.findOne(id);
        return fruit;
    }
}
