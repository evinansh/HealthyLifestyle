package com.dessapplication.app.modules.calls.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.calls.`data`.model.CallsModel
import com.dessapplication.app.modules.calls.`data`.model.CallsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CallsVM : ViewModel(), KoinComponent {
  val callsModel: MutableLiveData<CallsModel> = MutableLiveData(CallsModel())

  var navArguments: Bundle? = null

  val callsList: MutableLiveData<MutableList<CallsRowModel>> = MutableLiveData(mutableListOf())
}
