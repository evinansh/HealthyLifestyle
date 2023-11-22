package com.dessapplication.app.modules.educationtwo.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EducationTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEducation: String? = MyApp.getInstance().resources.getString(R.string.lbl_education)
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
  var txtPenyuluhandila: String? =
      MyApp.getInstance().resources.getString(R.string.msg_penyuluhan_dila)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVerified: String? = MyApp.getInstance().resources.getString(R.string.lbl_verified)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEsterAjeng: String? = MyApp.getInstance().resources.getString(R.string.lbl_ester_ajeng)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_jakarta_idn_ti2)

)
