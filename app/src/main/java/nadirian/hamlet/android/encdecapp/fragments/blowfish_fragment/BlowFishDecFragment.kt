package nadirian.hamlet.android.encdecapp.fragments.blowfish_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nadirian.hamlet.android.encdecapp.databinding.FragmentBlowFishDecBinding
import nadirian.hamlet.android.encdecapp.model.blowfish.BlowfishEncryption

class BlowFishDecFragment : Fragment() {

    private var _binding:FragmentBlowFishDecBinding? = null
    private val binding get() = _binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        _binding = FragmentBlowFishDecBinding.inflate(inflater,container,false)
        val view = _binding!!.root
        var cipherText = binding!!.ciphertextForDecEdt.text
        var secretKey = binding!!.keyForDecEdt.text
        binding!!.decryptBtn.setOnClickListener {
            binding!!.plaintextForDecEdt.setText(
                BlowfishEncryption.decrypt(
                    cipherText.toString(),
                    secretKey.toString()
                )
            )
        }
        return view
    }

}