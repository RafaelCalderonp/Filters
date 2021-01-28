package com.example.filters

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.filters.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding : ActivityMainBinding

    private val numbersList = listOf("one", "five",
        "two", "three", "four")
    private val instanceList = listOf(null, 1, "two",
        3.0, "four")
    private val numbersMap = mapOf("key1" to 1,
        "key2" to 2, "key3" to 3, "key11" to 11)
    private val unsortedList = listOf(7, 8, 5, 3, 2, 4)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.btPar.setOnClickListener {
            val par = unsortedList.filter{ it % 2 == 0 }
            mBinding.tvFilter.setText(par.toString())
        }
        mBinding.btLength.setOnClickListener {
            val largo = numbersList.filter { it.length > 3 }
            mBinding.tvFilter.setText(largo.toString())
        }
        mBinding.btNoNull.setOnClickListener {
            val notNull = instanceList.filterNotNull()
            mBinding.tvFilter.setText(notNull.toString())
        }



    }

}


