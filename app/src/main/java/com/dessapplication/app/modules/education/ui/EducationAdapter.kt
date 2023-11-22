package com.dessapplication.app.modules.education.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dessapplication.app.R
import com.dessapplication.app.databinding.RowEducationBinding
import com.dessapplication.app.modules.education.`data`.model.EducationRowModel
import kotlin.Int
import kotlin.collections.List

class EducationAdapter(
  var list: List<EducationRowModel>
) : RecyclerView.Adapter<EducationAdapter.RowEducationVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowEducationVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_education,parent,false)
    return RowEducationVH(view)
  }

  override fun onBindViewHolder(holder: RowEducationVH, position: Int) {
    val educationRowModel = EducationRowModel()
    // TODO uncomment following line after integration with data source
    // val educationRowModel = list[position]
    holder.binding.educationRowModel = educationRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<EducationRowModel>) {
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
      item: EducationRowModel
    ) {
    }
  }

  inner class RowEducationVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowEducationBinding = RowEducationBinding.bind(itemView)
    init {
      binding.linearRowrectangleseventeen.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, EducationRowModel())
      }
    }
  }
}
