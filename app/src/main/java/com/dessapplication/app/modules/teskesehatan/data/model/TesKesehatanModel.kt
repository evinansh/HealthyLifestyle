package com.dessapplication.app.modules.teskesehatan.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TesKesehatanModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHealthQuiz: String? = MyApp.getInstance().resources.getString(R.string.lbl_health_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTesKesehatanM: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tes_kesehatan_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kesehatan_menta)

)
