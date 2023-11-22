package com.dessapplication.app.modules.profil.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.profil.`data`.model.ProfilModel
import org.koin.core.KoinComponent

class ProfilVM : ViewModel(), KoinComponent {
  val profilModel: MutableLiveData<ProfilModel> = MutableLiveData(ProfilModel())

  var navArguments: Bundle? = null
}
