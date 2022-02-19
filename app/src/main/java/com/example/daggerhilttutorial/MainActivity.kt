package com.example.daggerhilttutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.daggerhilttutorial.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint // used whenever we need to inject a dependency in any activity,fragment or view
class MainActivity : AppCompatActivity() {

    @Inject // assigns the value of String to this variable
    @Named("String1")
    lateinit var myString1: String

    @Inject
    @Named("String2")
    lateinit var myString2: String

    @Inject
    @Named("ResourceString")
    lateinit var stringFromRes:String

    @Inject
    @Named("CombinedString")
    lateinit var combinedString:String

    private val myViewModel: TestViewModel by viewModels()

   private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // dependency injection - giving an object its instance variables
        // dependencies : object specific classes
        myString1 += " " + myString2
        Log.d("MainActivity", "Test String from main actvity: $myString1 + $stringFromRes")

        binding.tvString.text = combinedString + "\n\n"
        myViewModel


    }
}