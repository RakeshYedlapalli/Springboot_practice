package core.java.sorting.comparable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Items implements Comparable<Items>{

    private String itemId;
    private BigDecimal itemPrice;
    private int barcode;


    @Override
    public int compareTo(Items o) {
        return itemId.compareTo(o.itemId);
    }


    public String update(){
        System.out.println("Updated");
        return "Updatted ";
    }
}
