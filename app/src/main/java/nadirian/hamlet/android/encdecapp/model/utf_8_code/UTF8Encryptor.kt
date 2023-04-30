package nadirian.hamlet.android.encdecapp.model.utf_8_code

object UTF8Encryptor {
    private val charset = Charsets.UTF_8

     fun stringToUTF8(string: String): String {
        val byteArray = string.toByteArray(charset)
        return (byteArray).joinToString()
    }

     fun decodeUTF8ToString(string: String): String {
         val splitString = string.split(",").map { it.trim() }
         var tempByte:Byte = 0
         var byteList = ArrayList<Byte>()
         for (s in splitString) {
             tempByte=s.toByte()
             byteList.add(tempByte)
         }
         var byteArray:ByteArray = byteList.toByteArray()
        return byteArray.toString(charset)
    }

}