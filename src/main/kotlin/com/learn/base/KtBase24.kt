package com.learn.base


// TODO 24.Kotlin语言的函数类型&隐式返回
fun main() {
//    第一步：函数输入输出的声明
    val methodAction : () -> String
//    第二步：根据刚刚的声明，写具体实现： == 匿名函数体
    methodAction =  {
        val inputValue = 666666
        // 匿名函数不需要写return，最后一行就是返回值
        "$inputValue very good!"
    }
    println(methodAction())
    val methodAction2 : (inputValue : Int) -> String
    methodAction2 = {
        "$it good!"
    }
    println(methodAction2(999))
    val methodAction3 : (inputValue1 : Int, inputValue2 : Int, inputValue3 : Int) -> String
    methodAction3 = {inputValue1, inputValue2, inputValue3 ->
        "$inputValue1+$inputValue2+$inputValue3  good!"
    }
    println(methodAction3(1,2,3))
}