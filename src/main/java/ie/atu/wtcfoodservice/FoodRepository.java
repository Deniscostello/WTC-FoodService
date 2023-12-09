package ie.atu.wtcfoodservice;

import ie.atu.wtcfoodservice.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
