package com.example.kotlin_mvvm_test.view

import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.kotlin_mvvm_test.R
import com.example.kotlin_mvvm_test.databinding.ActivityMainBinding
import com.example.kotlin_mvvm_test.viewmodel.MainViewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun getViewModel(): Class<MainViewModel> {
        return MainViewModel::class.java
    }

    override fun initBindingVariables() {
        mBinding.viewModel = mViewModel
    }

    override fun observe() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


}
