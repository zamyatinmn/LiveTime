package com.zamyatinmn.livetime

import com.zamyatinmn.livetime.databinding.FragmentWelcomeBinding


class WelcomeFragment:
    ViewBindingFragment<FragmentWelcomeBinding>(FragmentWelcomeBinding::inflate) {

    companion object {
        fun newInstance() = WelcomeFragment()
    }

}