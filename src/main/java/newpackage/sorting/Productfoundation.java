package newpackage.sorting;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Productfoundation implements Comparator<Productfoundation> {


    private String productId;
    private String productName;

    @Override
    public String toString() {
        return "Productfoundation{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public int compare(Productfoundation o1, Productfoundation o2) {

        if(o1.getProductId().length()>o2.getProductId().length()) {
            return 1;
        } else if(o1.getProductId().length() == o2.getProductId().length()) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {


        List<Productfoundation> list = new ArrayList<>();
        Productfoundation productfoundation =new  Productfoundation("2","Apple");
        Productfoundation productfoundation2 =new  Productfoundation("99393","Apple");
        Productfoundation productfoundation3 =new  Productfoundation("33","Apple");
        Productfoundation productfoundation4 =new  Productfoundation("3223232","Apple");
        list.add(productfoundation);
        list.add(productfoundation2);
        list.add(productfoundation3);
        list.add(productfoundation4);

        Collections.sort(list, new Productfoundation());

        System.out.println(list);

    }
}
