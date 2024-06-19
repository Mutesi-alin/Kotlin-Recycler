package com.example.fibonacci

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.fibonacci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val orders= nums(100)
        binding.tvNumbers.layoutManager=GridLayoutManager(this,4)
        var neworders= FibonacciNumbers(orders)
        binding.tvNumbers.adapter= neworders


    }
    fun nums(num:Int):List<Int>{
        val orders= mutableListOf(0,1)
        while (orders.size<num){
            orders.add(orders[orders.lastIndex]+ orders[orders.lastIndex-1])

        }
        return orders

    }
}