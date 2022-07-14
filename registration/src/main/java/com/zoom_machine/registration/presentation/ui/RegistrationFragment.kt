package com.zoom_machine.registration.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.zoom_machine.registration.R
import com.zoom_machine.registration.databinding.FragmentRegistrationBinding
import com.zoom_machine.registration.presentation.adapters.TabPagerAdapter

class RegistrationFragment: Fragment() {
    private var _binding: FragmentRegistrationBinding? = null
    private val binding get() = _binding!!
    private var adapter: TabPagerAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegistrationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = activity?.supportFragmentManager?.let {
            TabPagerAdapter(
                it,
                lifecycle,
                fragments
            )
        }
        binding.viewPager.adapter = adapter
        TabLayoutMediator(binding.tabs, binding.viewPager)
        { tab, position ->
            when (position) {
                0 -> {
                    tab.text = resources.getString(R.string.by_e_mail)
                }
                1 -> {
                    tab.text = resources.getString(R.string.by_phone)
                }
            }
        }.attach()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object{
        val fragments = listOf(ByEmailFragment(), ByPhoneFragment())
    }
}