package hackerrank

fun main(args: Array<String>) {
   print(MiminumSwaps2().minimumSwaps(arrayOf(4,3,1,2)))
}
class MiminumSwaps2 {

    fun minimumSwaps(arr: Array<Int>): Int {
        var result = 0
        for (i in arr.indices){
            if (arr[i] != (i+1)){
                var tempIndex = i
                while (tempIndex < arr.size){
                    if (arr[tempIndex] == (i+1)){
                        val tempVal = arr[tempIndex]
                        arr[tempIndex] = arr[i]
                        arr[i] = tempVal
                        result+=1

                        break
                    }
                    tempIndex+=1
                }
            }
        }

        return result
    }
}