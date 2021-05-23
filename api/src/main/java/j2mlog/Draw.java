package j2mlog;

import j2mlog.intrinsics.Intrinsics;

public class Draw {
    @FixedInstructions
    public static void clear(int r, int g, int b) {
        Intrinsics.line("draw", Intrinsics.value("clear"), r, g, b, 0, 0, 0);
    }

    @FixedInstructions
    public static void setColor(int r, int g, int b, int a) {
        Intrinsics.line("draw", Intrinsics.value("color"), r, g, b, a, 0, 0);
    }

    @FixedInstructions
    public static void setStroke(int width) {
        Intrinsics.line("draw", Intrinsics.value("stroke"), width, 0, 0, 0, 0, 0);
    }

    @FixedInstructions
    public static void drawLine(int x1, int y1, int x2, int y2) {
        Intrinsics.line("draw", Intrinsics.value("line"), x1, y1, x2, y2, 0, 0);
    }

    @FixedInstructions
    public static void fillRect(int x1, int y1, int width, int height) {
        Intrinsics.line("draw", Intrinsics.value("fillRect"), x1, y1, width, height, 0, 0);
    }

    @FixedInstructions
    public static void drawRect(int x1, int y1, int width, int height) {
        Intrinsics.line("draw", Intrinsics.value("drawRect"), x1, y1, width, height, 0, 0);
    }

    @FixedInstructions
    public static void fillPoly(int x, int y, int sides, int radius, int rotation) {
        Intrinsics.line("draw", Intrinsics.value("fillPoly"), x, y, sides, radius, rotation, 0);
    }

    @FixedInstructions
    public static void drawPoly(int x, int y, int sides, int radius, int rotation) {
        Intrinsics.line("draw", Intrinsics.value("drawPoly"), x, y, sides, radius, rotation, 0);
    }

    @FixedInstructions
    public static void fillTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        Intrinsics.line("draw", Intrinsics.value("fillTriangle"), x1, y1, x2, y2, x3, y3);
    }

    @FixedInstructions
    public static void drawImage(int x, int y, Object image, int size, int rotation) {
        Intrinsics.line("draw", Intrinsics.value("drawImage"), x, y, image, size, rotation, 0);
    }

    @FixedInstructions
    public static void flush(Building target) {
        Intrinsics.line("drawflush", target);
    }
}
