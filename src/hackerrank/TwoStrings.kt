package hackerrank

import java.util.*


fun twoStrings(s1: String, s2: String): String {
    val length = run {
        if (s1.length > s2.length){
            s1.length
        }else{
            s2.length
        }
    }

    val arrS1 : MutableList<String> = mutableListOf()
    val arrS2 : MutableList<String> = mutableListOf()

    for (i in 0 until length-1){
        if (i < s1.length){
            arrS1.add(s1[i].toString())
        }

        if (i< s2.length){
            arrS2.add(s2[i].toString())

        }
    }

    val uniqueS1 = HashSet<String>(arrS1)
    val uniqueS2 = HashSet<String>(arrS2)


    for (str1 : String in uniqueS1){
        for (str2 : String in uniqueS2){
            if (str1 == str2){
                return "YES"
            }
        }
    }
    return "NO"
}

fun main(args: Array<String>) {
    print (twoStrings("hitcwvrtvizzztsecgtezzitwhgcbvesrtg","wijrvbihsctwvigrbtbbisgewzevjgsessi"))
}