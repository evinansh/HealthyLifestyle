package com.dessapplication.app.modules.notifikasi1.ui

import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityNotifikasi1Binding
import com.dessapplication.app.modules.notifikasi1.`data`.viewmodel.Notifikasi1VM
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.String
import kotlin.Unit

class Notifikasi1Activity : BaseActivity<ActivityNotifikasi1Binding>(R.layout.activity_notifikasi1)
    {
  private val viewModel: Notifikasi1VM by viewModels<Notifikasi1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notifikasi1VM = viewModel
    val adapter = Notifikasi1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerViewpager.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup75,binding.viewPagerViewpager) { tab, position ->
      tab.text = Notifikasi1ActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
      binding.imageArrowleft.setOnClickListener {
        finish()
      }
    }

    companion object {
      const val TAG: String = "NOTIFIKASI1ACTIVITY"

    }
  }
