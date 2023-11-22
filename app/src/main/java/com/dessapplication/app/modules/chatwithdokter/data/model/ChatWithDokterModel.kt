package com.dessapplication.app.modules.chatwithdokter.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChatWithDokterModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDrBoykeSudra: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_boyke_sudra)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDokTangansay: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dok_tangan_say)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHanyakesemutan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hanya_kesemutan)

)
