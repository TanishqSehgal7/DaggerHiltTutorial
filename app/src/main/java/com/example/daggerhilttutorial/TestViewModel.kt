package com.example.daggerhilttutorial

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class TestViewModel @Inject constructor(
    @Named("CombinedString") combinedString:String
) : ViewModel(){

    // ViewModelInject has been deprecated and changed to @HiltViewModel
    // which becomes available on creation of HiltViewModelFactory

    init {
       Log.d("ViewModel", "Combined String in ViewModel is: $combinedString")
    }
}