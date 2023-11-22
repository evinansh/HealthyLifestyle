package com.dessapplication.app.modules.comunity.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ComunityModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtIDNTIMES: String? = MyApp.getInstance().resources.getString(R.string.lbl_idn_times)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_idn_times_is_th)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKaskus: String? = MyApp.getInstance().resources.getString(R.string.lbl_kaskus)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kaskus_adalah_t)

)
