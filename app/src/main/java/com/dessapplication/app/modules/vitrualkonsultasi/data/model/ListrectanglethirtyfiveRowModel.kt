package com.dessapplication.app.modules.vitrualkonsultasi.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListrectanglethirtyfiveRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDrAhmadNurafOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_ahmad_nuraf)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDokterUmumThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dokter_umum)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOfflineOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_offline)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyThreeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_1_k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_boyke_sudra4)

)
