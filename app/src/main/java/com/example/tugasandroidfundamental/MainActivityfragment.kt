package com.example.tugasandroidfundamental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.example.tugasandroidfundamental.databinding.ActivityMainActivityfragmentBinding
import com.example.tugasandroidfundamental.databinding.ActivityMainBinding

class MainActivityfragment : AppCompatActivity() {

    lateinit var binding: ActivityMainActivityfragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainActivityfragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fragment1tn.setOnClickListener {

            replaceFragment(Fragment1())
        }

        binding.fragment2tn.setOnClickListener {

            replaceFragment(Fragment2())


        }
    }

    private fun replaceFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction =fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()




    }
}