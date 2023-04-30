package nadirian.hamlet.android.encdecapp.fragments.binary_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import nadirian.hamlet.android.encdecapp.databinding.FragmentBinaryDecBinding
import nadirian.hamlet.android.encdecapp.model.string_to_binary.StringToBinary.strToBinary


class BinaryDecFragment : Fragment() {

    private var _binding: FragmentBinaryDecBinding?=null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentBinaryDecBinding.inflate(inflater,container,false)

        val view = _binding!!.root
        var ciphertextEt = binding!!.ciphertextForDecEdt.text

        binding!!.decryptBtn.setOnClickListener {
                binding!!.plainTextForDecEdt.setText(strToBinary(ciphertextEt.toString()))
        }

        return view

    }

}