package com.zoom_machine.registration.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zoom_machine.registration.databinding.FragmentByEmailBinding
import com.zoom_machine.registration.databinding.FragmentByPhoneBinding

class ByPhoneFragment: Fragment() {
    private var _binding: FragmentByPhoneBinding? = null
    private val binding: FragmentByPhoneBinding
    get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentByPhoneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}