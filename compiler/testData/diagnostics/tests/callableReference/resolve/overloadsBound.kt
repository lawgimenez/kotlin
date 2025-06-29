// RUN_PIPELINE_TILL: BACKEND
// FIR_IDENTICAL
// DIAGNOSTICS: -UNUSED_PARAMETER
// KT-12799 Bound callable references not resolved for overload

class C {
    fun xf1(){}
    fun xf1(s: String){}
}

fun foo(p: (String) -> Unit){}

fun bar(c: C) {
    foo(c::xf1)
}

/* GENERATED_FIR_TAGS: callableReference, classDeclaration, functionDeclaration, functionalType */
