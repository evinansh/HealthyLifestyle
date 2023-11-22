package com.dessapplication.app.modules.vitrualkonsultasi.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class VitrualKonsultasiModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVirtualConsult: String? =
      MyApp.getInstance().resources.getString(R.string.msg_virtual_consult)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDokterUmum: String? = MyApp.getInstance().resources.getString(R.string.lbl_dokter_umum)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDokterGizi: String? = MyApp.getInstance().resources.getString(R.string.lbl_dokter_gizi)

)
