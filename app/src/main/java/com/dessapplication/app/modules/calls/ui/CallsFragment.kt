package com.dessapplication.app.modules.calls.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseFragment
import com.dessapplication.app.databinding.FragmentCallsBinding
import com.dessapplication.app.modules.calls.`data`.model.CallsRowModel
import com.dessapplication.app.modules.calls.`data`.viewmodel.CallsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CallsFragment : BaseFragment<FragmentCallsBinding>(R.layout.fragment_calls) {
  private val viewModel: CallsVM by viewModels<CallsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val callsAdapter = CallsAdapter(viewModel.callsList.value?:mutableListOf())
    binding.recyclerCalls.adapter = callsAdapter
    callsAdapter.setOnItemClickListener(
    object : CallsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CallsRowModel) {
        onClickRecyclerCalls(view, position, item)
      }
    }
    )
    viewModel.callsList.observe(requireActivity()) {
      callsAdapter.updateData(it)
    }
    binding.callsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerCalls(
    view: View,
    position: Int,
    item: CallsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CALLS_FRAGMENT"

  }
}
