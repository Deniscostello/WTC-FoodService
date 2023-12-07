package ie.atu.wtcfoodservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {

    @GetMapping("food/getAllfood")
    public Food getAllFood(@RequestBody Food food){
        return food;
    }
}
