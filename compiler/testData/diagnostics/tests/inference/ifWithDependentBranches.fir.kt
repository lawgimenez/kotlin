// RUN_PIPELINE_TILL: FRONTEND
// SKIP_TXT

interface Additional
interface A<T> : Additional

fun <U> aOf(): A<U> = TODO()

interface B<E>

fun <F> B<F>.convert(): A<F> = TODO()

fun foo1(x: B<String>): Any {
    return if (x.hashCode() == 0) aOf() else x.convert()
}

fun foo2(x: B<String>): Additional {
    return if (x.hashCode() == 0) <!CANNOT_INFER_PARAMETER_TYPE!>aOf<!>() else x.convert()
}

fun foo3(x: B<String>): Any {
    return when {
        x.hashCode() == 0 -> aOf()
        else -> x.convert()
    }
}

fun foo4(x: B<String>): Additional {
    return when {
        x.hashCode() == 0 -> <!CANNOT_INFER_PARAMETER_TYPE!>aOf<!>()
        else -> x.convert()
    }
}

fun foo5(x: B<String>): Any {
    return if (x.hashCode() == 0) {
        aOf()
    } else {
        x.convert()
    }
}

fun foo6(x: B<String>): Additional {
    return if (x.hashCode() == 0) {
        <!CANNOT_INFER_PARAMETER_TYPE!>aOf<!>()
    } else {
        x.convert()
    }
}

fun foo7(x: B<String>): Any {
    return when {
        x.hashCode() == 0 -> { aOf() }
        else -> { x.convert() }
    }
}

fun foo8(x: B<String>): Additional {
    return when {
        x.hashCode() == 0 -> { <!CANNOT_INFER_PARAMETER_TYPE!>aOf<!>() }
        else -> { x.convert() }
    }
}

/* GENERATED_FIR_TAGS: equalityExpression, funWithExtensionReceiver, functionDeclaration, ifExpression, integerLiteral,
interfaceDeclaration, nullableType, typeParameter, whenExpression */
