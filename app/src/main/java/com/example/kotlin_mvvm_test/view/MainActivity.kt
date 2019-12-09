package com.example.kotlin_mvvm_test.view

import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.kotlin_mvvm_test.R
import com.example.kotlin_mvvm_test.databinding.ActivityMainBinding
import com.example.kotlin_mvvm_test.viewmodel.MainViewModel

class MainActivity : BaseActivity() {
    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun initView() {
        mBinding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_main
        )
        mBinding.lifecycleOwner = this
    }

    override fun initClass() {
        mViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        mBinding.viewModel = mViewModel
    }

    override fun initChildView() {
        // todo implements
    }

}
