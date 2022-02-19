package com.example.daggerhilttutorial

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) // meant for specifying the scope of dependencies
//ApplicationComponent is Deprecated in Dagger Version 2.30
//ApplicationComponent removed in Dagger Version 2.31
//Alternatively SingletonComponent should be used instead of ApplicationComponent
object AppModule {

    // basically modules contain dependencies
    // here we declare instances that need to exist for the whole time in the application
    // eg- a retrofit instance or a room instance

    @Singleton // makes a single instance of this function, no new instance is made for every injection
    @Provides
    @Named("String1")
    fun provideTestString1() = "This is a test string to be injected"

    @Singleton // limits the scope of the dependency to a particular activity - only one instance is created
    @Provides
    @Named("String2")
    fun provideTestString2 () = "This is the second test string to be injected"

    @Singleton
    @Provides
    @Named("ResourceString")
    fun providerOfResourceString (
       @ApplicationContext context: Context) = context.getString(R.string.myStringToBeProvided)

}