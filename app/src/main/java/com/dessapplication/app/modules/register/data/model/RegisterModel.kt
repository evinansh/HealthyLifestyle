package com.dessapplication.app.modules.register.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RegisterModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.msg_sign_up_for_fre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextOne: String? = MyApp.getInstance().resources.getString(R.string.msg_get_started_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_email_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNameOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNameTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_password_confir)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etContentValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etAlertNotificatValue: String? = null
)
