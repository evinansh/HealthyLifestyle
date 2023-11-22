package com.dessapplication.app.modules.vitrualkonsultasi.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityVitrualKonsultasiBinding
import com.dessapplication.app.modules.chatwithdoktercontainer.ui.ChatWithDokterContainerActivity
import com.dessapplication.app.modules.home.ui.HomeActivity
import com.dessapplication.app.modules.teskesehatan.ui.TesKesehatanActivity
import com.dessapplication.app.modules.vitrualkonsultasi.`data`.model.ListrectanglethirtyfiveRowModel
import com.dessapplication.app.modules.vitrualkonsultasi.`data`.model.ListrectanglethirtytwoRowModel
import com.dessapplication.app.modules.vitrualkonsultasi.`data`.viewmodel.VitrualKonsultasiVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class VitrualKonsultasiActivity :
    BaseActivity<ActivityVitrualKonsultasiBinding>(R.layout.activity_vitrual_konsultasi) {
  private val viewModel: VitrualKonsultasiVM by viewModels<VitrualKonsultasiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectanglethirtytwoAdapter =
    ListrectanglethirtytwoAdapter(viewModel.listrectanglethirtytwoList.value?:mutableListOf())
    binding.recyclerListrectanglethirtytwo.adapter = listrectanglethirtytwoAdapter
    listrectanglethirtytwoAdapter.setOnItemClickListener(
    object : ListrectanglethirtytwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrectanglethirtytwoRowModel) {
        onClickRecyclerListrectanglethirtytwo(view, position, item)
      }
    }
    )
    viewModel.listrectanglethirtytwoList.observe(this) {
      listrectanglethirtytwoAdapter.updateData(it)
    }
    val listrectanglethirtyfiveAdapter =
    ListrectanglethirtyfiveAdapter(viewModel.listrectanglethirtyfiveList.value?:mutableListOf())
    binding.recyclerListrectanglethirtyfive.adapter = listrectanglethirtyfiveAdapter
    listrectanglethirtyfiveAdapter.setOnItemClickListener(
    object : ListrectanglethirtyfiveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrectanglethirtyfiveRowModel) {
        onClickRecyclerListrectanglethirtyfive(view, position, item)
      }
    }
    )
    viewModel.listrectanglethirtyfiveList.observe(this) {
      listrectanglethirtyfiveAdapter.updateData(it)
    }
    binding.vitrualKonsultasiVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackarrowleft.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageHome.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageLightbulb.setOnClickListener {
      val destIntent = TesKesehatanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListrectanglethirtytwo(
    view: View,
    position: Int,
    item: ListrectanglethirtytwoRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnrectanglethirtytwo -> {
        val destIntent = ChatWithDokterContainerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  fun onClickRecyclerListrectanglethirtyfive(
    view: View,
    position: Int,
    item: ListrectanglethirtyfiveRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "VITRUAL_KONSULTASI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, VitrualKonsultasiActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
