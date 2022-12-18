package com.learn.base

// TODO 25.kotlin语言的函数参数学习

fun main(args: Array<String>) {
    val methodAction : (number1: Int, number2: Int, number3: Int) -> String
    methodAction = {number1,number2,number3->
        "参数一：$number1,参数二：$number2,参数三：$number3"
    }
    println(methodAction(11,22,33))
}