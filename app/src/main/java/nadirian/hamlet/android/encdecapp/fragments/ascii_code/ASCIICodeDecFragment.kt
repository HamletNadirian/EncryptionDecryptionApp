package nadirian.hamlet.android.encdecapp.fragments.ascii_code

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nadirian.hamlet.android.encdecapp.databinding.FragmentASCIICodeDecBinding

class ASCIICodeDecFragment : Fragment() {

    private var _binding: FragmentASCIICodeDecBinding?=null
    private val binding get() = _binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentASCIICodeDecBinding.inflate(inflater,container,false)

        val view = _binding!!.root
        var ciphertextEt = binding!!.ciphertextForEncEdt.text

        binding!!.decryptBtn.setOnClickListener {
            if (ciphertextEt != null) {
                binding!!.plainTextForDecEdt.setText(ASCIIEncryptor.asciiToString(ciphertextEt.toString()))
            }
        }
        return view
    }
}