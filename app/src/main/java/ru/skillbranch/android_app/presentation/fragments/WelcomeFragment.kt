package ru.skillbranch.android_app.presentation.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.findNavController
import ru.skillbranch.android_app.R
import ru.skillbranch.android_app.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment(R.layout.fragment_welcome) {

    private var welcomeBinding: FragmentWelcomeBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        welcomeBinding = FragmentWelcomeBinding.bind(view)
        backButtonClick()
        Log.d("WelcomeFragment", "onViewCreated loginBinding: $welcomeBinding")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        welcomeBinding = null
        Log.d("WelcomeFragment", "onDestroyView loginBinding: $welcomeBinding")
    }

    private fun backButtonClick() {
        welcomeBinding?.ibBackLogin?.setOnClickListener {
            val action = WelcomeFragmentDirections.actionWelcomeFragmentToLoginFragment()
            view?.findNavController()?.navigate(action)
        }
    }
}