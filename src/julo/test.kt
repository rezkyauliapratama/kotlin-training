package julo

import java.util.regex.Pattern

fun main(args: Array<String>) {
    test().write_down(arrayOf("@", "@#$@#$@", "@#$#@$@$", "@#%@$#$", "##@%#@%", "@#@"))
}
class test {



    fun write_down(words: Array<String>): Unit {
        var index = 0
        var isWhile = true
        var isLengthFind = false
        var length = 0

        while (isWhile) {
            val s = StringBuilder()

            for (i in words.indices) {
                if(!isLengthFind){
                    length = length.run{
                        if (this < words[i].length){
                            words[i].length
                        }else{
                            this
                        }
                    }
                }
                if (index < words[i].length) {
                    s.append(words[i][index])
                } else {
                    s.append(" ")
                }

                if (i < words.size-1){
                    s.append(" | ")
                }
            }
            isLengthFind = true
            isWhile = index < length
//            isWhile = s.toString().replace("|", "").trim { it <= ' ' }.isNotEmpty()
//            isWhile = Pattern.matches(".*[a-zA-Z]+.*", s)
            if (isWhile) {
                println(s.toString())

            }
            index++
        }


    }
}