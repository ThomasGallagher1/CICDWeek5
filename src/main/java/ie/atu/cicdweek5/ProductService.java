package ie.atu.cicdweek5;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<ProductApp> myList = new ArrayList<>();
    public List<ProductApp> addProduct(ProductApp product){
        // imagine we have a connection to a database
        myList.add(product);
        return myList;
    }
}
