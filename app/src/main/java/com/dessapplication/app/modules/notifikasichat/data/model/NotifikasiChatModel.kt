package com.dessapplication.app.modules.notifikasichat.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotifikasiChatModel(
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

)
