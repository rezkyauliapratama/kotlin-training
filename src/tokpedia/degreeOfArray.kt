package tokpedia

import android.R.attr.keySet
import android.R.attr.data
import java.io.File
import java.util.HashMap




fun main(args: Array<String>) {
    val a = degreeOfArray().degreeOfArray(arrayOf(1,2,2,3,1))
    System.out.print(a)
}
class degreeOfArray{
    fun degreeOfArray(arr: Array<Int>): Int {
        var max = 0
        val map = HashMap<Int, Int>()
        val startIndex = HashMap<Int, Int>()
        val endIndex = HashMap<Int, Int>()
        for (i in arr.indices) {
            val value = arr[i]
            if (map.containsKey(value)) {
                map[value] = (map[value]?:0) + 1
            } else {
                startIndex[value] = i
                map[value] = 1
            }
            endIndex[value] = i
            val degree: Int = map[value]?:0
            max = Integer.max(max, degree)
        }
        var result = arr.size
        for (i in map.keys) {
            if (map[i] == max) {
                val len = (endIndex[i]?:0) - (startIndex[i]?:0) + 1
                result = Integer.min(result, len)
            }
        }
        return result

    }

    fun readFiles(input_file:String){
        val setSingleName = mutableSetOf<String>()
        val listResult = mutableListOf<Array<String>>()

        File(input_file).forEachLine {
            val arr = it.split(",")
            setSingleName.add(arr[2])
            listResult.add(arrayOf(arr[2],arr[3],arr[4]))
        }

        File("0_$input_file").bufferedWriter().use { out ->
            var totalOrder = listResult.size
            for (str in setSingleName){
                var average = 0.0
                for (arr in listResult){
                   if (str == arr[0]){
                       average += (arr[1].toInt() / totalOrder)
                   }
               }
                out.write("$str, $average")
           }
        }


        File("1_$input_file").bufferedWriter().use { out ->
            var totalOrder = listResult.size
            for (str in setSingleName){
                var count = 0
                var temp =""
                for (arr in listResult){
                    if (str == arr[0]){

                    }
                }
                out.write("$str, $count")
            }
        }
    }
}
