package nadirian.hamlet.android.encdecapp.fragments.ascii_code

object ASCIIEncryptor {

       fun asciiToString(str: String):String {
        var num = 0
        var resultString = ""
        var codeZeroOfBytes = '0'.code
        for (element in str) {
            num = num * 10 + (element.code - codeZeroOfBytes)
            if (num >= 32 && num <= 122) {
                val ch = num.toChar()
                num = 0
                resultString+=ch
            }
        }
        return resultString
    }
     fun stringToACII(string: String): String {
        var arraylist = ArrayList<Int>()
        for (c in string) {
            arraylist.add(c.code)
        }
        return arraylist.joinToString(" ")
    }
}