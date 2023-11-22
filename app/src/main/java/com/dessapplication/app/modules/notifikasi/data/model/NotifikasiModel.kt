package com.dessapplication.app.modules.notifikasi.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotifikasiModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDrBoykeSudra: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_boyke_sudra3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHanyakesemutan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hanya_kesemutan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIDNTIMES: String? = MyApp.getInstance().resources.getString(R.string.lbl_idn_times)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mengirimkan_art)

)
