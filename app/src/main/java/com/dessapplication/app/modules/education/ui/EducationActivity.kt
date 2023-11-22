package com.dessapplication.app.modules.education.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityEducationBinding
import com.dessapplication.app.modules.education.`data`.model.EducationRowModel
import com.dessapplication.app.modules.education.`data`.viewmodel.EducationVM
import com.dessapplication.app.modules.educationtwo.ui.EducationTwoActivity
import com.dessapplication.app.modules.home.ui.HomeActivity
import com.dessapplication.app.modules.profil.ui.ProfilActivity
import com.dessapplication.app.modules.teskesehatan.ui.TesKesehatanActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EducationActivity : BaseActivity<ActivityEducationBinding>(R.layout.activity_education) {
  private val viewModel: EducationVM by viewModels<EducationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val educationAdapter = EducationAdapter(viewModel.educationList.value?:mutableListOf())
    binding.recyclerEducation.adapter = educationAdapter
    educationAdapter.setOnItemClickListener(
    object : EducationAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : EducationRowModel) {
        onClickRecyclerEducation(view, position, item)
      }
    }
    )
    viewModel.educationList.observe(this) {
      educationAdapter.updateData(it)
    }
    binding.educationVM = viewModel
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
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearRow.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerEducation(
    view: View,
    position: Int,
    item: EducationRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowrectangleseventeen ->  {
        val destIntent = EducationTwoActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "EDUCATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EducationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
