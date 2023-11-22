package com.dessapplication.app.modules.home.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityHomeBinding
import com.dessapplication.app.modules.dailyactivity.ui.DailyActivityActivity
import com.dessapplication.app.modules.education.ui.EducationActivity
import com.dessapplication.app.modules.home.`data`.viewmodel.HomeVM
import com.dessapplication.app.modules.profil.ui.ProfilActivity
import com.dessapplication.app.modules.teskesehatan.ui.TesKesehatanActivity
import com.dessapplication.app.modules.vitrualkonsultasi.ui.VitrualKonsultasiActivity
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeVM = viewModel
    setUpSearchViewGroupSixteenListener()
  }

  override fun setUpClicks(): Unit {
    binding.linearColumneducation.setOnClickListener {
      val destIntent = EducationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowdailyactivity.setOnClickListener {
      val destIntent = DailyActivityActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = ProfilActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnvirtualconsult.setOnClickListener {
      val destIntent = VitrualKonsultasiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageLightbulb.setOnClickListener {
      val destIntent = TesKesehatanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  private fun setUpSearchViewGroupSixteenListener(): Unit {
    binding.searchViewGroupSixteen.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "HOME_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, HomeActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
