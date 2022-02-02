import scala.io.StdIn
object SelectionSort {
  def SelectionSort(A:Array[Int]): Unit ={
    val N = A.length
    for(i<-0 to N-1){
      var minElement = i
      for(j<-i+1 to N-1 ){
        if(A(minElement) > A(j)){
          minElement = j
        }
      }
      val temp = A(i)
      A(i) = A(minElement)
      A(minElement) = temp

    }
  }

  def main(args:Array[String])={
    val N = StdIn.readInt()
    var A:Array[Int] = new Array[Int](N)
    for(i<-0 to N-1)
    {
      A(i) = StdIn.readInt()
    }
    SelectionSort(A);
    for(i<-0 to N-1)  print(A(i)+" ")

  }
}
