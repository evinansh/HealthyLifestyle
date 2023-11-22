package com.dessapplication.app.modules.registerone.ui

import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityRegisterOneBinding
import com.dessapplication.app.modules.login.ui.LoginActivity
import com.dessapplication.app.modules.registerone.`data`.viewmodel.RegisterOneVM
import kotlin.String
import kotlin.Unit

class RegisterOneActivity : BaseActivity<ActivityRegisterOneBinding>(R.layout.activity_register_one)
    {
  private val viewModel: RegisterOneVM by viewModels<RegisterOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registerOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSignUp.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "REGISTER_ONE_ACTIVITY"

  }
}
