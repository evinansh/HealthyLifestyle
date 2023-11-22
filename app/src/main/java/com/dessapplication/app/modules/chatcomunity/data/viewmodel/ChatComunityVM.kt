package com.dessapplication.app.modules.chatcomunity.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.chatcomunity.`data`.model.ChatComunityModel
import org.koin.core.KoinComponent

class ChatComunityVM : ViewModel(), KoinComponent {
  val chatComunityModel: MutableLiveData<ChatComunityModel> = MutableLiveData(ChatComunityModel())

  var navArguments: Bundle? = null
}
