// RUN_PIPELINE_TILL: BACKEND
// FIR_IDENTICAL
// DIAGNOSTICS: -UNUSED_PARAMETER
@Target(AnnotationTarget.EXPRESSION)
@Retention(AnnotationRetention.SOURCE)
@Repeatable
annotation class Ann

fun <T> bar(block: (T) -> Int) {}

fun foo() {
    bar<Int> @Ann @[Ann] { x -> x }
    bar<Int> @Ann @[Ann] label@{ x -> x }
}

/* GENERATED_FIR_TAGS: annotationDeclaration, functionDeclaration, functionalType, lambdaLiteral, nullableType,
typeParameter */
