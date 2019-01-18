package tokpedia

import kotlin.math.max


fun main(args: Array<String>) {
    val a = test().maxDifference(arrayOf(10,8,10,7,6,5))
    System.out.print(a)
}
class test {
    fun maxDifference(a: Array<Int>): Int {
        var maxDifVal = -1
        for (i in a.indices){
            for (j in 0 until i){
                if(a[i] > a[j]){
                    val res = a[i] - a[j]
                    if (res > 0 && res>maxDifVal){
                        maxDifVal = res
                    }
                }
            }
        }

        return maxDifVal
    }


}