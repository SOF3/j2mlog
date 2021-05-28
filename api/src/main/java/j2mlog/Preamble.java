package j2mlog;

import j2mlog.intrinsics.Intrinsics;
import j2mlog.intrinsics.Literal;

public class Preamble {
    /**
     * Checks whether Preamble is missing.
     *
     * This method can be used in the following style:
     * <pre>
     * UnitType unitType;
     * if(Preamble.missing()) {
     *     // do stuff that only runs for once, e.g.
     *     unitType = Preamble.config("unitType", UnitType.FLARE);
     * }
     * </pre>
     */
    public static boolean missing(){
        boolean preamble = (boolean) Intrinsics.declareGlobal("__j2mlog_preamble");
        return !preamble;
    }

    @SuppressWarnings("unchecked")
    public static <T> T config(@Literal String name, T defaultValue) {
        return (T) Intrinsics.assignGlobal(name, defaultValue);
    }
}
