package com.dessapplication.app.modules.notifikasi1.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Notifikasi1Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifikasi: String? = MyApp.getInstance().resources.getString(R.string.lbl_notifikasi)

)
