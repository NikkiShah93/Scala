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


}
