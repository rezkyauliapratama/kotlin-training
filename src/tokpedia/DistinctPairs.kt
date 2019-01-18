package tokpedia

import kotlin.collections.*

fun main(args: Array<String>) {
    val a = DistinctPairs().numberOfPairs(arrayOf(10,8,10,7,6,5),18)
    System.out.print(a)
}
class DistinctPairs {

    fun numberOfPairs(a: Array<Int>, k: Long): Int {
        val set = mutableSetOf<Pair<Int,Int>>()
        a.sort()
        for (i in a.indices){
            if (a[i]<k){
                for (j in 0 until i){
                    val res = a[i] + a[j]
                    val bol = res.toLong() == k
                    if(bol){
                        set.add(Pair(a[i],a[j]))
                    }

                    if (res > k){
                        break
                    }
                }
            }else{
                break
            }
        }

        return set.size
    }

}