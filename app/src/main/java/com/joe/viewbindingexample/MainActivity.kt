package com.joe.viewbindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.joe.viewbindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    public lateinit var mBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBinding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(mBinding.root)

        mBinding.button.text = "A"
        mBinding.textView.text = "TextView"
    }
}