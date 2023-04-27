package nadirian.hamlet.android.encdecapp.fragments.sha256_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nadirian.hamlet.android.encdecapp.databinding.FragmentSHA256Binding
import nadirian.hamlet.android.encdecapp.model.sha256_hash.SHA256


class SHA256Fragment : Fragment() {

    private var _binding:FragmentSHA256Binding?=null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSHA256Binding.inflate(inflater,container,false)
        val view = _binding!!.root
        var plaintTextEt = binding!!.plaintextForEncEdt.text


        binding!!.encryptBtn.setOnClickListener {
            var edtToString = plaintTextEt.toString()

            var parsString = SHA256.sha256(edtToString)
            binding!!.resultOfEncrypted.setText(parsString)
        }
        return view
    }

}