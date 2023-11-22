package com.dessapplication.app.modules.notifikasicomunity.ui

import androidx.fragment.app.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseFragment
import com.dessapplication.app.databinding.FragmentNotifikasiComunityBinding
import com.dessapplication.app.modules.notifikasicomunity.`data`.viewmodel.NotifikasiComunityVM
import kotlin.String
import kotlin.Unit

class NotifikasiComunityFragment :
    BaseFragment<FragmentNotifikasiComunityBinding>(R.layout.fragment_notifikasi_comunity) {
  private val viewModel: NotifikasiComunityVM by viewModels<NotifikasiComunityVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.notifikasiComunityVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "NOTIFIKASI_COMUNITY_FRAGMENT"

  }
}
