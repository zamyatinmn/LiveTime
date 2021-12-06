package com.zamyatinmn.livetime

import com.github.terrakok.cicerone.Screen
import com.github.terrakok.cicerone.androidx.FragmentScreen


class AppScreens {
    fun welcome(): Screen = FragmentScreen{ WelcomeFragment.newInstance() }
}