package nadirian.hamlet.android.encdecapp.fragments.utf_8_code

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nadirian.hamlet.android.encdecapp.R
import nadirian.hamlet.android.encdecapp.databinding.FragmentUTF8EncBinding
import nadirian.hamlet.android.encdecapp.model.affine_code.AffineCodeEncryptor
import nadirian.hamlet.android.encdecapp.model.utf_8_code.UTF8Encryptor


class UTF8EncFragment : Fragment() {

    private var _binding:FragmentUTF8EncBinding?=null
    private val  binding get() = _binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUTF8EncBinding.inflate(inflater,container,false)
        val view = _binding!!.root
        var plainTextEt = binding!!.plaintextForEncEdt.text
        binding!!.encryptBtn.setOnClickListener {
            binding!!.resultOfEncrypted.setText(UTF8Encryptor.stringToUTF8(plainTextEt.toString()))


        }
        return view
    }

}