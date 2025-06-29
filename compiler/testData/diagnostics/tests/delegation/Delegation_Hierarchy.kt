// RUN_PIPELINE_TILL: BACKEND
// FIR_IDENTICAL
interface A {
    fun foo() {}
}

open class B(a: A) : A by a

class C(a: A): B(a), A {
}

fun b(c: C) {
    c.foo();
}

/* GENERATED_FIR_TAGS: classDeclaration, functionDeclaration, inheritanceDelegation, interfaceDeclaration,
primaryConstructor */
