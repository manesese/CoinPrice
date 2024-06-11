package com.example.coinpriceapp.view

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import com.example.coinpriceapp.R
import com.example.coinpriceapp.databinding.FragmentIntro2Binding
import com.example.coinpriceapp.databinding.FragmentIntroBinding
import com.example.coinpriceapp.databinding.FragmentSplashBinding


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
        }
    }

}