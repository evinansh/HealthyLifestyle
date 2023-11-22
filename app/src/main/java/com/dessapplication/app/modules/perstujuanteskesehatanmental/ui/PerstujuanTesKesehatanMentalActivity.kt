package com.dessapplication.app.modules.perstujuanteskesehatanmental.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityPerstujuanTesKesehatanMentalBinding
import com.dessapplication.app.modules.home.ui.HomeActivity
import com.dessapplication.app.modules.perstujuanteskesehatanmental.`data`.viewmodel.PerstujuanTesKesehatanMentalVM
import com.dessapplication.app.modules.pertanyaanteskesehatanmental.ui.PertanyaanTesKesehatanMentalActivity
import com.dessapplication.app.modules.profil.ui.ProfilActivity
import com.dessapplication.app.modules.teskesehatan.ui.TesKesehatanActivity
import kotlin.String
import kotlin.Unit

class PerstujuanTesKesehatanMentalActivity :
    BaseActivity<ActivityPerstujuanTesKesehatanMentalBinding>(R.layout.activity_perstujuan_tes_kesehatan_mental)
    {
  private val viewModel: PerstujuanTesKesehatanMentalVM by
      viewModels<PerstujuanTesKesehatanMentalVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.perstujuanTesKesehatanMentalVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.etLanguage.setOnClickListener {
      val destIntent = PertanyaanTesKesehatanMentalActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = ProfilActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackarrowleft.setOnClickListener {
      val destIntent = TesKesehatanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageHome.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PERSTUJUAN_TES_KESEHATAN_MENTAL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PerstujuanTesKesehatanMentalActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
