package com.softulp.tp3;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.softulp.tp3.modelo.Pelicula;

public class Activity2ViewModel extends AndroidViewModel {
    private MutableLiveData<Pelicula> mutablePelicula;
    public Activity2ViewModel(@NonNull Application application) {
        super(application);

    }

    public LiveData<Pelicula> getMutablePelicula(Intent intent){
        if(mutablePelicula==null) {
            mutablePelicula = new MutableLiveData<>();
            mutablePelicula.setValue((Pelicula) intent.getSerializableExtra("pelicula"));
        }
        return mutablePelicula;
    }


}
