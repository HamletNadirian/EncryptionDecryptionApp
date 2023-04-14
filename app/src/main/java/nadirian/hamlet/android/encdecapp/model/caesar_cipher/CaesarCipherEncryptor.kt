package nadirian.hamlet.android.encdecapp.model.caesar_cipher

import org.bouncycastle.crypto.engines.SerpentEngine
import org.bouncycastle.crypto.modes.CBCBlockCipher
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher
import org.bouncycastle.crypto.params.KeyParameter
import org.bouncycastle.util.encoders.Hex

object CaesarCipherEncryptor {
    val number: Char = 'a'
    val numberAsInt = number.code
    fun encryptionCaesar(string: String, shift: Int): String {
        val textStr = ArrayList<Char>()
        for (s in string) {
            if (s == ' ')
                textStr += ' '
            else
                textStr.add((s - number + shift).mod(26).plus(numberAsInt).toChar())
        }

        val to_array: Array<Char> = textStr.toTypedArray()
        var str = ""
        to_array.forEach { str += it }

        return str
    }
     fun decryptionCaesar(string: String, shift: Int): String {
        val textStr = ArrayList<Char>()
        for (s in string) {
            if (s == ' ')
                textStr += ' '
            else
                textStr.add((s - number - shift + 26).mod(26).plus(numberAsInt).toChar())
        }

        val to_array: Array<Char> = textStr.toTypedArray()
        var str = ""
        to_array.forEach { str += it }

        return str
    }


}