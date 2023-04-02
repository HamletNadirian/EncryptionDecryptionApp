package nadirian.hamlet.android.encdecapp.fragments.caesar_cipher

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nadirian.hamlet.android.encdecapp.R
import nadirian.hamlet.android.encdecapp.databinding.FragmentCaesarCipherDecBinding
import nadirian.hamlet.android.encdecapp.databinding.FragmentCaesarEncCipherBinding
import nadirian.hamlet.android.encdecapp.fragments.caesar_cipher.CaesarCipherEncryptor.decryptionCaesar


class CaesarCipherDecFragment : Fragment() {

    private var _binding: FragmentCaesarCipherDecBinding? = null
    private val binding get() = _binding
    private var shiftForCaesarCipher = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentCaesarCipherDecBinding.inflate(inflater, container, false)
        val view = _binding!!.root

        var ciphertext = binding!!.ciphertextForEncEdt.text
        binding!!.minusShiftBt.setOnClickListener {
            shiftForCaesarCipher = shiftForCaesarCipher - 1
            binding!!.shiftEt.setText(shiftForCaesarCipher.toString())
        }

        binding!!.plusShiftBtn.setOnClickListener {
            shiftForCaesarCipher = shiftForCaesarCipher + 1
            binding!!.shiftEt.setText(shiftForCaesarCipher.toString())
        }
        binding!!.decryptBtn.setOnClickListener {

            var plaintextEdtToString = ciphertext.toString()
            binding!!.plainTextForEncEdt.setText(
                decryptionCaesar(
                    plaintextEdtToString,
                    shiftForCaesarCipher
                )
            )
        }
        return view
    }


}