package om.az.api.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Products {

    private String name ;
    private Long price;
    private int amount;

}
