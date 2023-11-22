package com.dessapplication.app.modules.vitrualkonsultasi.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListrectanglethirtytwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDrAhmadNuraf: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_ahmad_nuraf)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDokterUmumOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_dokter_umum)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOffline: String? = MyApp.getInstance().resources.getString(R.string.lbl_offline)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_1_k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_ahmad_nuraf2)

)
