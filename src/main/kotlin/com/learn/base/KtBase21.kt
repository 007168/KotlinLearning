package com.learn.base


// TODO 201.Kotlin语言的反引号中函数特点
fun main() {
    // 第一种清空：处理Java与Kotlin中，关键字冲突的问题,如：将关键字in用作函数名
    `in`(65)
    // 函数名包含特殊字符的情况
    `判断分数在什么水平`(65)
}
private fun `in`(number: Int) {
    when(number) {
        in 0..59 -> println("分数在0到59之间")
        in 60..70 -> println("分数在60到70之间")
        in 71..100 -> println("分数在71到100之间")
    }
}
private fun `判断分数在什么水平`(number: Int) {
    when(number) {
        -1 -> TODO("没有这种分数")// 可以终止行为执行下去，抛出一个异常
        in 0..59 -> println("分数不及格")
        in 60..70 -> println("分数勉强及格")
        in 71..100 -> println("分数还不错")
    }
}