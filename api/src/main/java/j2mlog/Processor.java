package j2mlog;

import j2mlog.intrinsics.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class Processor {
    /**
     * Returns the building representing the current processor
     */
    @NotNull
    public static Building currentProcessor() {
        return (Building) Intrinsics.value("@this");
    }

    /**
     * Returns the X-coordinate of the current processor
     */
    public static int currentProcessorX() {
        return (int) Intrinsics.value("@thisx");
    }

    /**
     * Returns the Y-coordinate of the current processor
     */
    public static int currentProcessorY() {
        return (int) Intrinsics.value("@thisy");
    }

    /**
     * Number of instructions executed by the current processor
     */
    public static int currentProcessorIpt() {
        return (int) Intrinsics.value("@ipt");
    }
}
