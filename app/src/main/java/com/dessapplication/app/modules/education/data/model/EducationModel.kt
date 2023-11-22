package com.dessapplication.app.modules.education.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EducationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEducation: String? = MyApp.getInstance().resources.getString(R.string.lbl_education)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArtikel: String? = MyApp.getInstance().resources.getString(R.string.lbl_artikel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKesehatan: String? = MyApp.getInstance().resources.getString(R.string.lbl_kesehatan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLainyaCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_lainya)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOlahraga: String? = MyApp.getInstance().resources.getString(R.string.lbl_olahraga)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt5LatihanKalis: String? =
      MyApp.getInstance().resources.getString(R.string.msg_5_latihan_kalis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIDNTIMESElb: String? = MyApp.getInstance().resources.getString(R.string.msg_idn_times_elb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_setiap_orang_pa3)

)
