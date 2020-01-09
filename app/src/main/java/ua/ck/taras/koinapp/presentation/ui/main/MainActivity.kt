package ua.ck.taras.koinapp.presentation.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import ua.ck.taras.koinapp.R
import ua.ck.taras.koinapp.domain.Repository

class MainActivity : AppCompatActivity() {

    private val repository: Repository by inject()

    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //activityMain_textView_helloWorld.text = repository.getFile()

        activityMain_textView_helloWorld.text = this.mainViewModel.viewModelName
    }
}
