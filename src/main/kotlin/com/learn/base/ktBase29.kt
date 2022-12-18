package com.learn.base

// TODO 29.在函数中定义参数时函数的函数

fun main(args: Array<String>) {
    val saveResLogFun = {resMsg : String,stateCode : Int ->
        println("响应结果:$resMsg,stateCode:$stateCode")
    }
    val saveResLogFun2 = {resMsg : String ->
        println("响应结果:$resMsg")
    }
    doLogin("123456","67890",saveResLogFun)
    doLogin("username","admin",saveResLogFun)
//    doLogin("username","admin",saveResLogFun2)
}

const val DB_USERNAME = "username"
const val DB_PWD = "admin"

private fun doLogin(username : String, pwd: String, saveResLogFun : (String,Int) -> Unit) {
    if (DB_USERNAME == username && DB_PWD == pwd) {
        val resMsg = "登录成功"
        saveResLogFun(resMsg, 200)
    } else {
        val resMsg = "登录失败"
        saveResLogFun(resMsg, 400)
    }
}
