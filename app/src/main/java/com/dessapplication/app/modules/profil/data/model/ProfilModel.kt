package com.dessapplication.app.modules.profil.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfilModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMypage: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_page)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFortyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBambangSuderaj: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bambang_suderaj)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProMember: String? = MyApp.getInstance().resources.getString(R.string.lbl_pro_member)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFortyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFortyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_privacy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupForty: String? = MyApp.getInstance().resources.getString(R.string.lbl_chats)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_notifikasi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtyEight: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_language)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtySeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_help)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_invite_a_friend)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_out)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_power_by_star)

)
