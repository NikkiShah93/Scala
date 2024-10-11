object functions {
  // in Scala, we have both funcions and methods
  // where functions don't need to be associated with a class
  // the return type is inferred logically
  def abs(x: Double) = if (x >= 0) x else -x
  // this won't work for reursive functions
  def factorial(a : Int): Int = if (a <= 0) 1 else a * factorial(a-1)
  // when the function doesn't return a value
  // we can have a procedure which doesn't need =
  def box(s: String) {
    val border = "-" * s.length + "--\n"
    println(border + "|" + s + "|\n" + border)
  }
  // if you want the result of the calculation
  // have to use =
    def fac(n: Int) = {
        var r = 1
        for (i<- r to n) r = i * r
        r
    }
    var result = fac(10)
    // default arguments let you omit argument valuse
    def decorate(s: String, left: String = "[", right: String = "]")={
        left + s + right
    }
    // uses the defaul
    println(decorate("Hello"))
    // uses the next arg for left
    println(decorate("Hello", ">>["))
    // have to use the name to assign to right
    println(decorate("Hello", right="]<<"))
    // scala also has args
    def sum(args: Int*) = { // Int* -> Seq[Int]
        var result = 0
        for (i <- args) result += i
        result
    }
    val sum_result = sum(2, 4, 6, 8)
    // if we want to pass an actual Seq
    // then we have to use a special syntax
    val seq_result = sum(1 to 10: _*)
    // this is also used in recursive calls
    def recursive(args: Int*): Int = {
      if (args.length == 0) 0 
      else args.head + recursive(args.tail: _*)
    }
}
