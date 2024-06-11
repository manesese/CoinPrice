package com.example.coinpriceapp.view.intro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.coinpriceapp.databinding.FragmentIntro2Binding
import com.example.coinpriceapp.view.base.BaseActivity
import com.example.coinpriceapp.view.main.MainFragment


class IntroFragment2 : Fragment() {

    private var _binding: FragmentIntro2Binding? = null
    private val binding: FragmentIntro2Binding get() = _binding!!
    private val activity: BaseActivity by lazy {
        requireActivity() as BaseActivity
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = FragmentIntro2Binding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.nextBtn.setOnClickListener {
            activity.onReplaceFragment(MainFragment(), false)
        }
    }

}