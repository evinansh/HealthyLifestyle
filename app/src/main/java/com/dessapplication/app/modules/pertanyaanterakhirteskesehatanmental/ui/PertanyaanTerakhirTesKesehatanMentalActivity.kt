package com.dessapplication.app.modules.pertanyaanterakhirteskesehatanmental.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityPertanyaanTerakhirTesKesehatanMentalBinding
import com.dessapplication.app.modules.home.ui.HomeActivity
import com.dessapplication.app.modules.pertanyaanterakhirteskesehatanmental.`data`.viewmodel.PertanyaanTerakhirTesKesehatanMentalVM
import com.dessapplication.app.modules.pertanyaanterakhirteskesehatanmentalone.ui.PertanyaanTerakhirTesKesehatanMentalOneActivity
import com.dessapplication.app.modules.pertanyaanteskesehatanmental.ui.PertanyaanTesKesehatanMentalActivity
import com.dessapplication.app.modules.profil.ui.ProfilActivity
import kotlin.String
import kotlin.Unit

class PertanyaanTerakhirTesKesehatanMentalActivity :
    BaseActivity<ActivityPertanyaanTerakhirTesKesehatanMentalBinding>(R.layout.activity_pertanyaan_terakhir_tes_kesehatan_mental)
    {
  private val viewModel: PertanyaanTerakhirTesKesehatanMentalVM by
      viewModels<PertanyaanTerakhirTesKesehatanMentalVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pertanyaanTerakhirTesKesehatanMentalVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnKadangKadangOne.setOnClickListener {
      val destIntent = PertanyaanTerakhirTesKesehatanMentalOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnJarang.setOnClickListener {
      val destIntent = PertanyaanTerakhirTesKesehatanMentalOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnTidakPernah.setOnClickListener {
      val destIntent = PertanyaanTerakhirTesKesehatanMentalOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.frameStackarrowleft.setOnClickListener {
      val destIntent = PertanyaanTesKesehatanMentalActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageHome.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = ProfilActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSelalu.setOnClickListener {
      val destIntent = PertanyaanTerakhirTesKesehatanMentalOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSering.setOnClickListener {
      val destIntent = PertanyaanTerakhirTesKesehatanMentalOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PERTANYAAN_TERAKHIR_TES_KESEHATAN_MENTAL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PertanyaanTerakhirTesKesehatanMentalActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
