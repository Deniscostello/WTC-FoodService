package ie.atu.wtcfoodservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class FoodController {
    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }


    @GetMapping("food/getAllFood")
    public ResponseEntity<List<Food>> getAllFood(){
        return new ResponseEntity<List<Food>>(foodService.getFoods(), HttpStatus.OK);
    }
}
