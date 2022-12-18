package com.learn.base


// TODO 19.Kotlin语言的Unit函数特点
fun main() {
    println(loginAction(age = 88, username = "ZhangShan", phoneNumber = "12345678901", pwd = "admin"))
    println(doWork("12345"))
    println(doWork2("上山打老虎"))
}

private fun loginAction(username: String,pwd: String, phoneNumber: String, age: Int){
    println("username:$username,pwd:$pwd,age:$age,phoneNumber:$phoneNumber")
}
// : Unit不写，默认也有，相当于是Java中的void
private fun doWork(info: String) : Unit {
    return println("doWork:$info")
}

private fun doWork2(info: String) {
    return println("doWork2:$info")
}