package com.learn.base

// TODO 12.Kotlin语言的应用类型学习
// Java语言有两种数据类型：
// 1：基本类型： int、double、char、boolean等
// 2：引用类型：Integer、Double、Character、Boolean等

// Kotling语言只有一种数据类型：
// 看起来都是引用类型，实际上编译器会在Java字节码中，修改成“基本类型”
fun main() {
    var age : Int = 99
    var pi : Double = 3.14159
    var c : Char = 'C'
    var isOk : Boolean = false
}