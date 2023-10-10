package com.example.tp1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.tp1.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnToast.setOnClickListener {
            val mytoast = Toast.makeText(context, "hello toast", Toast.LENGTH_SHORT)
            mytoast.show()
        }



        binding.btnCount.setOnClickListener {
            Count()

        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private fun Count() {
        val i= binding.textView.text
        val num= i.toString().toInt()+1
        binding.textView.text= num.toString()
    }
}




