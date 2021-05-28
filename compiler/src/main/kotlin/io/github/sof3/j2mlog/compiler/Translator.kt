package io.github.sof3.j2mlog.compiler

import io.github.sof3.j2mlog.compiler.error.UnsupportedOperationError
import soot.jimple.*

class Translator(private val body: soot.Body) {
    init {
        scanUnits()
    }

    private fun scanUnits() {
        for (unit in body.units) {
            when (unit) {
                is ThrowStmt -> throw UnsupportedOperationError(unit, body.method, "throw statements")
                is ReturnStmt -> validateValue(unit, unit.op)
                is DefinitionStmt -> {
                    validateValue(unit, unit.leftOp)
                    validateValue(unit, unit.rightOp)
                }
                is IfStmt -> validateValue(unit, unit.condition)
                is SwitchStmt -> validateValue(unit, unit.key)
                is GotoStmt -> Unit
                is NopStmt, is BreakpointStmt -> Unit
                is MonitorStmt -> throw UnsupportedOperationError(unit, body.method, "synchronization operations")
                is PlaceholderStmt -> throw UnsupportedOperationException("idk what this is")
                is InvokeStmt -> validateValue(unit, unit.invokeExpr)
                else -> throw UnsupportedOperationException("idk what this is")
            }
        }
    }

    private fun validateValue(unit: soot.Unit, value: soot.Value) {
        when(value) {
            is ArrayRef, is NewArrayExpr, is NewMultiArrayExpr -> throw UnsupportedOperationError(unit, body.method, "array operations")
            is InterfaceInvokeExpr -> throw UnsupportedOperationError(unit, body.method, "interface invocations")
        }
    }
}
