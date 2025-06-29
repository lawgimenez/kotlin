// RUN_PIPELINE_TILL: BACKEND
// FIR_IDENTICAL
// LANGUAGE: +ContextReceivers
// WITH_STDLIB

fun testLabels(source: Collection<String>) {
    val r = buildList {
        source.mapTo(this@buildList) { it.length }
    }
}

/* GENERATED_FIR_TAGS: functionDeclaration, lambdaLiteral, localProperty, propertyDeclaration, thisExpression */
