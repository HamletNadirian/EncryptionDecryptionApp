package nadirian.hamlet.android.encdecapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class SelectDecCipherFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_select_dec_cipher,container,false)

        val selectDecForAESBt = view.findViewById<Button>(R.id.decAesCipherBt)
        val selectDecForDESBt = view.findViewById<Button>(R.id.decDESCipherBt)
        val selectDecForASCIBt = view.findViewById<Button>(R.id.decASCICodeBt)
        val selectDecForCaesarBt = view.findViewById<Button>(R.id.decCaesarCipherBt)
        val selectDecForBase64Bt = view.findViewById<Button>(R.id.decBase64Bt)
        val selectDecForAffineCodeBt = view.findViewById<Button>(R.id.decAffineCodeBt)
        val selectDecUTF8CodeBt = view.findViewById<Button>(R.id.decUTF8CodeBt)
        val selectBlowfishBt = view.findViewById<Button>(R.id.decBlowfishBt)
        val selectBinaryBt = view.findViewById<Button>(R.id.decBinaryBt)
        val selectHexBt = view.findViewById<Button>(R.id.decHexBt)

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
        selectDecForDESBt.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_selectDecCipherFragment_to_DESCipherDecFragment)
        }
        selectBlowfishBt.setOnClickListener {
            view.findNavController().navigate(R.id.action_selectDecCipherFragment_to_blowFishDecFragment)
        }
        selectBinaryBt.setOnClickListener {
            view.findNavController().navigate(R.id.action_selectDecCipherFragment_to_binaryDecFragment)
        }
        selectHexBt.setOnClickListener {
            view.findNavController().navigate(R.id.action_selectDecCipherFragment_to_hexDecFragment)
        }
        return view
    }

}