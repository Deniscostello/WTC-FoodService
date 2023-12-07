package ie.atu.wtcfoodservice;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Food {
    @NotBlank(message = "FoodName cannot not blank")
    private String foodName;

    @NotBlank(message = "Food Image cannot be blank")
    private String foodImage;


}
