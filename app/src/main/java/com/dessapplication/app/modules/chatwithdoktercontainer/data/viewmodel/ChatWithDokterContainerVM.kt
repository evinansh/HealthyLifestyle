package com.dessapplication.app.modules.chatwithdoktercontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.chatwithdoktercontainer.`data`.model.ChatWithDokterContainerModel
import org.koin.core.KoinComponent

class ChatWithDokterContainerVM : ViewModel(), KoinComponent {
  val chatWithDokterContainerModel: MutableLiveData<ChatWithDokterContainerModel> =
      MutableLiveData(ChatWithDokterContainerModel())

  var navArguments: Bundle? = null
}
