package ie.atu.wtcfoodservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class FoodController {
    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }


    @PostMapping("food/getAllFood")
    public ResponseEntity<Map<String, List<Food>>> getAllFood(){
        List<Food> foods = foodService.getFoods();
        System.out.println(foods);
        Map<String, List<Food>> response = new HashMap<>();
        response.put("foods", foods);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

}
