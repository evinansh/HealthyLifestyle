package com.dessapplication.app.modules.education.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.education.`data`.model.EducationModel
import com.dessapplication.app.modules.education.`data`.model.EducationRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EducationVM : ViewModel(), KoinComponent {
  val educationModel: MutableLiveData<EducationModel> = MutableLiveData(EducationModel())

  var navArguments: Bundle? = null

  val educationList: MutableLiveData<MutableList<EducationRowModel>> =
      MutableLiveData(mutableListOf())
}
