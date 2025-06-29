// RUN_PIPELINE_TILL: BACKEND
fun main(arg: Nothing?) {
    val flag = true
    consumeTicker(
        if (flag) null else { num -> num.dec() }
    )
    consumeTicker(
        select({ num -> num.dec() }, null)
    )
    consumeTicker(
        try { { num -> num.dec() } } catch (e: Exception) { null }
    )
    consumeTicker(
        <!DEBUG_INFO_CONSTANT!>arg<!> ?: { num -> num.dec() }
    )
    consumeTicker(
        if (!flag) ::tick else null
    )
    consumeTicker(
        select(::tick, null)
    )
    consumeTicker(
        select(if (flag) null else ::tick, null)
    )
    consumeTicker(
        // In fact ::tick is not used here
        try { null } finally { ::tick }
    )
    consumeTicker(
        try { null } catch (e: Exception) { null } catch (e: Throwable) { ::tick }
    )
    consumeTicker(
        <!DEBUG_INFO_CONSTANT!>arg<!> ?: ::tick
    )
}

fun tick(num: Int) {}

fun <T> select(a: T, b: T): T = a

fun consumeTicker(ticker: Ticker?) {

}

fun interface Ticker {
    fun tick(num: Int)
}

/* GENERATED_FIR_TAGS: callableReference, elvisExpression, funInterface, functionDeclaration, ifExpression,
interfaceDeclaration, lambdaLiteral, localProperty, nullableType, propertyDeclaration, samConversion, tryExpression,
typeParameter */
