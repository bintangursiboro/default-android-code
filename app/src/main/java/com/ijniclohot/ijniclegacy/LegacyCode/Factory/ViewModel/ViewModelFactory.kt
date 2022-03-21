package com.ijniclohot.ijniclegacy.LegacyCode.Factory.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        //Add VieModel Factory here
//        if (modelClass == YourViewModel){
            // return YourViewModel
//        }

        throw IllegalArgumentException("Unknown Model class $modelClass")
    }

    companion object{
        private var INSTANCE : ViewModelFactory? = null
        fun getInstance(): ViewModelFactory{
            if (INSTANCE == null){
                INSTANCE = ViewModelFactory()
            }
            return INSTANCE!!
        }
    }
}