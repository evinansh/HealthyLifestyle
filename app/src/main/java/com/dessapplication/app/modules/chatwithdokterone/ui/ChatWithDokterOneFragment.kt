package com.dessapplication.app.modules.chatwithdokterone.ui

import androidx.fragment.app.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseFragment
import com.dessapplication.app.databinding.FragmentChatWithDokterOneBinding
import com.dessapplication.app.modules.chatwithdoktercontainer.ui.ChatWithDokterContainerActivity
import com.dessapplication.app.modules.chatwithdokterone.`data`.viewmodel.ChatWithDokterOneVM
import kotlin.String
import kotlin.Unit

class ChatWithDokterOneFragment :
    BaseFragment<FragmentChatWithDokterOneBinding>(R.layout.fragment_chat_with_dokter_one) {
  private val viewModel: ChatWithDokterOneVM by viewModels<ChatWithDokterOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.chatWithDokterOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowairplane.setOnClickListener {
      val destIntent = ChatWithDokterContainerActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "CHAT_WITH_DOKTER_ONE_FRAGMENT"

  }
}
