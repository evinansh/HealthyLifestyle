package com.dessapplication.app.modules.educationtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityEducationTwoBinding
import com.dessapplication.app.modules.education.ui.EducationActivity
import com.dessapplication.app.modules.educationtwo.`data`.viewmodel.EducationTwoVM
import com.dessapplication.app.modules.home.ui.HomeActivity
import com.dessapplication.app.modules.profil.ui.ProfilActivity
import com.dessapplication.app.modules.teskesehatan.ui.TesKesehatanActivity
import kotlin.String
import kotlin.Unit

class EducationTwoActivity :
    BaseActivity<ActivityEducationTwoBinding>(R.layout.activity_education_two) {
  private val viewModel: EducationTwoVM by viewModels<EducationTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.educationTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageUser.setOnClickListener {
      val destIntent = ProfilActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageHome.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageLightbulb.setOnClickListener {
      val destIntent = TesKesehatanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackarrowleft.setOnClickListener {
      val destIntent = EducationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "EDUCATION_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EducationTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
