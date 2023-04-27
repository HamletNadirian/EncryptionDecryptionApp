package nadirian.hamlet.android.encdecapp.fragments.base64_encode_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nadirian.hamlet.android.encdecapp.databinding.FragmentBase64DecBinding
import nadirian.hamlet.android.encdecapp.model.base64.Base64Encoding


class Base64DecFragment : Fragment() {

    private var _binding: FragmentBase64DecBinding?=null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentBase64DecBinding.inflate(inflater,container,false)

        val view = _binding!!.root
        var ciphertextEt = binding!!.ciphertextForDecEdt.text

        binding!!.decryptBtn.setOnClickListener {
            if (ciphertextEt != null) {
                binding!!.plainTextForDecEdt.setText(Base64Encoding.decode(ciphertextEt.toString()))
            }
        }

        return view
    }

}