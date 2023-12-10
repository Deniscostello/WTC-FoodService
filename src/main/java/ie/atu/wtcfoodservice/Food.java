package ie.atu.wtcfoodservice;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "foods")
@AllArgsConstructor
public class Food {
    @Id
    private ObjectId id;

    @NotBlank(message = "FoodName cannot not blank")
    private String foodName;

    @NotBlank(message = "Food Image cannot be blank")
    private String foodImage;

    @NotBlank(message = "prediction cannot be blank")
    private String prediction;


}
