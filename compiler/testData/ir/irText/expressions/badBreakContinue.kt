// IGNORE_ERRORS
// IGNORE_FIR_DIAGNOSTICS
// DIAGNOSTICS: -BREAK_OR_CONTINUE_OUTSIDE_A_LOOP -NOT_A_LOOP_LABEL -UNRESOLVED_REFERENCE -BREAK_OR_CONTINUE_JUMPS_ACROSS_FUNCTION_BOUNDARY
// IGNORE_BACKEND_K1: JS_IR
// ^^^ K1/JS fails in psi2ir: LoopExpressionGenerator
// RUN_PIPELINE_TILL: FIR2IR
// DISABLE_NEXT_PHASE_SUGGESTION: different pipelines fail differently:
// - K2/JS does not fail
// - NATIVE fails during IR deserialization
// - JVM_IR fails during code generation

fun test1() {
    break
    continue
}

fun test2() {
    L1@ while (true) {
        break@ERROR
        continue@ERROR
    }
}

fun test3() {
    L1@ while (true) {
        val lambda = {
            break@L1
            continue@L1
        }
    }
}

fun test4() {
    while (break) {}
    while (continue) {}
}
