package com.dessapplication.app.modules.pertanyaanterakhirteskesehatanmental.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PertanyaanTerakhirTesKesehatanMentalModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHealthQuiz: String? = MyApp.getInstance().resources.getString(R.string.lbl_health_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPertanyaan: String? = MyApp.getInstance().resources.getString(R.string.lbl_pertanyaan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_dalam_4_minggu2)

)
