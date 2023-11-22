package com.dessapplication.app.modules.vitrualkonsultasi.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dessapplication.app.R
import com.dessapplication.app.databinding.RowListrectanglethirtyfiveBinding
import com.dessapplication.app.modules.vitrualkonsultasi.`data`.model.ListrectanglethirtyfiveRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglethirtyfiveAdapter(
  var list: List<ListrectanglethirtyfiveRowModel>
) : RecyclerView.Adapter<ListrectanglethirtyfiveAdapter.RowListrectanglethirtyfiveVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglethirtyfiveVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglethirtyfive,parent,false)
    return RowListrectanglethirtyfiveVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglethirtyfiveVH, position: Int) {
    val listrectanglethirtyfiveRowModel = ListrectanglethirtyfiveRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglethirtyfiveRowModel = list[position]
    holder.binding.listrectanglethirtyfiveRowModel = listrectanglethirtyfiveRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectanglethirtyfiveRowModel>) {
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
      item: ListrectanglethirtyfiveRowModel
    ) {
    }
  }

  inner class RowListrectanglethirtyfiveVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglethirtyfiveBinding =
        RowListrectanglethirtyfiveBinding.bind(itemView)
  }
}
