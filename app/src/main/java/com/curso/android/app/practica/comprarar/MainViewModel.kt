package com.curso.android.app.practica.comprarar

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val texts: LiveData<Texts> get() = _texts
    private var _texts = MutableLiveData<Texts>(Texts("","", ""))

    fun comparar(text1: String, text2: String){

        var result = ""

        if(text1 == text2)
        {
            result = "Los textos son iguales."
        }
        else
        {
            result = "Los textos NO son iguales."
        }

        _texts.value = Texts(text1,text2,result)
    }
}