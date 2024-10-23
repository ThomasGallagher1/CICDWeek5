package ie.atu.cicdweek5;


import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    private ProductService myProduct;

    public ProductController(ProductService myProduct) {
        this.myProduct = myProduct;
    }

    private List<ProductApp> myList = new ArrayList<>();
    @PostMapping("/newProduct")
    public List<ProductApp> newProduct(@Valid @RequestBody ProductApp product)
    {
        return myProduct.addProduct(product);
    }
    @PutMapping("{id}")
    public List<ProductApp> updateProduct(@PathVariable int id, @RequestBody ProductApp product)
    {
        return myProduct.putProduct(id, product);
    }

    @DeleteMapping("deleteProducts/{id}")
    public List<ProductApp> deleteProduct(@PathVariable int id)
    {
        return myProduct.deleteProduct(id);
    }

}
