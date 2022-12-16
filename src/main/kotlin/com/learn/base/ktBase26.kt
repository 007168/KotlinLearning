
fun hello(name: String): String {
    return "Hello $name"
}

// TODO 26.kotlin语言的it关键字特点
// 结论： 匿名函数只有一个参数时，it就代表是这个参数的参数名称，类型会根据这个参数的类型变化
fun main(args: Array<String>) {
    val methodAction : (number1: Int, number2: Int, number3: Int) -> String
    methodAction = {number1,number2,number3->
        "参数一：$number1,参数二：$number2,参数三：$number3"
    }
    println(methodAction(1,2,3))
    val whoAreYou : (name : String) -> String = {
        "你是 $it"
    }
    println(whoAreYou("kotlin"))
    val whichNumber : (num : Int) -> String = {
        "数字 $it"
    }
    println(whichNumber(999))
    println(hello("World"))
}

