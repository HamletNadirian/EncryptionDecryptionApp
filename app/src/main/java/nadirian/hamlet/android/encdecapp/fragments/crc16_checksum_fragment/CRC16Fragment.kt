package nadirian.hamlet.android.encdecapp.fragments.crc16_checksum_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nadirian.hamlet.android.encdecapp.databinding.FragmentCRC16Binding
import nadirian.hamlet.android.encdecapp.model.crc16_checksum.CRC16CheckSum


class CRC16Fragment : Fragment() {


    private var _binding:FragmentCRC16Binding?=null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCRC16Binding.inflate(inflater,container,false)
        val view = _binding!!.root
        var plaintTextEt = binding!!.plaintextForEncEdt.text
        binding!!.encryptBtn.setOnClickListener {
            val edtToString = plaintTextEt.toString()

            val parsString = CRC16CheckSum.crc16checksum(edtToString)
            binding!!.resultOfEncrypted.setText(parsString.toString())
        }
        return view
    }

}