package com.learn.base


// TODO 15.Kotlin语言的String模板
fun main() {
    val garden = "黄石公园"
    val time = 6
    // 如果表达式需要和字符串紧挨着，需要用大括号：如${garden},否则$time 空格
    println("今天天气不错，去${garden}玩，玩了$time 小时")

    val isLogin = false
    println("Server Response Result: ${if (isLogin) "恭喜你，登录成功" else "登录失败，请检查"}")
}