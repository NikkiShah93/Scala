object loops {
  // scala has both for and while loops
  val n = 10
  for (i<-0 to n) println(i)
  // works with any collections
  for (s<-"Hello") println(s)
  // we can have multiple generators
  for (i<-0 to 5;j<-5 to 10) println(i*j)
  // we can use guards too
  for (i<-0 to 5;j<-3 to 8 if i!=j) println(j + i)
  // and you can collect the results
  // the data type will be vector
  var result = for (i<-0 to 5;j<-3 to 8 if i!=j) yield j/i
}
