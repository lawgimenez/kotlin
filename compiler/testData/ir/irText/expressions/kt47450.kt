// FIR_IDENTICAL
// SKIP_KT_DUMP
// RUN_PIPELINE_TILL: FIR2IR
// DISABLE_NEXT_PHASE_SUGGESTION: Backend flackyly fails with stack overflow error for both K1 and K2

fun test(z: Int): String {
    return "" + z + "1" + z + "1" + z + "1" + z + "1" + z + "1" + z + "1" + z + "1" + z + "1" + z + "1" + z + "1" + z + "1" + z +
            "1" + z + "1" + z + "1" + z + "1" + z + "1" + z + "1" + z + "1" + z + "1" + z + "1" + z + "1" + z + "1" + z + "1" + z + "1" +
            z + "1" + z + "1" + z + "1" + z + "1" + z + "1" + z + "1" + z + "1" + z + "1" + z + "1" + z + "1" + z + "1" + z + "1" + z
}
