package nadirian.hamlet.android.encdecapp.fragments.utf_8_code

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nadirian.hamlet.android.encdecapp.R
import nadirian.hamlet.android.encdecapp.databinding.FragmentAffineCodeDecBinding
import nadirian.hamlet.android.encdecapp.databinding.FragmentUTF8DecBinding
import nadirian.hamlet.android.encdecapp.model.affine_code.AffineCodeEncryptor
import nadirian.hamlet.android.encdecapp.model.utf_8_code.UTF8Encryptor


class UTF8DecFragment : Fragment() {

    private var _binding: FragmentUTF8DecBinding? = null
    private val binding get() = _binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUTF8DecBinding.inflate(inflater,container,false)
        val view = _binding!!.root
        var ciphertextEt = binding!!.ciphertextForDecEdt.text

        binding!!.decryptBtn.setOnClickListener {
            binding!!.resultOfDecrypted.setText(UTF8Encryptor.decodeUTF8ToString(ciphertextEt.toString()))
        }
        return view
    }

}