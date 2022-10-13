package dev.quewui.hiltexample.data.repository

import android.app.Application
import dev.quewui.hiltexample.R
import dev.quewui.hiltexample.data.domain.repository.MyRepository
import dev.quewui.hiltexample.data.remote.MyApi
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
) : MyRepository {
    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello from the repository, the app name is $appName")
    }

    override suspend fun doNetworkCall() {
    }
}