package j2mlog;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The "main" loop of a processor program.
 * The processor will keep running the contents of this main loop..
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface MainLoop {
}
