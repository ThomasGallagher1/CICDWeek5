package ie.atu.cicdweek5;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductApp {
    private int id;
    private String name;
    private double price;

}