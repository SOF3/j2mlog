package j2mlog;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Methods with this annotation are defined to have a fixed number of instructions,
 * represented by the {@link #value()} integer.
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface FixedInstructions {
    /**
     * The number of instructions used in the method.
     */
    int value() default 1;
}
