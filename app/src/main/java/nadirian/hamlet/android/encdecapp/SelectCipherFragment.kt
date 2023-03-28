package nadirian.hamlet.android.encdecapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController

class SelectCipherFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_select_cipher, container, false)

        val nextButton1 = view.findViewById<Button>(R.id.encAesCipherBt)
        val nextButton2 = view.findViewById<Button>(R.id.encDesCipherBt)

        nextButton1.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_selectCipherFragment_to_cipherEncFragment)
        }
        return view
    }


}// 1234567891011121
// DygK/dxFEbaUU5veP3V2UA==