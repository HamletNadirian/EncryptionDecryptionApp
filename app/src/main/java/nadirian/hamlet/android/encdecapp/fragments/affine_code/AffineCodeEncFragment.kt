package nadirian.hamlet.android.encdecapp.fragments.affine_code

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nadirian.hamlet.android.encdecapp.databinding.FragmentAffineCodeEncBinding
import nadirian.hamlet.android.encdecapp.model.affine_code.AffineCodeEncryptor


class AffineCodeEncFragment : Fragment() {

    private var _binding:FragmentAffineCodeEncBinding?=null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentAffineCodeEncBinding.inflate(inflater, container, false)
        val view = _binding!!.root

        var plainTextEt = binding!!.plaintextForEncEdt.text
        var coefficientA = binding!!.coefficientA.text
        var coefficientB = binding!!.coefficientB.text

        binding!!.encryptBtn.setOnClickListener {
                binding!!.resultOfEncrypted.setText((
                        AffineCodeEncryptor.encrypt(
                            plainTextEt.toString(),coefficientA.toString().toInt(),coefficientB.toString().toInt())))

        }

        return view
    }

}