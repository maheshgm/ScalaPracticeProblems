// Problem : https://www.hackerrank.com/challenges/arrays-ds/problem

import scala.io.StdIn
object Arrays {
  def main(args: Array[String])={
    val N = StdIn.readInt()
    var A:Array[Int] = new Array[Int](N)
    for(i<-0 to N-1){
      A(i) = StdIn.readInt()
    }

    for(i<-N-1 to 0 by -1){
      print(A(i)+" ")
    }

  }
}
