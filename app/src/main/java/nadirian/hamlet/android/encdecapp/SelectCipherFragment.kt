package nadirian.hamlet.android.encdecapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class SelectCipherFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_select_cipher, container, false)

        val selectAESBt = view.findViewById<Button>(R.id.encAesCipherBt)
        val selectDESBt = view.findViewById<Button>(R.id.encDESCipherBt)
        val selectASCIIBt = view.findViewById<Button>(R.id.encASCICodeBt)
        val selectCaesar = view.findViewById<Button>(R.id.encCaesarCipherBt)
        val selectBase64EncBt = view.findViewById<Button>(R.id.encBase64Bt)
        val selectAffineCodeEncBt = view.findViewById<Button>(R.id.encAffineCodeBt)
        val selectUTF8CodeEncBt = view.findViewById<Button>(R.id.encUTF8CodeBt)
        val selectHashSHA256Bt = view.findViewById<Button>(R.id.SHA256Bt)
        val selectHashMD5Bt = view.findViewById<Button>(R.id.MD5)
        val selectCRC32Bt = view.findViewById<Button>(R.id.encCRC32ChecksumBt)
        val selectCRC16Bt = view.findViewById<Button>(R.id.encCRC16ChecksumBt)

        selectAESBt.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_selectCipherFragment_to_cipherEncFragment)
        }
        selectASCIIBt.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_selectCipherFragment_to_ASCICodeEncFragment)
        }
        selectCaesar.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_selectCipherFragment_to_caesarCipherFragment)
        }

        selectBase64EncBt.setOnClickListener {
            view.findNavController().navigate(R.id.action_selectCipherFragment_to_base64EncFragment)
        }
        selectAffineCodeEncBt.setOnClickListener {
            view.findNavController().navigate(R.id.action_selectCipherFragment_to_affineCodeEncFragment)
        }
        selectUTF8CodeEncBt.setOnClickListener {
            view.findNavController().navigate(R.id.action_selectCipherFragment_to_UTF8EncFragment)
        }
        selectHashSHA256Bt.setOnClickListener {
            view.findNavController().navigate(R.id.action_selectCipherFragment_to_SHA256Fragment)
        }
        selectHashMD5Bt.setOnClickListener {
            view.findNavController().navigate(R.id.action_selectCipherFragment_to_MD5Fragment)
        }
        selectCRC32Bt.setOnClickListener {
            view.findNavController().navigate(R.id.action_selectCipherFragment_to_CRC32Fragment)
        }
        selectCRC16Bt.setOnClickListener {
            view.findNavController().navigate(R.id.action_selectCipherFragment_to_CRC16Fragment)
        }
        selectDESBt.setOnClickListener {
            view.findNavController().navigate(R.id.action_selectCipherFragment_to_DESCipherEncFragment)
        }
        return view
    }


}