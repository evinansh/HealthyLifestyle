package com.dessapplication.app.modules.comunity.ui

import androidx.fragment.app.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseFragment
import com.dessapplication.app.databinding.FragmentComunityBinding
import com.dessapplication.app.modules.chatcomunity.ui.ChatComunityActivity
import com.dessapplication.app.modules.comunity.`data`.viewmodel.ComunityVM
import kotlin.String
import kotlin.Unit

class ComunityFragment : BaseFragment<FragmentComunityBinding>(R.layout.fragment_comunity) {
  private val viewModel: ComunityVM by viewModels<ComunityVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.comunityVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowlogoidntimes.setOnClickListener {
      val destIntent = ChatComunityActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "COMUNITY_FRAGMENT"

  }
}
