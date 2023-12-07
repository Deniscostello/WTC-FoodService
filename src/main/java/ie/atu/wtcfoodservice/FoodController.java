package ie.atu.wtcfoodservice;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {
    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }


    @GetMapping("food/getAllFood")
    public ResponseEntity<?> getAllFood(){
        Food food=foodService.getFoods();
        return ResponseEntity.ok(food);
    }
}
