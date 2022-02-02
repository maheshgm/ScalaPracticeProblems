import scala.io.StdIn

object filters {
  def main(args:Array[String]):Unit = {
      val n = StdIn.readInt()
    def printOut(v:Any) = println(v)
      var nums:List[Int] = List(2,5,3,7,1,5,3,9,6)
    nums = nums ::: List(n)
    val even = for{a<-nums if a%2==0 } yield a;
      val odd = for{a<-nums if a%2==1 } yield a;
      for( a<-even)
    {
      printOut(a)
    }
    for(a<-0 to 7) {

      printOut(odd(a))
    }
    printOut(nums.filter(x => x%2==1))
    printOut(nums.map(x => x*x))


  }
}
