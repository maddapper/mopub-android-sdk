package com.zoosk

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView


/**
 * A view holder for R.layout.simple_list_item_1
 */
class DemoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textView: TextView = itemView.findViewById<View>(android.R.id.text1) as TextView
}