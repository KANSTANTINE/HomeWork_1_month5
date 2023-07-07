package com.example.homework1_month5

import android.graphics.Color

class Presenter {

    private lateinit var view: CounterView
    private var model = CounterModel()

    fun increment() {
        model.increment()
        view.showCount(model.count.toString())

        if (model.count == 10) {
            view.showToast("Поздравляем")
        }

        if (model.count == 15){
            view.changeColor(Color.GREEN)
        }
    }

    fun decrement() {
        model.decrement()
        view.showCount(model.count.toString())
    }

    fun init(view: CounterView) {
        this.view = view
    }
}