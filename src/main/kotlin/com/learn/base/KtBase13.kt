package com.learn.base


// TODO 13.Kotlin语言的range表达式
fun main() {
    val score = 299
    if (score in 10 .. 59) {
        println("不及格")
    } else if (score in 0 .. 10) {
        println("不及格并且分数很差")
    } else if (score in 60 .. 100) {
        println("合格")
    } else if (score !in 0 .. 100) {
        println("分数不在0到100范围内了")
    }
}