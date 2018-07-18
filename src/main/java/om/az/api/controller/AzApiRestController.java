package om.az.api.controller;


import om.az.api.ProductApiDelegate;
import om.az.api.service.ProductService;
import om.az.api.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;


@Controller
public class AzApiRestController  implements ProductApiDelegate {

    @Autowired
    private ProductService productService;
    @Override
    public ResponseEntity<Product> getProduct(Long productID) {
        return new ResponseEntity<>(productService.getProduct(productID), HttpStatus.OK);
    }
}
