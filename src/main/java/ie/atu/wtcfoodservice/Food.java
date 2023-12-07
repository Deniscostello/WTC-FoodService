package ie.atu.wtcfoodservice;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Food {
    @NotBlank(message = "FoodName cannot not blank")
    private String foodName;

    @NotBlank(message = "Food Image cannot be blank")
    private String foodImage;


}
