package com.dessapplication.app.modules.pertanyaanterakhirteskesehatanmentalone.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PertanyaanTerakhirTesKesehatanMentalOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHealthQuiz: String? = MyApp.getInstance().resources.getString(R.string.lbl_health_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYukCekHasilny: String? =
      MyApp.getInstance().resources.getString(R.string.msg_yuk_cek_hasilny)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKamusudahberh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kamu_sudah_berh)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_yuk_pertimbangk)

)
