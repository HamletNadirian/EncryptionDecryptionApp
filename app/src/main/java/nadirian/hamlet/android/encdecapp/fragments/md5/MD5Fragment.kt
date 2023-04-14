package nadirian.hamlet.android.encdecapp.fragments.md5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nadirian.hamlet.android.encdecapp.databinding.FragmentMd5Binding
import nadirian.hamlet.android.encdecapp.model.md5_hash.MD5

class MD5Fragment : Fragment() {
    private var _binding:FragmentMd5Binding?=null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMd5Binding.inflate(inflater,container,false)
        val view = _binding!!.root
        var plaintTextEt = binding!!.plaintextForEncEdt.text
        binding!!.encryptBtn.setOnClickListener {
            var edtToString = plaintTextEt.toString()
            var parsString = MD5.md5(edtToString)
            binding!!.resultOfEncrypted.setText(parsString)
        }
        return view
    }

}