package com.dessapplication.app.modules.loginone.ui

import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityLoginOneBinding
import com.dessapplication.app.modules.home.ui.HomeActivity
import com.dessapplication.app.modules.loginone.`data`.viewmodel.LoginOneVM
import com.dessapplication.app.modules.register.ui.RegisterActivity
import kotlin.String
import kotlin.Unit

class LoginOneActivity : BaseActivity<ActivityLoginOneBinding>(R.layout.activity_login_one) {
  private val viewModel: LoginOneVM by viewModels<LoginOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSignInOne.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtConfirmation.setOnClickListener {
      val destIntent = RegisterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGIN_ONE_ACTIVITY"

  }
}
