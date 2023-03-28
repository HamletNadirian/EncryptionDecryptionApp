package nadirian.hamlet.android.encdecapp

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Base64
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import nadirian.hamlet.android.encdecapp.databinding.FragmentCipherEncBinding
import org.bouncycastle.jce.provider.BouncyCastleProvider
import java.io.UnsupportedEncodingException
import java.security.InvalidKeyException
import java.security.NoSuchAlgorithmException
import java.security.Security
import javax.crypto.*
import javax.crypto.spec.SecretKeySpec


class CipherEncFragment : Fragment() {
    var enc = AESEncryptor()

    private var _binding: FragmentCipherEncBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentCipherEncBinding.inflate(inflater,container,false)
        val view = _binding!!.root
        var plaintTextEt = binding!!.plaintextForEncEdt.text
        var cipherTextEt = binding!!.cipherTextForEncEdt.text
        binding!!.sizeKeyForEncTv.text= 0.toString()

        binding!!.keyForEncEdt.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
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
        }

/*        binding!!.plaintextForEncEdt.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_SEND) {
                binding!!.cipherTextEdt.setText(enc.encrypt(plaintTextEt.toString(),secretKey))
                val imm =
                    v.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(v.windowToken, 0)
                true
            }
            false
        }*/
        var secretKey= binding!!.keyForEncEdt.text

         binding!!.keyForEncEdt.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_SEND) {
                binding!!.cipherTextForEncEdt.setText(enc.encrypt(plaintTextEt.toString(),secretKey.toString()))
                val imm =
                    v.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(v.windowToken, 0)
                true
            }
            false
        }
        binding!!.encryptBtn.setOnClickListener {
            binding!!.cipherTextForEncEdt.setText(enc.encrypt(plaintTextEt.toString(),secretKey.toString()))
        }
        return view
    }
    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}