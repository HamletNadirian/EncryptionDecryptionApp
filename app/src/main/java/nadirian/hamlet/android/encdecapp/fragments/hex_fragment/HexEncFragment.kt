package nadirian.hamlet.android.encdecapp.fragments.hex_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import nadirian.hamlet.android.encdecapp.databinding.FragmentHexEncBinding
import nadirian.hamlet.android.encdecapp.model.string_to_hex.StringToHex.convertStringToHex


class HexEncFragment : Fragment() {

    private var _binding: FragmentHexEncBinding? = null
    private val binding get() = _binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHexEncBinding.inflate(inflater, container, false)
        val view = _binding!!.root
        var plaintTextEt = binding!!.plaintextForEncEdt.text

        binding!!.encryptBtn.setOnClickListener {

            val hex:String= convertStringToHex(plaintTextEt.toString()).toString()

            var result = hex.replace("(.{2})".toRegex(), "$1 ");

            binding!!.cipherTextForEncEdt.setText((result.toString()))
        }

        return view
    }

}