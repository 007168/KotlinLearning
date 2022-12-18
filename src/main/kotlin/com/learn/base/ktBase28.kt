package com.learn.base

// TODO 28.kotlin语言的lambda学习

fun main(args: Array<String>) {
    // 匿名函数 == lambda函数
    val add = {num1 : Int,num2 : Int ->
        "$num1 + $num2 = ${num1 + num2}"
    }
    println(add(99,33))

//    匿名函数 入参 Int,返回 Any类型
//    lambda表达式的参数 Int, lambda表达式的结果Any类型
    val weekDay = { dayInWeek : Int ->
        when(dayInWeek) {
            1 -> "星期一"
            2 -> "星期二"
            3 -> "星期三"
            4 -> "星期四"
            5 -> "星期五"
            6 -> "星期六"
            7 -> "星期七"
            else -> -1
        }
    }

    println(weekDay(1))
}

