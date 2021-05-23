package j2mlog;

import j2mlog.intrinsics.Intrinsics;

public class Print {
    /**
     * Appends a string to append to the global print buffer.
     * @param object the object to append
     */
    @Inline
    public static void print(Object object) {
        Intrinsics.line("print", object);
    }

    /**
     * Clears the target message building,
     * writes the global print buffer to the target message building
     * and clears the global print buffer.
     *
     * @param target the message building to print to.
     *               It is common to just use <code>Links.byName("message1")</code> here.
     */
    @Inline
    public static void flush(Building target) {
        Intrinsics.line("printflush", target);
    }
}
