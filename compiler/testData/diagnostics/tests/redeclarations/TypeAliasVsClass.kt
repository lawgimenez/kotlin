// RUN_PIPELINE_TILL: FRONTEND
// DIAGNOSTICS: -UNUSED_VARIABLE -UNUSED_PARAMETER -TOPLEVEL_TYPEALIASES_ONLY -UNSUPPORTED_FEATURE
// FILE: file1.kt
class <!PACKAGE_OR_CLASSIFIER_REDECLARATION!>SomeClass<!>

typealias <!PACKAGE_OR_CLASSIFIER_REDECLARATION!>SomeClass<!> = Any
typealias <!PACKAGE_OR_CLASSIFIER_REDECLARATION!>SomeClass<!> = Any
typealias <!PACKAGE_OR_CLASSIFIER_REDECLARATION!>SomeClass<!> = Any

class Outer {
    class <!REDECLARATION!>Nested<!>

    typealias <!REDECLARATION!>Nested<!> = Any
    typealias <!REDECLARATION!>Nested<!> = Any
    typealias <!REDECLARATION!>Nested<!> = Any
}

// FILE: file2.kt
typealias <!PACKAGE_OR_CLASSIFIER_REDECLARATION!>SomeClass<!> = Any

/* GENERATED_FIR_TAGS: classDeclaration, nestedClass, typeAliasDeclaration */
