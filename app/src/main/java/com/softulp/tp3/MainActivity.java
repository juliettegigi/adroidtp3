package com.softulp.tp3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.softulp.tp3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private MainActivityViewModel vm;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        vm=new MainActivityViewModel(getApplication(),this);
        vm.getMutableAdapter().observe(this, new Observer<RecyclerView.Adapter<PeliculaAdapter.ViewHolder>>() {
            @Override
            public void onChanged(RecyclerView.Adapter<PeliculaAdapter.ViewHolder> viewHolderAdapter) {
                GridLayoutManager glm=new GridLayoutManager(MainActivity.this,1,GridLayoutManager.VERTICAL,false);
                binding.rvLista.setLayoutManager(glm);
                binding.rvLista.setAdapter(viewHolderAdapter);
            }
        });

    }
}