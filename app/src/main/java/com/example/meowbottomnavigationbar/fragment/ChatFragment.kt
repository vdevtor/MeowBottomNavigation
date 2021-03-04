package com.example.meowbottomnavigationbar.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.meowbottomnavigationbar.R
import com.example.meowbottomnavigationbar.databinding.FragmentChatBinding
import com.example.meowbottomnavigationbar.databinding.FragmentExplorerBinding


class ChatFragment : Fragment() {

    private var bindind : FragmentChatBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bindind = FragmentChatBinding.inflate(layoutInflater,container,false)
        return bindind?.root
    }


}