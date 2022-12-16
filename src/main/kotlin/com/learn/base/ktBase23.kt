

// TODO 23.kotlin语言的匿名函数

fun main(args: Array<String>) {
    val hello : String = "Hello World"
    println(hello.count())
    val char_l_count = hello.count() {
        it == 'l'
    }
    println(char_l_count)
}