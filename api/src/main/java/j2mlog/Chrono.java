package j2mlog;

import j2mlog.intrinsics.Intrinsics;

/**
 * Time-related utilities
 */
public class Chrono {
    /**
     * Wait for an amount of time.
     *
     * The amount of time actually waited may be longer than the minimum possible,
     * with a maximum error of <code>2 / @ipt</code> ticks.
     *
     * @param seconds the number of seconds to sleep for.
     *                May be non-integer.
     */
    public static void sleep(float seconds) {
        double instructionsPerSecond = Processor.currentProcessorIpt() * 60.0;
        int instructionsToRun = (int) (instructionsPerSecond * seconds / 2.0);

        instructionsToRun = (int) Intrinsics.line("op", Intrinsics.value("sub"),
                Intrinsics.returnRegister(), instructionsToRun, 1);
        Intrinsics.relativeJump(-1, "greaterThan", instructionsToRun, 0);
    }
}
