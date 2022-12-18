package com.learn.base

// TODO 20.Kotlin语言的Nothing类型特点
fun main() {
    show(65)
    show(-1)
    show(90)
}

private fun show(number: Int) {
    when(number) {
        -1 -> TODO("没有这种分数")// 可以终止行为执行下去，抛出一个异常
        in 0..59 -> println("分数不及格")
        in 60..70 -> println("分数勉强及格")
        in 71..100 -> println("分数还不错")
    }
}