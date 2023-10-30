import java.util.Arrays

fun main() {
//    val multiply: (Int, Int) -> Int = { x, y -> x + y }
//
//    val num1 = 7
//    val num2 = 8
//
//    val result = multiply(num1, num2)
//    println("The result of multiplying $num1 and $num2 is: $result")

//    val strings = listOf("Kotlin", "Java", "Kotlin Programming", "Python", "Kotlin Language")
//
//    val filteredList = strings.filter { it.startsWith("J") }
//
//    println("Filtered List:")
//    filteredList.forEach {
//        println(it)
//    }
    val res:(a:Int,b:Int)-> String = {a,b->"le resultat est :+ ${a.plus(b)} + ${a+b}"}
    println(res(6,5))
    fun calculate(x:Int,y:Int,calculer:(Int,Int)->Int):Int{
        return calculer(x,y)
    }
    fun addition(x:Int,y:Int)=x+y


//    var rese = calculate(5,6,::addition)
//    println(rese)
//    var rese = calculate(5,6,{x,y -> x+y})
     fun filtterN(arr:Array<Int>,fuc:(Int)->Boolean):Array<Int>{
       val filt = ArrayList<Int>()
       for (e in arr){
           if (fuc(e)){
               filt.add(e)
           }
       }
         return filt.toTypedArray()
     }
    fun positif(n:Int):Boolean=n>0 || n%2==0
    fun pair(n:Int):Boolean=n%2==0
    val numbers = arrayOf<Int>(12,45,-88,30,8,66)
    val numP =filtterN((filtterN(numbers,::positif)),::pair)
    val num =filtterN(numbers,::positif)
    println(Arrays.toString(numP))
    println(Arrays.toString(num))
}