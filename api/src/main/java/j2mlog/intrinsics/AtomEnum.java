package j2mlog.intrinsics;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Enums with this annotation are compiled into atoms with kebab-case name,
 * e.g. <code>BuildingType.BATTERY_LARGE</code> is compiled into <code>@battery-large</code>.
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface AtomEnum {
}
