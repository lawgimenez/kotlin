// RUN_PIPELINE_TILL: FRONTEND
// FIR_IDENTICAL
// KT-50219

// FILE: Base.java
public class Base {
    protected String field;
    protected final String finalField = "finalFieldValue";
}

// FILE: test.kt
class Derived : Base() {
    fun foo() {
        if (field == null) {
            field.length
        }

        if (finalField == null) {
            finalField<!UNSAFE_CALL!>.<!>length
        }
    }
}

/* GENERATED_FIR_TAGS: classDeclaration, equalityExpression, flexibleType, functionDeclaration, ifExpression,
javaProperty, javaType, nullableType, smartcast */
