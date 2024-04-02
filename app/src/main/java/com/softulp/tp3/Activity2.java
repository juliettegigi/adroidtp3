package com.softulp.tp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;

import com.softulp.tp3.databinding.Activity2Binding;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;

import com.softulp.tp3.R;
import com.softulp.tp3.modelo.Pelicula;

public class Activity2 extends AppCompatActivity {
    private Activity2Binding binding;
    private Activity2ViewModel vm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=Activity2Binding.inflate(getLayoutInflater());
        vm=new Activity2ViewModel(getApplication());
        setContentView(binding.getRoot());

        vm.getMutablePelicula(getIntent()).observe(this, new Observer<Pelicula>() {
            @Override
            public void onChanged(Pelicula p) {


                binding.tvTitulo2.setText(p.getTitulo());
                binding.ivImage2.setImageResource(p.getImagen());
                binding.tvDt.setText(binding.tvDt.getText()+p.getDirector());
                binding.tvActores.setText(binding.tvActores.getText()+p.getActoresPrincipales());
                binding.tvResenia2.setText(binding.tvResenia2.getText()+p.getResenia());
            }
        });


    }
}