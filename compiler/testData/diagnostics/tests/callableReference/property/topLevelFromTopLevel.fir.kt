// RUN_PIPELINE_TILL: FRONTEND
// CHECK_TYPE

import kotlin.reflect.*

var x: Int = 42
val y: String get() = "y"

fun testX() {
    val xx = ::x
    checkSubtype<KMutableProperty0<Int>>(xx)
    checkSubtype<KProperty0<Int>>(xx)
    checkSubtype<KMutableProperty<Int>>(xx)
    checkSubtype<KProperty<Int>>(xx)
    checkSubtype<KCallable<Int>>(xx)

    checkSubtype<String>(xx.name)
    checkSubtype<Int>(xx.get())
    xx.set(239)
}

fun testY() {
    val yy = ::y
    checkSubtype<KMutableProperty0<String>>(<!ARGUMENT_TYPE_MISMATCH!>yy<!>)
    checkSubtype<KProperty0<String>>(yy)
    checkSubtype<KMutableProperty<String>>(<!ARGUMENT_TYPE_MISMATCH!>yy<!>)
    checkSubtype<KProperty<String>>(yy)
    checkSubtype<KCallable<String>>(yy)

    checkSubtype<String>(yy.name)
    checkSubtype<String>(yy.get())
    yy.<!UNRESOLVED_REFERENCE!>set<!>("yy")
}

/* GENERATED_FIR_TAGS: callableReference, classDeclaration, funWithExtensionReceiver, functionDeclaration,
functionalType, getter, infix, integerLiteral, localProperty, nullableType, propertyDeclaration, stringLiteral,
typeParameter, typeWithExtension */
