package com.dessapplication.app.modules.notifikasichat.ui

import androidx.fragment.app.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseFragment
import com.dessapplication.app.databinding.FragmentNotifikasiChatBinding
import com.dessapplication.app.modules.chatwithdoktercontainer.ui.ChatWithDokterContainerActivity
import com.dessapplication.app.modules.notifikasichat.`data`.viewmodel.NotifikasiChatVM
import kotlin.String
import kotlin.Unit

class NotifikasiChatFragment :
    BaseFragment<FragmentNotifikasiChatBinding>(R.layout.fragment_notifikasi_chat) {
  private val viewModel: NotifikasiChatVM by viewModels<NotifikasiChatVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.notifikasiChatVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnellipseeighteen.setOnClickListener {
      val destIntent = ChatWithDokterContainerActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "NOTIFIKASI_CHAT_FRAGMENT"

  }
}
