package nadirian.hamlet.android.encdecapp.fragments.caesar_cipher

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nadirian.hamlet.android.encdecapp.databinding.FragmentCaesarEncCipherBinding
import nadirian.hamlet.android.encdecapp.fragments.caesar_cipher.CaesarCipherEncryptor.encryptionCaesar


class CaesarCipherEncFragment : Fragment() {

    private var _binding: FragmentCaesarEncCipherBinding? = null
    private val binding get() = _binding
    private var shiftForCaesarCipher = 0

    val number: Char = 'a'
    val numberAsInt = number.code

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentCaesarEncCipherBinding.inflate(inflater, container, false)
        val view = _binding!!.root
        var plaintTextEt = binding!!.plaintextForEncEdt.text

        binding!!.minusShiftBt.setOnClickListener {
            shiftForCaesarCipher = shiftForCaesarCipher - 1
            binding!!.shiftEt.setText(shiftForCaesarCipher.toString())
        }

        binding!!.plusShiftBtn.setOnClickListener {
            shiftForCaesarCipher = shiftForCaesarCipher + 1
            binding!!.shiftEt.setText(shiftForCaesarCipher.toString())
        }

        binding!!.encryptBtn.setOnClickListener {
            var plaintextEdtToString = plaintTextEt.toString()
            binding!!.cipherTextForEncEdt.setText(
                encryptionCaesar(
                    plaintextEdtToString,
                    shiftForCaesarCipher
                )
            )
        }
        return view
    }



}