// !LANGUAGE: +ProhibitExhaustiveWhensOnNonTrivialConstBooleanExpressions
/*
 * KOTLIN DIAGNOSTICS SPEC TEST (NEGATIVE)
 *
 * SPEC VERSION: 0.1-313
 * PRIMARY LINKS: expressions, when-expression -> paragraph 5 -> sentence 1
 * expressions, when-expression, exhaustive-when-expressions -> paragraph 2 -> sentence 3
 * expressions, when-expression, exhaustive-when-expressions -> paragraph 2 -> sentence 4
 * expressions, when-expression, exhaustive-when-expressions -> paragraph 2 -> sentence 5
 */

// See also: KT-3743
fun foo(arg: Boolean): String {
    // Must be exhaustive
    return when(arg) {
        <!NON_TRIVIAL_BOOLEAN_CONSTANT_IN_EXHAUSTIVE_WHEN_CONDITION!>2 == 2<!> -> "truth"
        <!NON_TRIVIAL_BOOLEAN_CONSTANT_IN_EXHAUSTIVE_WHEN_CONDITION!>2 == 1<!> -> "falsehood"
    }
}
