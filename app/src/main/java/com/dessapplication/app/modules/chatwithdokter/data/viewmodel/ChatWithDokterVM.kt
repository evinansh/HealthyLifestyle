package com.dessapplication.app.modules.chatwithdokter.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.chatwithdokter.`data`.model.ChatWithDokterModel
import org.koin.core.KoinComponent

class ChatWithDokterVM : ViewModel(), KoinComponent {
  val chatWithDokterModel: MutableLiveData<ChatWithDokterModel> =
      MutableLiveData(ChatWithDokterModel())

  var navArguments: Bundle? = null
}
