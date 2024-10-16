object maps_tuple {
  // maps are similar to other langs
  // powerful key/value pairs
  // by default maps are immutable
  val scores = Map("John"-> 80, "Jane" -> 90)
  // for mutable ones we should use the following
  var m_scores = scala.collection.mutable.Map("Jane" -> 90)
  m_scores("John") = 80
}
