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

        val selectDecForAESBt = view.findViewById<Button>(R.id.decAesCipherBt)
        val selectDecForASCIBt = view.findViewById<Button>(R.id.decASCICodeBt)
        val selectDecForCaesarBt = view.findViewById<Button>(R.id.decCaesarCipherBt)
        val selectDecForBase64Bt = view.findViewById<Button>(R.id.decBase64Bt)
        val selectDecForAffineCodeBt = view.findViewById<Button>(R.id.decAffineCodeBt)
        val selectDecUTF8CodeBt = view.findViewById<Button>(R.id.decUTF8CodeBt)

        selectDecForAESBt.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_selectDecCipherFragment_to_cipherDecFragment)
        }
        selectDecForASCIBt.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_selectDecCipherFragment_to_ASCICodeDecFragment)
        }
        selectDecForCaesarBt.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_selectDecCipherFragment_to_caesarCipherDecFragment)
        }
        selectDecForBase64Bt.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_selectDecCipherFragment_to_base64DecFragment)
        }
        selectDecForAffineCodeBt.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_selectDecCipherFragment_to_affineCodeDecFragment)
        }
        selectDecUTF8CodeBt.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_selectDecCipherFragment_to_UTF8DecFragment)
        }
        return view
    }

}