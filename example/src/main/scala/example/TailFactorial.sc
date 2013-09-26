package example

object TailFactorial {
	println("as")                             //> as
  def tailFac(x:Int): Int = {
  	def doTailFac(x:Int, acc:Int): Int = {
  		if (x==1) acc
  		else doTailFac(x-1, x*acc)
  	}
  	doTailFac(x, 1)
  }                                               //> tailFac: (x: Int)Int
  
  tailFac(6)                                      //> res0: Int = 720
}