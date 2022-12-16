

// TODO 27.kotlin语言的匿名函数类型推断

fun main(args: Array<String>) {
    // 这里自动推断出返回类型为String
    val methodAction = {number1: Int, number2: Int, number3: Int->
        "参数一：$number1,参数二：$number2,参数三：$number3"
    }
    println(methodAction(1,2,3))
    // 匿名函数，类型推断为String
    val methodAction2 = { name : String ->
        "你是 $name"
    }
    println(methodAction2("kotlin"))
    // 匿名函数，类型推断为Int
    val methodAction3 = {num : Int ->
        num+1
    }
    println(methodAction3(999))
    // 匿名函数，类型推断为Double
    val methodAction4 = {num : Int ->
        num+1.99
    }
    println(methodAction4(999))
}

