package com.ijniclohot.ijniclegacy.LegacyCode.KoinModules

import com.ijniclohot.ijniclegacy.LegacyCode.BaseRepository.DataSource.Retrofit.ApiInterface
import com.ijniclohot.ijniclegacy.LegacyCode.BaseRepository.DataSource.Retrofit.RetrofitService
import org.koin.dsl.module
import retrofit2.Retrofit

val appModule = module {
    //Fill the instance here
    single { RetrofitService.create() }
}