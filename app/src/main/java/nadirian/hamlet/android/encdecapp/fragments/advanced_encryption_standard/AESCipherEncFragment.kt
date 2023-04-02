package nadirian.hamlet.android.encdecapp.fragments.advanced_encryption_standard

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import nadirian.hamlet.android.encdecapp.fragments.advanced_encryption_standard.Encryptor.encrypt
import nadirian.hamlet.android.encdecapp.databinding.FragmentAesCipherEncBinding


class AESCipherEncFragment : Fragment() {

    private var _binding: FragmentAesCipherEncBinding? = null
    private val binding get() = _binding

    private lateinit var secretKeyToString:String
    private lateinit var IVtoString:String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= nadirian.hamlet.android.encdecapp.databinding.FragmentAesCipherEncBinding.inflate(inflater,container,false)
        val view = _binding!!.root
        var plaintTextEt = binding!!.plaintextForEncEdt.text

        var secretKey= binding!!.keyForEncEdt.text
        var IV = binding!!.initVectorEdt.text
//IV
        binding!!.initVectorEdt.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                IVtoString = IV.toString()

                var keyLength = binding!!.initVectorEdt.length()
                var convertToIntSize = (keyLength.toInt()*8)

                if (convertToIntSize==128){
                    binding!!.sizeIVForEncTv.setTextColor(Color.GREEN);
                }
                else{
                    binding!!.sizeIVForEncTv.setTextColor(Color.RED);
                }
                binding!!.sizeIVForEncTv.text=convertToIntSize.toString()
            }
        })

        ////KEY
        binding!!.keyForEncEdt.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                secretKeyToString = secretKey.toString()
                var keyLength = binding!!.keyForEncEdt.length()
                var convertToIntSize = (keyLength.toInt()*8)

                if (convertToIntSize==128||convertToIntSize==192||convertToIntSize==256){
                    binding!!.sizeKeyForEncTv.setTextColor(Color.GREEN);
                }
                else{
                    binding!!.sizeKeyForEncTv.setTextColor(Color.RED);
                }
                binding!!.sizeKeyForEncTv.text=convertToIntSize.toString()
            }
        })

        binding!!.clearForEncBt.setOnClickListener {
            binding!!.keyForEncEdt.setText("")
            binding!!.initVectorEdt.setText("")

        }

         binding!!.keyForEncEdt.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_SEND) {
                val imm =
                    v.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(v.windowToken, 0)
                true
            }
            false
        }

        binding!!.encryptBtn.setOnClickListener {
            binding!!.cipherTextForEncEdt.setText(encrypt(secretKeyToString,IVtoString,plaintTextEt.toString()))
        }

        return view
    }
    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
    fun getRandomString(length: Int) : String {
        val charset = "ABCDEFGHIJKLMNOPQRSTUVWXTZabcdefghiklmnopqrstuvwxyz0123456789"
        return (1..length)
            .map { charset.random() }
            .joinToString("")
    }
}