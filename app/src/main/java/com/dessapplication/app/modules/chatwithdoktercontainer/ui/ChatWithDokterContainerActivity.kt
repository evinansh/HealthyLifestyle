package com.dessapplication.app.modules.chatwithdoktercontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityChatWithDokterContainerBinding
import com.dessapplication.app.extensions.loadFragment
import com.dessapplication.app.modules.chatwithdokter.ui.ChatWithDokterFragment
import com.dessapplication.app.modules.chatwithdoktercontainer.`data`.viewmodel.ChatWithDokterContainerVM
import kotlin.String
import kotlin.Unit

class ChatWithDokterContainerActivity :
    BaseActivity<ActivityChatWithDokterContainerBinding>(R.layout.activity_chat_with_dokter_container)
    {
  private val viewModel: ChatWithDokterContainerVM by viewModels<ChatWithDokterContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.chatWithDokterContainerVM = viewModel
    val destFragment = ChatWithDokterFragment.getInstance(null)
    this.loadFragment(
    R.id.fragmentContainer,
    destFragment,
    bundle = destFragment.arguments,
    tag = ChatWithDokterFragment.TAG,
    addToBackStack = false,
    add = false,
    enter = null,
    exit = null,
    )
  }

  override fun setUpClicks(): Unit {
    binding.viewRectangleFortyTwo.setOnClickListener {
      val destFragment = ChatWithDokterFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = ChatWithDokterFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
  }

  companion object {
    const val TAG: String = "CHAT_WITH_DOKTER_CONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChatWithDokterContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
