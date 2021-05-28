package j2mlog;

import j2mlog.intrinsics.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class Memory {
    @FixedInstructions
    public static int readInt(@NotNull Building building, int position) {
        return (int) Intrinsics.line("read", Intrinsics.returnRegister(), building, position);
    }

    @FixedInstructions
    public static double readDouble(@NotNull Building building, int position) {
        return (int) Intrinsics.line("read", Intrinsics.returnRegister(), building, position);
    }

    @FixedInstructions
    public static void writeInt(@NotNull Building building, int position, int value) {
        Intrinsics.line("write", value, building, position);
    }

    @FixedInstructions
    public static void writeDouble(@NotNull Building building, int position, double value) {
        Intrinsics.line("write", value, building, position);
    }
}
