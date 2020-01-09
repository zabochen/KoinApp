package ua.ck.taras.koinapp.presentation.ui.main

import androidx.lifecycle.ViewModel
import ua.ck.taras.koinapp.domain.Repository

class MainViewModel(repository: Repository) : ViewModel() {

    val viewModelName: String = "MainViewModel: ${repository.getFile()}"

}