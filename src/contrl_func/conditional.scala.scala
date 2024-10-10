object conditional{
    val a=5
    // if has to return a value in scala
    val result = if (a>5) "a>5" else "a<=5"
    // if there is more than one type
    // then the type's going to be any
    // which the common supertype
    val result_st = if (a>5) true else "a<=5"
    // when there's no alternative answer
    // then it'll return Unit
    // which is similar to void in Java
    val result_u = if (a>5) true
    // blocks also need a value
    // which will be the last statement
    val distance = {
        var dx = x - x0
        var dy = y - y0
        (dx*dx + dy*dy)**0.5
    }
}
