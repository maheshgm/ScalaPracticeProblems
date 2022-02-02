// Problem : https://www.hackerrank.com/challenges/ctci-bubble-sort/problem
import scala.io.StdIn
object BubbleSort {
  def main(args:Array[String]): Unit ={
    val N = StdIn.readInt();
    var A:Array[Int] = new Array[Int](N);
    for(i<-0 to N-1){
      A(i) = StdIn.readInt()
    }
    var swapCount = 0;
    for(i<-0 to N-1) {
      for (j <- 0 to N - 2) {
        if (A(j) > A(j + 1)) {
          val temp = A(j);
          A(j) = A(j + 1)
          A(j + 1) = temp
          swapCount += 1
        }
      }
    }
    println("Array is sorted in "+swapCount+" swaps.");
    println("First Element: "+A(0))
    println("Last Element: "+A(N-1))
  }


}
