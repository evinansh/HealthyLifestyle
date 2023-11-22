package com.dessapplication.app.modules.chatcomunity.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityChatComunityBinding
import com.dessapplication.app.modules.chatcomunity.`data`.viewmodel.ChatComunityVM
import com.dessapplication.app.modules.home.ui.HomeActivity
import com.dessapplication.app.modules.profil.ui.ProfilActivity
import com.dessapplication.app.modules.teskesehatan.ui.TesKesehatanActivity
import kotlin.String
import kotlin.Unit

class ChatComunityActivity :
    BaseActivity<ActivityChatComunityBinding>(R.layout.activity_chat_comunity) {
  private val viewModel: ChatComunityVM by viewModels<ChatComunityVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.chatComunityVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageLightbulb.setOnClickListener {
      val destIntent = TesKesehatanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageUser.setOnClickListener {
      val destIntent = ProfilActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageHome.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CHAT_COMUNITY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChatComunityActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
