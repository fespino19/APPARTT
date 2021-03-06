package com.example.spashscreen2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.spashscreen2.databinding.FragmentOtroPerfilBinding;


public class OtroPerfilFragment extends Fragment {
    private FragmentOtroPerfilBinding binding;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentOtroPerfilBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        //binding.buttonConTiempo.setOnClickListener(v -> navController.navigate(R.id.action_gameTypeFragment_to_startingGameFragment));
        //binding.buttonSinTiempo.setOnClickListener(v -> navController.navigate(R.id.action_gameTypeFragment_to_startingGameFragment));

    }
}