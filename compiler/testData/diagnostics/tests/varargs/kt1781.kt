// RUN_PIPELINE_TILL: BACKEND
// FIR_IDENTICAL
// FILE: kotlin.kt
fun foo() {
  JavaClass()
  JavaClass("")
}

// FILE: JavaClass.java

public class JavaClass {
    public JavaClass() {  }

    public JavaClass(String... ss) {  }
}

/* GENERATED_FIR_TAGS: functionDeclaration, javaFunction, javaType, stringLiteral */
