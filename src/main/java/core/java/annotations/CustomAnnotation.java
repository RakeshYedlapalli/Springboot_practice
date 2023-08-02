package core.java.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE , ElementType.METHOD , ElementType.FIELD , ElementType.CONSTRUCTOR})
public @interface CustomAnnotation {

}
