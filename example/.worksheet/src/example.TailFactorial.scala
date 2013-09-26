package example

object TailFactorial {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(54); 
	println("as");$skip(149); 
  def tailFac(x:Int): Int = {
  	def doTailFac(x:Int, acc:Int): Int = {
  		if (x==1) acc
  		else doTailFac(x-1, x*acc)
  	}
  	doTailFac(x, 1)
  };System.out.println("""tailFac: (x: Int)Int""");$skip(16); val res$0 = 
  
  tailFac(6);System.out.println("""res0: Int = """ + $show(res$0))}
}
