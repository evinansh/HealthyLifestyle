package com.dessapplication.app.modules.educationtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.educationtwo.`data`.model.EducationTwoModel
import org.koin.core.KoinComponent

class EducationTwoVM : ViewModel(), KoinComponent {
  val educationTwoModel: MutableLiveData<EducationTwoModel> = MutableLiveData(EducationTwoModel())

  var navArguments: Bundle? = null
}
