object arrays {
  // arrays with immutable length
  var a = new Array[Int](10)

  // we can use until for looping
  // until a certain value
  for (i <- 0 until a.length) a(i) = i * i 
  for (elm <- a) println(elm)

  // for arrys with mutable length
  // we can use ArrayBuffer
  import scala.collection.mutable.ArrayBuffer
  var b = new ArrayBuffer[Int] 
  // for adding new items
  // we can use += or ++=
  b += 1
  b += (2, 3, 4)
  b ++= Array(5, 6, 7, 8)
  // we can also use insert 
  // by passing the index
  b.insert(2, 2)
  // we can also remove items
  // by passing their index
  b.remove(2)
  // we can also remove multiple items
  b.trimEnd(2) // removes the last two items
  b.trimStart(1) // removes the first item

  // in order to go between Arrays and ArrayBuffers
  val b2 = b.toArray
  val a2 = a.toBuffer

  // if we want to mutate the arrays
  // we should create new ones 
  val b3 = for (el <- b2 if el % 2 == 0) yield el

  // built-in functions for arrays
  // to sum things up
  println("sum of b elemenets is: "+b2.sum)
  // getting min and max
  println("max of b elemenets is: "+b2.max)
  println("min of b elemenets is: "+b2.min)
  // sorting
  // which doesn't impact the original
  println("sorted b is: "+b2.sorted)
  // reversing
  println("sorted b is: "+b2.reverse)
  // to string method works like Java
  println(ArrayBuffer(1, 2, 6, 9).toString)
  // if you want to see the actual elements
  // and to have it converted nicely
  // we should use mkString
  println(ArrayBuffer(1, 2, 6, 9).mkString(sep= " | "))
}
