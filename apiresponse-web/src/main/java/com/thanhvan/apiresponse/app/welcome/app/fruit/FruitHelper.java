package com.thanhvan.apiresponse.app.welcome.app.fruit;

import com.thanhvan.apiresponse.domain.model.Fruit;
import com.thanhvan.apiresponse.domain.service.fruit.FruitService;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.List;

@Component
public class FruitHelper {
    @Inject
    FruitService fruitService;

    public List<Fruit>list(String categoryId) {
        List<Fruit> fruits =  fruitService.findAllFruitsByCategoryId(categoryId);
        return fruits;
    }
}
