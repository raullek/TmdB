
package com.example.tmdb.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.tmdb.di.scope.ViewModelKey

import com.example.tmdb.ui.factory.AppViewModelFactory
import com.example.tmdb.ui.view.signIn.SignInViewModel
import com.example.tmdb.ui.view.signUp.SignUpViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Suppress("unused")
@Module
internal abstract class ViewModelModule {

  @Binds
  @IntoMap
  @ViewModelKey(SignUpViewModel::class)
  internal abstract fun bindMainAuthorizationViewModel(signUpViewModel: SignUpViewModel): ViewModel

  @Binds
  @IntoMap
  @ViewModelKey(SignInViewModel::class)
  internal abstract fun bindAuthorizationActivityViewModel(signInViewModel: SignInViewModel): ViewModel



  @Binds
  internal abstract fun bindViewModelFactory(appViewModelFactory: AppViewModelFactory): ViewModelProvider.Factory
}
