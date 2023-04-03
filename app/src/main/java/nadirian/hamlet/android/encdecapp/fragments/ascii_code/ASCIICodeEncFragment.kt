package nadirian.hamlet.android.encdecapp.fragments.ascii_code

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nadirian.hamlet.android.encdecapp.databinding.FragmentASCIICodeEncBinding
import nadirian.hamlet.android.encdecapp.model.american_standard_code_for_information_interchange.ASCIIEncryptor


class ASCIICodeEncFragment : Fragment() {

    private var _binding: FragmentASCIICodeEncBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentASCIICodeEncBinding.inflate(inflater,container,false)
        val view = _binding!!.root
        var plaintTextEt = binding!!.plaintextForEncEdt.text


        binding!!.encryptBtn.setOnClickListener {
            var edtToString = plaintTextEt.toString()

            var parsString = ASCIIEncryptor.stringToACII(edtToString)
            binding!!.cipherTextForEncEdt.setText(parsString)
        }
        return view
    }
}