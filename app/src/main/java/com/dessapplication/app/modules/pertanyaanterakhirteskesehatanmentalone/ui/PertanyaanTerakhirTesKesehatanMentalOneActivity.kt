package com.dessapplication.app.modules.pertanyaanterakhirteskesehatanmentalone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityPertanyaanTerakhirTesKesehatanMentalOneBinding
import com.dessapplication.app.modules.home.ui.HomeActivity
import com.dessapplication.app.modules.pertanyaanterakhirteskesehatanmental.ui.PertanyaanTerakhirTesKesehatanMentalActivity
import com.dessapplication.app.modules.pertanyaanterakhirteskesehatanmentalone.`data`.viewmodel.PertanyaanTerakhirTesKesehatanMentalOneVM
import com.dessapplication.app.modules.profil.ui.ProfilActivity
import com.dessapplication.app.modules.teskesehatan.ui.TesKesehatanActivity
import kotlin.String
import kotlin.Unit

class PertanyaanTerakhirTesKesehatanMentalOneActivity :
    BaseActivity<ActivityPertanyaanTerakhirTesKesehatanMentalOneBinding>(R.layout.activity_pertanyaan_terakhir_tes_kesehatan_mental_one)
    {
  private val viewModel: PertanyaanTerakhirTesKesehatanMentalOneVM by
      viewModels<PertanyaanTerakhirTesKesehatanMentalOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pertanyaanTerakhirTesKesehatanMentalOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnUlangi.setOnClickListener {
      val destIntent = TesKesehatanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.frameStackarrowleft.setOnClickListener {
      val destIntent = PertanyaanTerakhirTesKesehatanMentalActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSelesai.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
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
  }

  companion object {
    const val TAG: String = "PERTANYAAN_TERAKHIR_TES_KESEHATAN_MENTAL_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PertanyaanTerakhirTesKesehatanMentalOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
