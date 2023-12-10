package ie.atu.wtcfoodservice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }


    public List<Food> getFoods(){
        return foodRepository.findAll();
    }

}
