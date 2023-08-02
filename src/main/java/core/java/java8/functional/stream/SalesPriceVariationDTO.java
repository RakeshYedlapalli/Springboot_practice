package core.java.java8.functional.stream;


import core.java.java8.functional.SalesPriceVariation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class SalesPriceVariationDTO {

    private String siCode;
    private double price;
    private double total;


    public static SalesPriceVariationDTO convert(SalesPriceVariation salesPriceVariation){
        SalesPriceVariationDTO salesPriceVariation1 = new SalesPriceVariationDTO();
        salesPriceVariation1.setPrice(salesPriceVariation.getPrice());
        salesPriceVariation1.setSiCode(salesPriceVariation.getSiCode());
        salesPriceVariation1.setTotal(salesPriceVariation.getTotal());

        return salesPriceVariation1;
    }
}
