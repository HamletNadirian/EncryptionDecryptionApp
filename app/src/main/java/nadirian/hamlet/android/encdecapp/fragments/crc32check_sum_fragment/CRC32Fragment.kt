package nadirian.hamlet.android.encdecapp.fragments.crc32check_sum_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nadirian.hamlet.android.encdecapp.databinding.FragmentCRC32Binding
import nadirian.hamlet.android.encdecapp.model.crc32_checksum.CRC32CheckSum


class CRC32Fragment : Fragment() {

    private var _binding:FragmentCRC32Binding?=null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCRC32Binding.inflate(inflater,container,false)
        val view = _binding!!.root
        var plaintTextEt = binding!!.plaintextForEncEdt.text
        binding!!.encryptBtn.setOnClickListener {
            val edtToString = plaintTextEt.toString()

            val parsString = CRC32CheckSum.crc32checksum(edtToString)
            binding!!.resultOfEncrypted.setText(parsString.toString())
        }
        return view
    }

}