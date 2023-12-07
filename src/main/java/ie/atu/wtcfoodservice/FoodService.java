package ie.atu.wtcfoodservice;

import org.springframework.stereotype.Service;

@Service
public class FoodService {

    public Food getFoods(){
        Food newFood = new Food("Apple", "ImageURL");
        return newFood;

    }

}
