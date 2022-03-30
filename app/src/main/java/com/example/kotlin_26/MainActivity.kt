package com.example.kotlin_26

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: RandomNumberViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val provider = ViewModelProvider(this)
        viewModel = provider.get(RandomNumberViewModel::class.java)

        observeViewModel()

        initView()
    }

    fun observeViewModel(){
        val edText1 : EditText = findViewById(R.id.rndNum)
        viewModel.ranNum.observe(this, {edText1.setText(it.toString())})
    }

    fun initView(){
        val button1 : Button = findViewById(R.id.getRnd)
        button1.setOnClickListener{
            viewModel.onGenerateClicked()
        }
    }
}