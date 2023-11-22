package com.dessapplication.app.modules.halamanawal.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityHalamanAwalBinding
import com.dessapplication.app.modules.halamanawal.`data`.viewmodel.HalamanAwalVM
import com.dessapplication.app.modules.login.ui.LoginActivity
import com.dessapplication.app.modules.vitrualkonsultasi.ui.VitrualKonsultasiActivity
import kotlin.String
import kotlin.Unit

class HalamanAwalActivity : BaseActivity<ActivityHalamanAwalBinding>(R.layout.activity_halaman_awal)
    {
  private val viewModel: HalamanAwalVM by viewModels<HalamanAwalVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.halamanAwalVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = VitrualKonsultasiActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.linearHalamanawal.setOnClickListener {
        val destIntent = LoginActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "HALAMAN_AWAL_ACTIVITY"

    }
  }
