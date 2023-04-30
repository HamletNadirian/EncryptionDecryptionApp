package nadirian.hamlet.android.encdecapp.fragments.binary_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import nadirian.hamlet.android.encdecapp.databinding.FragmentBinaryEncBinding
import nadirian.hamlet.android.encdecapp.model.string_to_binary.StringToBinary.convertStringToBinary


class BinaryEncFragment : Fragment() {

    private var _binding: FragmentBinaryEncBinding? = null
    private val binding get() = _binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBinaryEncBinding.inflate(inflater, container, false)
        val view = _binding!!.root
        var plaintTextEt = binding!!.plaintextForEncEdt.text

        binding!!.encryptBtn.setOnClickListener {
            binding!!.cipherTextForEncEdt.setText(convertStringToBinary(plaintTextEt.toString()))
        }

        return view
    }

}