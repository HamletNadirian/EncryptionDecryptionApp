package nadirian.hamlet.android.encdecapp.fragments.hex_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import nadirian.hamlet.android.encdecapp.databinding.FragmentHexDecBinding
import nadirian.hamlet.android.encdecapp.model.string_to_hex.StringToHex.convertHexToString


class HexDecFragment : Fragment() {
    private var _binding: FragmentHexDecBinding? = null
    private val binding get() = _binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHexDecBinding.inflate(inflater, container, false)

        val view = _binding!!.root
        var ciphertextEt = binding!!.ciphertextForDecEdt.text
        try {
            binding!!.decryptBtn.setOnClickListener {
                binding!!.plainTextForDecEdt.setText(convertHexToString(ciphertextEt.toString()))
            }
        } catch (e: IllegalArgumentException) {
            Toast.makeText(activity, "Test", Toast.LENGTH_LONG).show()
        }
        return view
    }
}