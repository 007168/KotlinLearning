package com.learn.base


// TODO 16.Kotlin语言的函数头学习

// kotlin的函数头
// private     fun         methodName (age : Int, name : String) : Int {
// 默认public   函数声明关键字 函数名      (函数参数)                   : 返回类型
// }
fun main() {
  println(methodName(99, "张三"))
}

private fun methodName (age : Int, name : String) : Int {
    println("你的姓名是$name,你的年龄是:$age")
    return 200
}