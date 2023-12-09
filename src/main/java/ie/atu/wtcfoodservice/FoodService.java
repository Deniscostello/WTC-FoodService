package ie.atu.wtcfoodservice;

import org.springframework.stereotype.Service;

@Service
public class FoodService {
    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }


    public Food getFoods(){
        Food newFood = new Food("Apple", "ImageURL");
        return newFood;

    }

}
