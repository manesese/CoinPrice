package com.example.coinpriceapp.view.intro

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import com.example.coinpriceapp.R
import com.example.coinpriceapp.databinding.FragmentSplashBinding
import com.example.coinpriceapp.view.base.BaseActivity
import com.example.coinpriceapp.view.intro.IntroFragment


class SplashFragment : Fragment() {

    private var _binding: FragmentSplashBinding? = null
    private val binding: FragmentSplashBinding get() = _binding!!
    private val activity: BaseActivity by lazy {
        requireActivity() as BaseActivity
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = FragmentSplashBinding.inflate(layoutInflater)
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

        // splash animation 보여주기
        binding.splashIv.startAnimation(
            AnimationUtils.loadAnimation(
                requireContext(),
                R.anim.splash_anim
            )
        )

        //3초 후 화면 이동
        Handler(Looper.myLooper()!!).postDelayed({
            activity.onReplaceFragment(IntroFragment(), false)
        }, 3000)
    }

}