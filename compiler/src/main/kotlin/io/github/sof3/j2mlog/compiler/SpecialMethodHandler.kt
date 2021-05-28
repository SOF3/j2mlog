package io.github.sof3.j2mlog.compiler

interface SpecialMethodHandler {
    companion object {
        val map: Map<Pair<String, String>, SpecialMethodHandler>

        init {
            fun method(clazz: String, method: String) = clazz to method

            map = mapOf(
                method("java.lang.Math", "sqrt") to Operation("sqrt", 0)
            )
        }
    }

    class Operation(val name: String, vararg val args: Int) : SpecialMethodHandler
}
