// NO_COMMON_FILES
// MODULE: lib
// FILE: lib.kt
fun foo(x: String) = "foo($x)"

inline fun bar(x: String) = "bar(${foo(x)})"

inline fun baz(x: String) = "baz(${foo(x)})"

// MODULE: main(lib)
// FILE: a.kt
fun test1() = bar("q")

// FILE: b.kt
// RECOMPILE
fun test2() = baz("w")

// FILE: main.kt
// RECOMPILE
fun box(): String {
    val a = test1()
    if (a != "bar(foo(q))") return "fail1: $a"

    val b = test2()
    if (b != "baz(foo(w))") return "fail2: $b"

    return "OK"
}
