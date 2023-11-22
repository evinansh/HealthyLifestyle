package com.dessapplication.app.modules.dailyactivity.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.dailyactivity.`data`.model.DailyActivityRowModel
import com.dessapplication.app.modules.dailyactivity.`data`.model.DailyModelModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DailyVMVM : ViewModel(), KoinComponent {
  val dailyModelModel: MutableLiveData<DailyModelModel> = MutableLiveData(DailyModelModel())

  var navArguments: Bundle? = null

  val dailyActivityList: MutableLiveData<MutableList<DailyActivityRowModel>> =
      MutableLiveData(mutableListOf())
}
