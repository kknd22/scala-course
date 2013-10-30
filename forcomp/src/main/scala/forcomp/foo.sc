import forcomp.Anagrams._
import forcomp.Anagrams.Sentence

val x = "abcbcc"
//x.groupBy(x => x).map(e => (e._1, e._2.length)).toList.sortBy(x => x)

val y ="xxxyyz"

val z = "bbccca"
val s = List(x, y, z)
s.foldLeft("")(_ + _)
//val v = sentenceOccurrences(s)

//val vv = s.groupBy(wordOccurrences(_))
combinations(List(('a', 2), ('b', 2), ('c', 2)))








//val l=List(('a', 2), ('b', 2))
//val lm=l.toMap
//2 - lm.getOrElse('d', 0)
//val ll=lm.toList
//for {e <- l; i <-(1 to l.head._2) } yield (l.head._1, i)::l

subtract(List(('a', 2), ('b', 1), ('c', 2)), List(('a', 1), ('b', 1), ('c', 2)))




