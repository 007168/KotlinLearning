package com.learn.base


// TODO 17.Kotlin中函数参数的默认参数
fun main() {
    action01("张三", 99)
    action02("李四")
    action03()
    action03("王五",20)
}

private fun action01(name : String, age : Int) : Int {
    println("01你的姓名是$name,你的年龄是:$age")
    return 200
}
private fun action02(name : String, age : Int=98) : Int {
    println("02你的姓名是$name,你的年龄是:$age")
    return 200
}
private fun action03(name : String = "你好", age : Int=100) : Int {
    println("03你的姓名是$name,你的年龄是:$age")
    return 200
}