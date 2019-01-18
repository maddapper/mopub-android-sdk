package com.zoosk

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.zoosk.DemoViewHolder
import java.util.*


class SearchAdapter : RecyclerView.Adapter<DemoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): DemoViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(android.R.layout.simple_list_item_1, parent, false)
        return DemoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DemoViewHolder, position: Int) {
        holder.textView.text = String.format(Locale.US, "Content Item #%d", position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemCount(): Int {
        return ITEM_COUNT
    }

    companion object {
        private const val ITEM_COUNT = 300
    }
}

