package com.dessapplication.app.modules.profil.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityProfilBinding
import com.dessapplication.app.modules.home.ui.HomeActivity
import com.dessapplication.app.modules.login.ui.LoginActivity
import com.dessapplication.app.modules.profil.`data`.viewmodel.ProfilVM
import com.dessapplication.app.modules.teskesehatan.ui.TesKesehatanActivity
import kotlin.String
import kotlin.Unit

class ProfilActivity : BaseActivity<ActivityProfilBinding>(R.layout.activity_profil) {
  private val viewModel: ProfilVM by viewModels<ProfilVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profilVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageUser.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageHome.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackarrowleft.setOnClickListener {
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
    binding.txtGroupThirtyFive.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PROFIL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfilActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
