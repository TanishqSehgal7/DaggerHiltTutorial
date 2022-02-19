package com.example.daggerhilttutorial

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AnotherModule {

    @Singleton
    @Provides
    @Named("CombinedString")
    fun combinedStringFromAppModule(@Named("String1") provideTestString1:String
    , @Named("String2") provideTestString2:String, @Named("ResourceString") providerOfResourceString:String)
    = provideTestString1 + "\n" + provideTestString2 + "\n" + providerOfResourceString+"."

}