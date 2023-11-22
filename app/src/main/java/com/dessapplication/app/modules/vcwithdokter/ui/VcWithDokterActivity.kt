package com.dessapplication.app.modules.vcwithdokter.ui

import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityVcWithDokterBinding
import com.dessapplication.app.modules.chatwithdoktercontainer.ui.ChatWithDokterContainerActivity
import com.dessapplication.app.modules.vcwithdokter.`data`.viewmodel.VcWithDokterVM
import kotlin.String
import kotlin.Unit

class VcWithDokterActivity :
    BaseActivity<ActivityVcWithDokterBinding>(R.layout.activity_vc_with_dokter) {
  private val viewModel: VcWithDokterVM by viewModels<VcWithDokterVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.vcWithDokterVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCall.setOnClickListener {
      val destIntent = ChatWithDokterContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "VC_WITH_DOKTER_ACTIVITY"

  }
}
