package io.github.sof3.j2mlog.compiler.error

import soot.SootMethod

/**
 * Represents a compile error.
 */
abstract class CompileError(val unit: soot.Unit, val method: SootMethod, val content: String) :
    Exception(
        "$content in method ${method.declaration}" +
                "on line ${unit.javaSourceStartLineNumber}:${unit.javaSourceStartColumnNumber}"
    )
