object var {
    println("Hello World!")
    // immutable
    val answer = 8 * 5 + 2
    // mutable
    var  respponse = 34
    respponse = 20
    // explicit type
    var greeting: String = null
    greeting = "Hello!"
    // everything is an object in scala
    1.to(10) // will create a range between 1-10
    1 to 10 // acchomplishes the same 
    "Hello".intersect("World") // gives you the intersection
    // working with big numbers
    var x: BigInt = 12345678
    x * x * x * x
}