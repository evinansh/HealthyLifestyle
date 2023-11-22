package com.dessapplication.app.modules.dailyactivity.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityDailyActivityBinding
import com.dessapplication.app.modules.dailyactivity.`data`.model.DailyActivityRowModel
import com.dessapplication.app.modules.dailyactivity.`data`.viewmodel.DailyVMVM
import com.dessapplication.app.modules.home.ui.HomeActivity
import com.dessapplication.app.modules.profil.ui.ProfilActivity
import com.dessapplication.app.modules.teskesehatan.ui.TesKesehatanActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DailyActivityActivity :
    BaseActivity<ActivityDailyActivityBinding>(R.layout.activity_daily_activity) {
  private val viewModel: DailyVMVM by viewModels<DailyVMVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val dailyActivityAdapter =
    DailyActivityAdapter(viewModel.dailyActivityList.value?:mutableListOf())
    binding.recyclerDailyActivity.adapter = dailyActivityAdapter
    dailyActivityAdapter.setOnItemClickListener(
    object : DailyActivityAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DailyActivityRowModel) {
        onClickRecyclerDailyActivity(view, position, item)
      }
    }
    )
    viewModel.dailyActivityList.observe(this) {
      dailyActivityAdapter.updateData(it)
    }
    binding.dailyVMVM = viewModel
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
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.frameStackarrowleft.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageLightbulbTwo.setOnClickListener {
      val destIntent = TesKesehatanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerDailyActivity(
    view: View,
    position: Int,
    item: DailyActivityRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DAILY_ACTIVITY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DailyActivityActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
