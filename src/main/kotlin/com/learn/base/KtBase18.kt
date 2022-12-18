package com.learn.base


// TODO 18.Kotlin语言的具名函数参数
fun main() {
    loginAction(age = 88, username = "ZhangShan", phoneNumber = "12345678901", pwd = "admin")
}

private fun loginAction(username: String,pwd: String, phoneNumber: String, age: Int) : Int {
    println("username:$username,pwd:$pwd,age:$age,phoneNumber:$phoneNumber")
    return 200
}