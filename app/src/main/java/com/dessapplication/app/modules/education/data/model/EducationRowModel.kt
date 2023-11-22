package com.dessapplication.app.modules.education.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EducationRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCegahStunting: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cegah_stunting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIDNTIMESEst: String? = MyApp.getInstance().resources.getString(R.string.msg_idn_times_est)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_jakarta_idn_ti)

)
