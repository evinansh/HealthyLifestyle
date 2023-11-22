package com.dessapplication.app.modules.chatwithdokterone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.chatwithdokterone.`data`.model.ChatWithDokterOneModel
import org.koin.core.KoinComponent

class ChatWithDokterOneVM : ViewModel(), KoinComponent {
  val chatWithDokterOneModel: MutableLiveData<ChatWithDokterOneModel> =
      MutableLiveData(ChatWithDokterOneModel())

  var navArguments: Bundle? = null
}
