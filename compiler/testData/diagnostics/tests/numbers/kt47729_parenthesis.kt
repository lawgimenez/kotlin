// RUN_PIPELINE_TILL: BACKEND
// FIR_IDENTICAL
// ISSUE: Kt-47447, KT-47729

fun takeLong(x: Long) {}

object Foo {
    var longProperty: Long = 0

    infix fun infixOperator(x: Long) {}
}

// Should be ok in all places
fun test() {
    takeLong(1 + 1)
    takeLong((1 + 1))
    Foo.longProperty = 1 + 1
    Foo.longProperty = (1 + 1)
    Foo infixOperator 1 + 1
    Foo infixOperator (1 + 1)
}

/* GENERATED_FIR_TAGS: assignment, functionDeclaration, infix, integerLiteral, objectDeclaration, propertyDeclaration */
