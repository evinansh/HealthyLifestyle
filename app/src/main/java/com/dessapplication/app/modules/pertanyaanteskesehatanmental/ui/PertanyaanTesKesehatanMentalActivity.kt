package com.dessapplication.app.modules.pertanyaanteskesehatanmental.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityPertanyaanTesKesehatanMentalBinding
import com.dessapplication.app.modules.home.ui.HomeActivity
import com.dessapplication.app.modules.perstujuanteskesehatanmental.ui.PerstujuanTesKesehatanMentalActivity
import com.dessapplication.app.modules.pertanyaanterakhirteskesehatanmental.ui.PertanyaanTerakhirTesKesehatanMentalActivity
import com.dessapplication.app.modules.pertanyaanteskesehatanmental.`data`.viewmodel.PertanyaanTesKesehatanMentalVM
import com.dessapplication.app.modules.profil.ui.ProfilActivity
import kotlin.String
import kotlin.Unit

class PertanyaanTesKesehatanMentalActivity :
    BaseActivity<ActivityPertanyaanTesKesehatanMentalBinding>(R.layout.activity_pertanyaan_tes_kesehatan_mental)
    {
  private val viewModel: PertanyaanTesKesehatanMentalVM by
      viewModels<PertanyaanTesKesehatanMentalVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pertanyaanTesKesehatanMentalVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageHome.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = ProfilActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.frameStackarrowleft.setOnClickListener {
      val destIntent = PerstujuanTesKesehatanMentalActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSelalu.setOnClickListener {
      val destIntent = PertanyaanTerakhirTesKesehatanMentalActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSering.setOnClickListener {
      val destIntent = PertanyaanTerakhirTesKesehatanMentalActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnKadangKadangOne.setOnClickListener {
      val destIntent = PertanyaanTerakhirTesKesehatanMentalActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnJarang.setOnClickListener {
      val destIntent = PertanyaanTerakhirTesKesehatanMentalActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnTidakPernah.setOnClickListener {
      val destIntent = PertanyaanTerakhirTesKesehatanMentalActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PERTANYAAN_TES_KESEHATAN_MENTAL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PertanyaanTesKesehatanMentalActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
