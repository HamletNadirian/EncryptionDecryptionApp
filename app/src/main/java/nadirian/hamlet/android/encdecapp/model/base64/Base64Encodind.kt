package nadirian.hamlet.android.encdecapp.model.base64

import java.util.*

object Base64Encoding {
    fun encode(originalString: String): String {
        return Base64.getEncoder().encodeToString(originalString.toByteArray())
    }
    fun decode(encodedString:String):String{
        return String(Base64.getDecoder().decode(encodedString))
    }
}