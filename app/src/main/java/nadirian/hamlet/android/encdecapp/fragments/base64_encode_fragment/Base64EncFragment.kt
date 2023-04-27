package nadirian.hamlet.android.encdecapp.fragments.base64_encode_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nadirian.hamlet.android.encdecapp.databinding.FragmentBase64EncBinding
import nadirian.hamlet.android.encdecapp.model.base64.Base64Encoding


class Base64EncFragment : Fragment() {

    private var _binding: FragmentBase64EncBinding? = null
    private val binding get() = _binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentBase64EncBinding.inflate(inflater, container, false)
        val view = _binding!!.root
        var plaintTextEt = binding!!.plaintextForEncEdt.text

        binding!!.encryptBtn.setOnClickListener {
            binding!!.cipherTextForEncEdt.setText(Base64Encoding.encode(plaintTextEt.toString()))
        }

        return view
    }

}