package com.dessapplication.app.modules.calls.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dessapplication.app.R
import com.dessapplication.app.databinding.RowCallsBinding
import com.dessapplication.app.modules.calls.`data`.model.CallsRowModel
import kotlin.Int
import kotlin.collections.List

class CallsAdapter(
  var list: List<CallsRowModel>
) : RecyclerView.Adapter<CallsAdapter.RowCallsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCallsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_calls,parent,false)
    return RowCallsVH(view)
  }

  override fun onBindViewHolder(holder: RowCallsVH, position: Int) {
    val callsRowModel = CallsRowModel()
    // TODO uncomment following line after integration with data source
    // val callsRowModel = list[position]
    holder.binding.callsRowModel = callsRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CallsRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: CallsRowModel
    ) {
    }
  }

  inner class RowCallsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCallsBinding = RowCallsBinding.bind(itemView)
  }
}
