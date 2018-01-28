package Anotations;

import java.lang.annotation.*;

@Target(ElementType.TYPE) // TYPE - for class, interface, enum
@Inherited
@Retention(RetentionPolicy.RUNTIME)

public @interface Anotation {
}
