package com.example.tmdb.ui.base

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.example.tmdb.ui.factory.AppViewModelFactory
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

open abstract class BaseFragment<T : ViewModel> : Fragment() {
    @Inject
    lateinit var appViewModelFactory: AppViewModelFactory
    lateinit var viewModel: T

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = appViewModelFactory.create(viewModel.javaClass)

    }

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    fun getBaseViewModel() = viewModel

}