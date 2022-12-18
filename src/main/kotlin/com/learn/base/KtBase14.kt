package com.learn.base


// TODO 14.Kotlin语言的when表达式
fun main() {
    val dayInWeek = 6
    val info = when(dayInWeek) {
        0 -> {
            println("咦，今天是星期0？")
        }
        1 -> "今天星期一"
        2 -> "今天星期二"
        3 -> "今天星期三"
        4 -> "今天星期四"
        5 -> "今天星期五"
        6 -> "今天星期六，休息"
        7 -> "今天星期七，今天休息，明天上班"
        else -> {
            println("额，不知道今天星期几了")
            // kotlin用unit对象代替了java中的void关键字
        }
    }
    println(info)
}