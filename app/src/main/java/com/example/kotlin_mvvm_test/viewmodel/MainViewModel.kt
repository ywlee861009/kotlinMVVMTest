package com.example.kotlin_mvvm_test.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel {
    var counter: MutableLiveData<Int> = MutableLiveData()

    constructor() {
        counter.value = 0
    }

    fun increase() {
        counter.value = counter.value!! + 1
    }

    fun decrease() {
        counter.value = counter.value!! - 1
    }
}
