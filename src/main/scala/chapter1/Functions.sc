def abs(num: Int): Int = if num > 0 then num else -num

def dots(length: Int): String = "." * length

(dots compose abs)(-8)
(abs andThen dots)(-5)

def shorten(str: String, maxLen: Int): String =
  if str.length > maxLen then str.substring(0, maxLen) + "..." else str

extension (str: String)
  def short(maxLen: Int): String = shorten(str, maxLen)

"Functional programming".short(8)
