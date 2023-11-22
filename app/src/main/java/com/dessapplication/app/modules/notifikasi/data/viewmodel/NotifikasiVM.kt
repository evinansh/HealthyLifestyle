package com.dessapplication.app.modules.notifikasi.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.notifikasi.`data`.model.NotifikasiModel
import org.koin.core.KoinComponent

class NotifikasiVM : ViewModel(), KoinComponent {
  val notifikasiModel: MutableLiveData<NotifikasiModel> = MutableLiveData(NotifikasiModel())

  var navArguments: Bundle? = null
}
