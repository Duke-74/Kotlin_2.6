package com.example.kotlin_26

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class RandomNumberViewModel:ViewModel(){
    val ranNum = MutableLiveData<Int>()

    fun onGenerateClicked(){
        ranNum.value = Random.nextInt(0, 50)
    }
}