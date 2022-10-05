fun main(args: Array<String>): Unit{

    println("This is main function!")
    f2()
    println(f1())
    println(f3())

    var name = "Ab"
    var age = 25

    var str = "name: $name, age: $age"
    println(str.length)

    var days = listOf("Mon","Tue", "Wed", "Thu")
    for((index, value) in days.withIndex()){
        println("index is $index and value is $value")
    }

    days.forEach{
        println(it)
    }

    var i = 0
//    while(i!=5){
//        println("i is $i")
//        i++
//    }

    do{
        println(i);
        i++
    }while(i!=5)

    repeat(3){
        println("Repeating")
    }

    for(j in 5 until 15 step 5){
        println(j)
    }
//    println("Enter the operator: ")
//    var op: String? = readLine()
//    var a = 10
//    var b = 2
//
//    when(op){
//        "+"->
//            println(a+b)
//        "-"->
//            println(a-b)
//        else->{
//            println("Unknown")
//        }
//    }

    var c:String? = "Something"
    c = null
    c = if(c!=null) c else "-1"
    println(c)

    var d:String?
    d = "Hello"
    var len:Int?
    len = d?.length
    println(d + " the length is $len")
    d = null
    len = d?.length
    println(d + " the length is $len")

    var e:String? = "Ab"
    var f = e?.length ?:-1
    println(f)
    e = null
    val na = e?:"Something else"
    println(na)



}

fun f1(): String{
    return "the return type is String!"
}

fun f2(): Unit{
   println("Void return type")
}

fun f3(): Int{
    return 2+3
}