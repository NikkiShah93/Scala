object exercis {
  // write a function that tests whether a character is a vowel
  // first approach
  def vowel_finder_naive(c: Char) = {
    c == 'a' | c == 'e' | c == 'i' | c == 'o' | c == 'u'
  }
  // advanced way
  def vowel_finder(c: Char)={
    val vowels = "aeiou"
    vowels.contains(c)
  }
  // more concise
  def is_vowel(c: Char) = "aeiou".contains(c)

  // write a function that, given a string, returns a string
  // of all its vowels.
  def vowel_return(str: String) = {
    var vowels = ""
    for (s <- str) if (is_vowel(s)) vowels += s
    vowels
  }

  // using for ... yield
  // by incorporating guards
  def vowel_yield(str: String) = {
    for (s <- str if is_vowel(s)) yield s
  }

  // the recursive way
  // not the best approach in Scala
  def vowel_recursive(str: String): String = {
    if (str.length == 0) ""
    else {
    val start = str(0)
    var rest = vowel_recursive(str.substring(1))
    if (is_vowel(start)) start + rest else rest
    }
  }

  // using the while loop
  def vowel_while(str: String) = {
    var i = 0
    var result = ""
    while (i < str.length) {
      if (is_vowel(str(i))) result += str(i)
      i += 1
    }
    result
  }

  // adding more functionalities
  def advanced_vowels(str: String, vowelChar: String = "aeiou",
   ignoreCase: Boolean = true): String = {
    if (ignoreCase) advanced_vowels(str.toLowerCase, vowelChar, false)
    for (ch <- str if vowelChar.contains(ch)) yield ch
   }
}
