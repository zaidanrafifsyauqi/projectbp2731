package com.example.projectbp2731

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.projectbp2641.FableFragment
import com.example.projectbp2641.FairFragment
import com.example.projectbp2641.R
import com.example.projectbp2641.ScienceFragment
import com.example.projectbp2641.databinding.ActivityBookKidBinding

class BookKidActivity : AppCompatActivity() {
    lateinit var binding: ActivityBookKidBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookKidBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFairy.setOnClickListener {
            replaceFragment(FairFragment())
        }
        binding.buttonfable.setOnClickListener {
            replaceFragment(FableFragment())
        }
        binding.buttonscience.setOnClickListener {
            replaceFragment(ScienceFragment())
        }


    }
    private fun replaceFragment(frg:Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentKidBook,frg)
        fragmentTrx.commit()
    }

}