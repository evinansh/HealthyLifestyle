package com.dessapplication.app.modules.perstujuanteskesehatanmental.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PerstujuanTesKesehatanMentalModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHealthQuiz: String? = MyApp.getInstance().resources.getString(R.string.lbl_health_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPernyataan: String? = MyApp.getInstance().resources.getString(R.string.lbl_pernyataan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_test_ini_tidak)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etLanguageValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etLanguageOneValue: String? = null
)
