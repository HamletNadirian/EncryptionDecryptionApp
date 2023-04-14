package nadirian.hamlet.android.encdecapp.model.affine_code

import nadirian.hamlet.android.encdecapp.model.american_standard_code_for_information_interchange.ASCIIEncryptor.asciiToString

object AffineCodeEncryptor {
    var aCode = 'A'.code
    fun encrypt(string: String, a: Int, b: Int): String {
        val textStr = ArrayList<Char>()
        for (s in string) {
            if (s == ' ')
                textStr += ' '
            else if (s.isUpperCase())
                textStr.add((a*(s.code.minus('A'.code))+b).mod(26).plus('A'.code).toChar())
            else if(s.isLowerCase())
                textStr.add((a*(s.code.minus('a'.code))+b).mod(26).plus('a'.code).toChar())
            else
                textStr.add(s)

        }
        val to_array: Array<Char> = textStr.toTypedArray()
        var str = ""
        to_array.forEach { str += it }
        return str
    }
    fun decrypt(string: String, a: Int, b: Int): String? {
        val textStr = ArrayList<Char>()
        for (s in string) {
            if (s == ' ')
                textStr += ' '
            else if (s.isUpperCase())
                textStr.add((a*(s.code.plus('A'.code)-b)).mod(26).plus('A'.code).toChar())
            else if(s.isLowerCase()){
                textStr.add((a*((s.code.minus('a'.code)-b)).mod(26)).plus('a'.code).toChar())
            }
            else
                textStr.add(s)
        }

        val to_array: Array<Char> = textStr.toTypedArray()
        var str = ""
        to_array.forEach { str += it }
        return str
    }
}