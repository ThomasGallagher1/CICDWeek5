package ie.atu.cicdweek5;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

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


    public List<ProductApp> putProduct(int id, ProductApp product)
    {
        for(int i = 0; i < myList.size(); i++){
            if(myList.get(i).getId() == id){
                myList.set(i, product);
            }
        }
        return myList;
    }


    public List<ProductApp> deleteProduct(int id)
    {
        for(int count = 0; count < myList.size(); count++){
            if(myList.get(count).getId() == id){
                myList.remove(count);
            }
        }
        return myList;
    }
}
