package com.dessapplication.app.modules.chatwithdokter.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseFragment
import com.dessapplication.app.databinding.FragmentChatWithDokterBinding
import com.dessapplication.app.modules.chatwithdokter.`data`.viewmodel.ChatWithDokterVM
import kotlin.String
import kotlin.Unit

class ChatWithDokterFragment :
    BaseFragment<FragmentChatWithDokterBinding>(R.layout.fragment_chat_with_dokter) {
  private val viewModel: ChatWithDokterVM by viewModels<ChatWithDokterVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.chatWithDokterVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "CHAT_WITH_DOKTER_FRAGMENT"


    fun getInstance(bundle: Bundle?): ChatWithDokterFragment {
      val fragment = ChatWithDokterFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
