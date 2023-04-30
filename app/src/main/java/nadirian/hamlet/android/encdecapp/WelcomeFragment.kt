package nadirian.hamlet.android.encdecapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_welcome,container,false)

        val encButton = view.findViewById<ImageButton>(R.id.enc)
        val decButton = view.findViewById<ImageButton>(R.id.dec)

        encButton.setOnClickListener {
                view.findNavController().navigate(R.id.action_welcomeFragment_to_selectCipherFragment)
        }

        decButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_welcomeFragment_to_selectDecCipherFragment)
        }

        return view
    }


}