package com.dessapplication.app.modules.notifikasicomunity.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotifikasiComunityModel(
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
