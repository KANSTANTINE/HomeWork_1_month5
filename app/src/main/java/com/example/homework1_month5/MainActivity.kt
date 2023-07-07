package com.example.homework1_month5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.homework1_month5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {

    private lateinit var binding: ActivityMainBinding
    private var presenter = Presenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.init(this)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            btnPlus.setOnClickListener {
                presenter.increment()
            }
            btnMinus.setOnClickListener {
                presenter.decrement()
            }
        }
    }

    override fun showCount(count: String) {
        binding.tvDot.text = count
    }

    override fun showToast(message: String) {
        Toast.makeText(applicationContext, message , Toast.LENGTH_SHORT).show()
    }

    override fun changeColor(color: Int) {
        binding.tvDot.setTextColor(color)
    }
}