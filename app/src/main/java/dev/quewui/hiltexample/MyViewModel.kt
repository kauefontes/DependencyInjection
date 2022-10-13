package dev.quewui.hiltexample

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.Lazy
import dev.quewui.hiltexample.data.domain.repository.MyRepository
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: Lazy<MyRepository>
) : ViewModel() {

    init {
        repository.get()
    }
}