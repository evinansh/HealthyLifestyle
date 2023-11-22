package com.dessapplication.app.modules.vitrualkonsultasi.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.vitrualkonsultasi.`data`.model.ListrectanglethirtyfiveRowModel
import com.dessapplication.app.modules.vitrualkonsultasi.`data`.model.ListrectanglethirtytwoRowModel
import com.dessapplication.app.modules.vitrualkonsultasi.`data`.model.VitrualKonsultasiModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class VitrualKonsultasiVM : ViewModel(), KoinComponent {
  val vitrualKonsultasiModel: MutableLiveData<VitrualKonsultasiModel> =
      MutableLiveData(VitrualKonsultasiModel())

  var navArguments: Bundle? = null

  val listrectanglethirtytwoList: MutableLiveData<MutableList<ListrectanglethirtytwoRowModel>> =
      MutableLiveData(mutableListOf())

  val listrectanglethirtyfiveList: MutableLiveData<MutableList<ListrectanglethirtyfiveRowModel>> =
      MutableLiveData(mutableListOf())
}
