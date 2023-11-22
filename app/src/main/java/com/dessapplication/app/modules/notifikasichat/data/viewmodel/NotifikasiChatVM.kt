package com.dessapplication.app.modules.notifikasichat.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.notifikasichat.`data`.model.NotifikasiChatModel
import org.koin.core.KoinComponent

class NotifikasiChatVM : ViewModel(), KoinComponent {
  val notifikasiChatModel: MutableLiveData<NotifikasiChatModel> =
      MutableLiveData(NotifikasiChatModel())

  var navArguments: Bundle? = null
}
