package io.github.sof3.j2mlog.compiler.error

import soot.SootMethod
import soot.Unit

class UnsupportedOperationError(unit: Unit, method: SootMethod, type: String) :
    CompileError(unit, method, "$type cannot be transpiled into Mindustry logic")
