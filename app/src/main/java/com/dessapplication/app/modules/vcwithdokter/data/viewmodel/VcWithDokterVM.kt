package com.dessapplication.app.modules.vcwithdokter.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.vcwithdokter.`data`.model.VcWithDokterModel
import org.koin.core.KoinComponent

class VcWithDokterVM : ViewModel(), KoinComponent {
  val vcWithDokterModel: MutableLiveData<VcWithDokterModel> = MutableLiveData(VcWithDokterModel())

  var navArguments: Bundle? = null
}
