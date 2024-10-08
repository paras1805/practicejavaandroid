package com.test.kotlinpractice.kotlin_language.kotlin_basics

class N_HighOrderFunctions {
}

//https://www.youtube.com/watch?v=ZZuPgOhgQHc

//Higher Order Functions and Lambdas
//We can store func in variable.
//We can pass func as arguments to other funcs.
//We can also return func from other func.

fun <T> findElementA(array: Array<T>, element: T, foundElement: (index: Int, element: T?) -> Unit) {
    for (i in array.indices) {
        if (array[i] == element) {
            foundElement(i, array[i])
            return
        }
    }
    foundElement(0, null)
    return
}

fun main() {

    // Represent : Higher Order Function : A language supports higher-order functions if its functions can accept other
    // functions as arguments and produce functions as return values.
    // If callback is the last arguements then we can take out lambda outside of () brackets. This process called Trailing lambda.
    /*findElementA(arrayOf(1,2,3,4,5,6), 3, { index, element ->

    })*/


    // Trailed lambda
    findElementA(arrayOf(1, 2, 3, 4, 5, 6), 3) { index, element ->
        println("Index $index")
        println("Element $element")
    }
    findElementA(arrayOf("1", "2", "3", "4", "5", "6"), "3") { index, element ->
        println("Index $index")
        println("Element $element")
    }
}