package j2mlog.intrinsics;

/**
 * Intrinsics provided by the compiler.
 */
public class Intrinsics {
    /**
     * Executes an assembly statement.
     * @param literalCommand the name of the command
     * @param params parameters after the command
     * @return null, or the value assigned to <code>returnRegister</code> if it is passed as a parameter.
     */
    @Unsafe
    public static native Object line(@Literal String literalCommand, Object... params);

    /**
     * Passes the string literal as-is as a variable name,
     * or as a subcommand to {@link #line}.
     * The returned expression is defined to be represented as-is even over assignments or method invocations,
     * unless it has been used as an lvalue.
     */
    @Unsafe
    public static native Object value(@Literal String literalExpression);

    /**
     * A magic value to pass to `Unsafe.line()` to indicate that a dummy variable should be held
     * @return an object that must be directly passed to <code>Unsafe.line()</code>.
     *         Any other operations on the returned object are undefined behaviour.
     */
    @Unsafe
    public static native Object returnRegister();

    /**
     * Inserts a jump statement where the target is <code>diff</code> lines relative to the jump line.
     * For example, <code>relativeJump(1, "always", 0, 0)</code> is a no-op.
     */
    @Unsafe
    @FlowInterrupting
    public static native void relativeJump(@Literal int diff, @Literal String jumpCondition, Object operand1, Object operand2);
}
