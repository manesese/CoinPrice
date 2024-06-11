package com.example.coinpriceapp.view.base

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.coinpriceapp.R
import com.example.coinpriceapp.databinding.ActivityBaseBinding
import com.example.coinpriceapp.view.intro.SplashFragment
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber


@AndroidEntryPoint
class BaseActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBaseBinding

    interface OnBackPressedListener {
        fun onBackPressed()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val fragmentList = supportFragmentManager.fragments
        for (fragment in fragmentList) {
            if (fragment is OnBackPressedListener) {
                (fragment as OnBackPressedListener).onBackPressed()
                return
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBaseBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupSplashFragment() //Splash Animation

    }

    // Splash SetUp
    private fun setupSplashFragment() {
        onReplaceFragment(SplashFragment(), false)
    }

    // Fragment 변경
    fun onReplaceFragment(fragment: Fragment, addToBackStack: Boolean = true, isVisibleBottomNav: Boolean = false) {
        if(!::binding.isInitialized) {
            binding = ActivityBaseBinding.inflate(layoutInflater)
        }

        if(isVisibleBottomNav) {
            binding.bottomNav.visibility = View.VISIBLE
        } else {
            binding.bottomNav.visibility = View.GONE
        }

        supportFragmentManager.beginTransaction().let {
            it.replace(R.id.fragment_container, fragment)
            if(addToBackStack) {
                it.addToBackStack(null)
            }
            it.commitAllowingStateLoss()
        }
    }
}
