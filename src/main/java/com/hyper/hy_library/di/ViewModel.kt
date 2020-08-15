package com.hyper.hy_library.di

import com.hyper.hy_library.repository.Repository
import com.hyper.hy_library.repository.RepositoryImpl
import com.hyper.hy_library.ui.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single<Repository> { RepositoryImpl() }

    viewModel { MainViewModel() }
}