package com.example.daggerhilttutorial

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

// this is the base class

@HiltAndroidApp // triggers hilt code generation which is attached to the lifecycle of the app
class MyApplicationClass : Application() {

}