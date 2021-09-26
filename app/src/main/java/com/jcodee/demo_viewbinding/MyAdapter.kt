package com.jcodee.demo_viewbinding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jcodee.demo_viewbinding.databinding.ItemBinding
import kotlinx.android.synthetic.main.item.view.*

class MyAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    lateinit var binding: ItemBinding
    private val people = ArrayList<Person>()

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(person: Person) {
            itemView.name.text = person.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        binding = ItemBinding.inflate(LayoutInflater.from(parent.context))
        return MyViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            holder.bind(people[position])
        }
    }

    override fun getItemCount(): Int {
        return people.size
    }
}