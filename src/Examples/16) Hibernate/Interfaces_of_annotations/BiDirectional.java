package Interfaces_of_annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})
public @interface BiDirectional {
    String autor() default "Adept";
}
