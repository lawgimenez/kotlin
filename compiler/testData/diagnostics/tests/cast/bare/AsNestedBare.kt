// RUN_PIPELINE_TILL: FRONTEND
// FIR_IDENTICAL
interface Tr
interface G<T>

fun test(tr: Tr): Any {
    return tr as G<<!WRONG_NUMBER_OF_TYPE_ARGUMENTS!>G<!>>
}

fun test1(tr: Tr): Any {
    return tr as <!WRONG_NUMBER_OF_TYPE_ARGUMENTS!>G<!>.(<!WRONG_NUMBER_OF_TYPE_ARGUMENTS!>G<!>) -> <!WRONG_NUMBER_OF_TYPE_ARGUMENTS!>G<!>
}

/* GENERATED_FIR_TAGS: asExpression, functionDeclaration, functionalType, interfaceDeclaration, nullableType,
typeParameter, typeWithExtension */
