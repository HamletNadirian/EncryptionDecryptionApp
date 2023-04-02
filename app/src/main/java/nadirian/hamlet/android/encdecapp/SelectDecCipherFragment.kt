package nadirian.hamlet.android.encdecapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class SelectDecCipherFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_select_dec_cipher,container,false)

        val selectDecForAESBt = view.findViewById<Button>(R.id.encAesCipherBt)
        val selectDecForDESBt = view.findViewById<Button>(R.id.encDesCipherBt)
        val selectDecForCaesarBt = view.findViewById<Button>(R.id.decCaesarCipherBt)

        selectDecForAESBt.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_selectDecCipherFragment_to_cipherDecFragment)
        }
        selectDecForDESBt.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_selectDecCipherFragment_to_ASCICodeDecFragment)
        }
        selectDecForCaesarBt.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_selectDecCipherFragment_to_caesarCipherDecFragment)
        }
        return view
    }

}