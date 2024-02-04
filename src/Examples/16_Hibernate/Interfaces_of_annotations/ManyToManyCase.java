package Interfaces_of_annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
public @interface ManyToManyCase {
    String autor() default "?";

}
