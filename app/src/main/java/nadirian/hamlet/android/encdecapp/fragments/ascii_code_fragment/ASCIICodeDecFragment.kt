package nadirian.hamlet.android.encdecapp.fragments.ascii_code_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nadirian.hamlet.android.encdecapp.databinding.FragmentASCIICodeDecBinding
import nadirian.hamlet.android.encdecapp.model.american_standard_code_for_information_interchange.ASCIIEncryptor

class ASCIICodeDecFragment : Fragment() {

    private var _binding: FragmentASCIICodeDecBinding?=null
    private val binding get() = _binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentASCIICodeDecBinding.inflate(inflater,container,false)

        val view = _binding!!.root
        var ciphertextEt = binding!!.ciphertextForDecEdt.text

        binding!!.decryptBtn.setOnClickListener {
            if (ciphertextEt != null) {
                binding!!.plainTextForDecEdt.setText(ASCIIEncryptor.asciiToString(ciphertextEt.toString()))
            }
        }
        return view
    }
}