package com.dessapplication.app.modules.dailyactivity.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dessapplication.app.R
import com.dessapplication.app.databinding.RowDailyActivityBinding
import com.dessapplication.app.modules.dailyactivity.`data`.model.DailyActivityRowModel
import kotlin.Int
import kotlin.collections.List

class DailyActivityAdapter(
  var list: List<DailyActivityRowModel>
) : RecyclerView.Adapter<DailyActivityAdapter.RowDailyActivityVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDailyActivityVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_daily_activity,parent,false)
    return RowDailyActivityVH(view)
  }

  override fun onBindViewHolder(holder: RowDailyActivityVH, position: Int) {
    val dailyActivityRowModel = DailyActivityRowModel()
    // TODO uncomment following line after integration with data source
    // val dailyActivityRowModel = list[position]
    holder.binding.dailyActivityRowModel = dailyActivityRowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DailyActivityRowModel>) {
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
      item: DailyActivityRowModel
    ) {
    }
  }

  inner class RowDailyActivityVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDailyActivityBinding = RowDailyActivityBinding.bind(itemView)
  }
}
