// RUN_PIPELINE_TILL: BACKEND
// FIR_IDENTICAL
// DIAGNOSTICS: -UNUSED_PARAMETER -UNUSED_LAMBDA_EXPRESSION -VARIABLE_WITH_REDUNDANT_INITIALIZER -UNUSED_EXPRESSION

object Test {
    fun <T> foo(actual: T) {}
    fun <T : Number> foo(actual: T) {}
}

fun main() {
    var y: Number? = null
    y = 2
    { y = 1 }
    Test.foo(y)
}

/* GENERATED_FIR_TAGS: assignment, functionDeclaration, integerLiteral, lambdaLiteral, localProperty, nullableType,
objectDeclaration, propertyDeclaration, smartcast, typeConstraint, typeParameter */
