package com.dessapplication.app.modules.teskesehatan.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityTesKesehatanBinding
import com.dessapplication.app.modules.home.ui.HomeActivity
import com.dessapplication.app.modules.perstujuanteskesehatanmental.ui.PerstujuanTesKesehatanMentalActivity
import com.dessapplication.app.modules.profil.ui.ProfilActivity
import com.dessapplication.app.modules.teskesehatan.`data`.viewmodel.TesKesehatanVM
import kotlin.String
import kotlin.Unit

class TesKesehatanActivity :
    BaseActivity<ActivityTesKesehatanBinding>(R.layout.activity_tes_kesehatan) {
  private val viewModel: TesKesehatanVM by viewModels<TesKesehatanVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tesKesehatanVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnStart.setOnClickListener {
      val destIntent = PerstujuanTesKesehatanMentalActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageHome.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = ProfilActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackarrowleft.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TES_KESEHATAN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TesKesehatanActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
