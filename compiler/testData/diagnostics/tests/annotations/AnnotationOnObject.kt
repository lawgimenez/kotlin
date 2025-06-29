// RUN_PIPELINE_TILL: BACKEND
// FIR_IDENTICAL
package test

annotation class A(val a: Int = 12, val b: String = "Test", val c: String)

@A(a = 12, c = "Hello")
object SomeObject

/* GENERATED_FIR_TAGS: annotationDeclaration, integerLiteral, objectDeclaration, primaryConstructor, propertyDeclaration,
stringLiteral */
