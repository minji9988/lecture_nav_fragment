package com.example.lecture_nav_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class ThirdFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // secondeFragment에서 버튼 클릭 시 일어날 event 지정
        val view = inflater.inflate(R.layout.fragment_third, container, false)


        //bnt2 버튼 클릭 시 seconde fragment로 이동
        view.findViewById<Button>(R.id.btn1).setOnClickListener {
            it.findNavController().navigate(R.id.action_thirdFragment_to_firstFragment)
        }

        //bnt3 버튼 클릭 시 third fragment로 이동
        view.findViewById<Button>(R.id.btn2).setOnClickListener {
            it.findNavController().navigate(R.id.action_thirdFragment_to_secondFragment)
        }

        return view

    }
}