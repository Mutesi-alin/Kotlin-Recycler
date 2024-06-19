package com.example.fibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class FibonacciNumbers ( var numbers:List<Int>):RecyclerView.Adapter<NumsHodler>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumsHodler {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.numbers_list,parent,false)
        return NumsHodler(itemView)
    }

    override fun getItemCount(): Int {
        return  numbers.size

    }

    override fun onBindViewHolder(holder: NumsHodler, position: Int) {
 holder.rvNumbers.text= numbers[position].toString()
    }


}
class NumsHodler(itemView:View):ViewHolder(itemView){
    var  rvNumbers= itemView.findViewById<TextView>(R.id.rvNumbers)


}