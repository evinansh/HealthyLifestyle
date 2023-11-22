package com.dessapplication.app.modules.chatwithdokterone.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChatWithDokterOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_dr_boyke_sudra2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDokterUmum: String? = MyApp.getInstance().resources.getString(R.string.lbl_dokter_umum)

)
