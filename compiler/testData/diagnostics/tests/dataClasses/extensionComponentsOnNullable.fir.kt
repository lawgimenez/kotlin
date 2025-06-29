// RUN_PIPELINE_TILL: FRONTEND
class Data<T>(val x: T, val y: T)

operator fun <T> Data<T>.component1() = x

operator fun <T> Data<T>.component2() = y

fun foo(): Int {
    val d: Data<Int>? = null
    // An error must be here
    val (x, y) = <!COMPONENT_FUNCTION_ON_NULLABLE, COMPONENT_FUNCTION_ON_NULLABLE!>d<!>
    return x + y
}

data class NormalData<T>(val x: T, val y: T)

fun bar(): Int {
    val d: NormalData<Int>? = null
    // An error must be here
    val (x, y) = <!COMPONENT_FUNCTION_ON_NULLABLE, COMPONENT_FUNCTION_ON_NULLABLE!>d<!>
    return x + y
}

/* GENERATED_FIR_TAGS: additiveExpression, classDeclaration, data, destructuringDeclaration, funWithExtensionReceiver,
functionDeclaration, localProperty, nullableType, operator, primaryConstructor, propertyDeclaration, typeParameter */
