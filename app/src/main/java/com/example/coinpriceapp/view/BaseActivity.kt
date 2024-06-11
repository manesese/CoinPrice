package com.example.coinpriceapp.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.coinpriceapp.R
import com.example.coinpriceapp.databinding.ActivityBaseBinding
import timber.log.Timber



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
        Timber.e("앱 시작")

        setupSplashFragment()

    }

    // splash setUp
    private fun setupSplashFragment() {
        onReplaceFragment(SplashFragment(), false)
    }

    // fragment 변경
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
