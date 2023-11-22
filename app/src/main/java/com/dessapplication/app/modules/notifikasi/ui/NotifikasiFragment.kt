package com.dessapplication.app.modules.notifikasi.ui

import androidx.fragment.app.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseFragment
import com.dessapplication.app.databinding.FragmentNotifikasiBinding
import com.dessapplication.app.modules.chatwithdoktercontainer.ui.ChatWithDokterContainerActivity
import com.dessapplication.app.modules.notifikasi.`data`.viewmodel.NotifikasiVM
import kotlin.String
import kotlin.Unit

class NotifikasiFragment : BaseFragment<FragmentNotifikasiBinding>(R.layout.fragment_notifikasi) {
  private val viewModel: NotifikasiVM by viewModels<NotifikasiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.notifikasiVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowellipseeighteen.setOnClickListener {
      val destIntent = ChatWithDokterContainerActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "NOTIFIKASI_FRAGMENT"

  }
}
