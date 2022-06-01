package com.example.spashscreen2.NavigationFragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.spashscreen2.R;
import com.example.spashscreen2.databinding.FragmentBuscarBinding;




public class BuscarFragment extends Fragment {

    private FragmentBuscarBinding binding;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentBuscarBinding.inflate(inflater, container,false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        binding.car1.setOnClickListener(v -> navController.navigate(R.id.action_buscarFragment_to_otroPerfilFragment));
        binding.car1.setOnClickListener(v -> navController.navigate(R.id.action_buscarFragment_to_otroPerfilFragment));
        binding.car1.setOnClickListener(v -> navController.navigate(R.id.action_buscarFragment_to_otroPerfilFragment));

    }
}