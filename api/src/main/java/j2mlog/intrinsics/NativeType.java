package j2mlog.intrinsics;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Types with this annotation represent a corresponding mlog type.
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface NativeType {
}
