package com.dessapplication.app.modules.vitrualkonsultasi.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dessapplication.app.R
import com.dessapplication.app.databinding.RowListrectanglethirtytwoBinding
import com.dessapplication.app.modules.vitrualkonsultasi.`data`.model.ListrectanglethirtytwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglethirtytwoAdapter(
  var list: List<ListrectanglethirtytwoRowModel>
) : RecyclerView.Adapter<ListrectanglethirtytwoAdapter.RowListrectanglethirtytwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglethirtytwoVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglethirtytwo,parent,false)
    return RowListrectanglethirtytwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglethirtytwoVH, position: Int) {
    val listrectanglethirtytwoRowModel = ListrectanglethirtytwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglethirtytwoRowModel = list[position]
    holder.binding.listrectanglethirtytwoRowModel = listrectanglethirtytwoRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectanglethirtytwoRowModel>) {
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
      item: ListrectanglethirtytwoRowModel
    ) {
    }
  }

  inner class RowListrectanglethirtytwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglethirtytwoBinding = RowListrectanglethirtytwoBinding.bind(itemView)
    init {
      binding.linearColumnrectanglethirtytwo.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListrectanglethirtytwoRowModel())
      }
    }
  }
}
