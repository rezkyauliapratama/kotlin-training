package hackerrank


fun main(args: Array<String>) {
    val a = test().rotLeft(arrayOf(1,2,3,4,5),1)
    for(i in a.indices){
        System.out.print(a[i])
    }
}
class test {

    fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
        for (i in a.indices){
            if (i<a.size-1){
                val temp : Int = a[i+1]
                a[i+1] = a[i]
                a[i] = temp

            }
        }

        if (d > 1){
            rotLeft(a,d-1)
        }


        return a
    }
}