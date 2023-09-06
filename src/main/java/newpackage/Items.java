package newpackage;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Items {

    private String id;
    private String name;


//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null || getClass() != obj.getClass())
//            return false;
//
//        Items other = (Items) obj;
//
//        // Check for equality based on the fields
//        return Objects.equals(this.id, other.id) && Objects.equals(this.name, other.name);
//    }
//
//    @Override
//    public int hashCode() {
//        // Implement your custom hash code generation logic here
//        return Objects.hash(id, name);
//    }
}
