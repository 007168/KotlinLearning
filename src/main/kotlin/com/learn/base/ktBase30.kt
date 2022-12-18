package com.learn.base

// TODO 30.kotlin语言的简略写法学习

fun main(args: Array<String>) {
//    方式一
    doLogin("123456","67890") { resMsg: String, stateCode: Int ->
        println("响应结果:$resMsg,stateCode:$stateCode")
    }
//    方式二
    doLogin("username","admin", saveResLogFun = {resMsg : String,stateCode : Int ->
        println("打印响应结果:$resMsg,stateCode:$stateCode")
    })
//    方式三
    doLogin("username","admin") {resMsg : String,stateCode : Int ->
        println("结果出来了，msg:$resMsg,stateCode:$stateCode")
    }
}

const val DB_USERNAME_30 = "username"
const val DB_PWD_30 = "admin"

private fun doLogin(username : String, pwd: String, saveResLogFun : (String,Int) -> Unit) {
    if (DB_USERNAME_30 == username && DB_PWD_30 == pwd) {
        val resMsg = "登录成功"
        saveResLogFun(resMsg, 200)
    } else {
        val resMsg = "登录失败"
        saveResLogFun(resMsg, 400)
    }
}
