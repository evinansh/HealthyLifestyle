package com.dessapplication.app.modules.chatcomunity.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChatComunityModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtIDNTIMES: String? = MyApp.getInstance().resources.getString(R.string.lbl_idn_times)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCegahStunting: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cegah_stunting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_jakarta_idn_ti4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBacaSelengkapn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_baca_selengkapn)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHttpswwwidn: String? = MyApp.getInstance().resources.getString(R.string.msg_https_www_idn)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt7DampakBuruk: String? =
      MyApp.getInstance().resources.getString(R.string.msg_7_dampak_buruk2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_banyak_orang_ti)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBacaSelengkapnOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_baca_selengkapn)

)
