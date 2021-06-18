package ru.skillbranch.android_app.presentation.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.findNavController
import ru.skillbranch.android_app.R
import ru.skillbranch.android_app.databinding.FragmentLoginBinding

class LoginFragment : Fragment(R.layout.fragment_login) {

    private var loginBinding: FragmentLoginBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loginBinding = FragmentLoginBinding.bind(view)
        navButtonClick()
        Log.d("LoginFragment", "onViewCreated loginBinding: $loginBinding")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        loginBinding = null
        Log.d("LoginFragment", "onDestroyView loginBinding: $loginBinding")
    }

    private fun navButtonClick() {
        loginBinding?.fabNextStep?.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToWelcomeFragment2()
            view?.findNavController()?.navigate(action)
        }
    }
}