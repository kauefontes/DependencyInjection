package dev.quewui.hiltexample.data.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}