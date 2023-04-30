package nadirian.hamlet.android.encdecapp.fragments.blowfish_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nadirian.hamlet.android.encdecapp.databinding.FragmentBlowfishEncBinding
import nadirian.hamlet.android.encdecapp.model.blowfish.BlowfishEncryption

class BlowfishEncFragment : Fragment() {

    private var _binding:FragmentBlowfishEncBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        _binding = FragmentBlowfishEncBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        val view = _binding!!.root
        var plaintTextEt = binding!!.plaintextForEncEdt.text

        var secretKey = binding!!.keyForEncEdt.text
        binding!!.encryptBtn.setOnClickListener {
            binding!!.cipherTextForEncEdt.setText(
                BlowfishEncryption.encrypt(
                    plaintTextEt.toString(),
                    secretKey.toString()
                )
            )
        }
        return view
    }
}