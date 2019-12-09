package com.example.kotlin_mvvm_test.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initView()
        initClass()
        initChildView()
    }

    abstract fun initView()
    abstract fun initClass()
    abstract fun initChildView()
}