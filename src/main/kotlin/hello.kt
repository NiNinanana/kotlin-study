val name : String by lazy{
    println("lazylazy")
    "none-lazy"
}

fun main(){
    var age : Int = 21
    var name : String = "선우"

    val firstNum : Int = 35
    val secondNum : Int = 200

    if(firstNum > secondNum) {
        println("first가 큼!")
    }

    when (age) {
        10-> println("??")
        21 -> println("최고의 나이")
        else -> println("나이가 아님")
    }

    println("${name}는 ${age}살!")

    println(age)
    println(name)
    println("Hello, World!")
}