// RUN_PIPELINE_TILL: BACKEND
// KT-2225 Object expression delegation parameter should be checked with data flow info

interface A {
    fun foo() : Int
}

class B : A {
    override fun foo() = 10
}
fun foo(b: B?) : Int {
    if (b == null) return 0
    val o = object : A by b { //no info about b not null check
    }
    return o.foo()
}

/* GENERATED_FIR_TAGS: anonymousObjectExpression, classDeclaration, equalityExpression, functionDeclaration,
ifExpression, inheritanceDelegation, integerLiteral, interfaceDeclaration, localProperty, nullableType, override,
propertyDeclaration, smartcast */
