package core.java.collections.map;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Purchase implements  Comparable<Purchase>{

    private int id;
    private String itemName;
    private int purchasePrice;


    @Override
    public int compareTo(Purchase o) {
        return Integer.compare(o.getPurchasePrice(),this.purchasePrice);
    }
}
