// RUN_PIPELINE_TILL: FRONTEND
// ISSUE: KT-62836
fun box() {
    useSuspendFunInt(<!ARGUMENT_TYPE_MISMATCH!>Test()<!>)
}

fun useSuspendFunInt(fn: suspend () -> String): String = ""

open class Test : () -> String? {
    override fun invoke() = "OK"
}

/* GENERATED_FIR_TAGS: classDeclaration, functionDeclaration, functionalType, nullableType, operator, override,
stringLiteral, suspend */
