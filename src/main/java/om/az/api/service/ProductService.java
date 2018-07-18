package om.az.api.service;

import om.az.api.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {


    public Product getProduct(Long id) {
        if(id == 2) {
            return new Product().name("cola").price(20).amount(1000);
        }
        return null;
    }
}
