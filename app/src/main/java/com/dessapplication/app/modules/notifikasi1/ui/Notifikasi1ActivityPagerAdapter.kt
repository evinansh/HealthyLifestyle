package com.dessapplication.app.modules.notifikasi1.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import com.dessapplication.app.modules.notifikasi.ui.NotifikasiFragment
import com.dessapplication.app.modules.notifikasichat.ui.NotifikasiChatFragment
import com.dessapplication.app.modules.notifikasicomunity.ui.NotifikasiComunityFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class Notifikasi1ActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_semua),MyApp.getInstance().resources.getString(R.string.lbl_chat),MyApp.getInstance().resources.getString(R.string.lbl_comunity))

        val viewPages: List<Fragment> =
                listOf(NotifikasiFragment(),NotifikasiChatFragment(),NotifikasiComunityFragment())

    }
}
