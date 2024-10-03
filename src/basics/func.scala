// scala has both func and methods
object  fn {
    import scala.math._
    sqrt(2) // a function
    BigInt.probablePrime(100, scala.util.Random) // method
    "Hello".distinct // doesn't use ()
    "Hello".length // not mutating no ()
    // we can use (arg) for methods similar to fn calls
    "Hello"(4) // same as "Hello".apply(4)
    1.to(10).map(sqrt(_)) // mapping a fun to a range
    "Rhine".permutations.toArray // all the possible perm
    "ABC".sum // returns char
    "A" + "B" + "C" // returns int
}