package j2mlog;

import j2mlog.intrinsics.Intrinsics;
import j2mlog.intrinsics.Literal;
import org.jetbrains.annotations.Nullable;

public class Links {
    @Nullable
    @FixedInstructions
    public static Building get(int linkNo) {
        return (Building) Intrinsics.line("getlink", Intrinsics.returnRegister());

    }

    @Nullable
    public static Building byName(@Literal String literalName) {
        return (Building) Intrinsics.value(literalName);
    }

    /**
     * Returns the number of links.
     */
    @FixedInstructions
    public static int count() {
        return (int) Intrinsics.value("@links");
    }
}
