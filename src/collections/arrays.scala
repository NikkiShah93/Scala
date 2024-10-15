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
}
