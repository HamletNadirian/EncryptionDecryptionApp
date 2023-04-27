package nadirian.hamlet.android.encdecapp.fragments.affine_code_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nadirian.hamlet.android.encdecapp.databinding.FragmentAffineCodeDecBinding
import nadirian.hamlet.android.encdecapp.model.affine_code.AffineCodeEncryptor

class AffineCodeDecFragment : Fragment() {

    private var _binding: FragmentAffineCodeDecBinding?=null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAffineCodeDecBinding.inflate(inflater,container,false)
        val view = _binding!!.root
        var ciphertextEt = binding!!.ciphertextForDecEdt.text
        var coefficientA = binding!!.coefficientA.text
        var coefficientB = binding!!.coefficientB.text

        binding!!.decryptBtn.setOnClickListener {
                binding!!.resultOfDecrypted.setText(
                    AffineCodeEncryptor.decrypt(
                        ciphertextEt.toString(),coefficientA.toString().toInt(),coefficientB.toString().toInt()))//functionDecAffineCode

        }
        return view
    }

}