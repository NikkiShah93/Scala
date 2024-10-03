// scala has both func and methods
object  fn {
    import scala.math._
    sqrt(2) // a function
    BigInt.probablePrime(100, scala.util.Random) // method
    "Hello".distinct // doesn't use ()
}