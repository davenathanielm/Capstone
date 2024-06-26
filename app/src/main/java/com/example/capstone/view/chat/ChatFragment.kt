package com.example.capstone.view.chat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.capstone.databinding.FragmentChatBinding

class ChatFragment: Fragment() {

    private var _binding: FragmentChatBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        ini untuk memasukkan model nya
//        val chatViewModel =
//            ViewModelProvider(this).get(ChatViewModel::class.java)

        _binding = FragmentChatBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textChat
//        chatViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }

//        ini km masukin  function sebelum root ya contoh :
//        setUpView()
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}