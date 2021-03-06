package com.example.spashscreen2.StartFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.spashscreen2.AppViewModel;
import com.example.spashscreen2.R;
import com.example.spashscreen2.databinding.FragmentLogInBinding;

public class LogInFragment extends Fragment {

    private FragmentLogInBinding binding;
    private AppViewModel appViewModel;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLogInBinding.inflate(inflater, container, false);
        return binding.getRoot();


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        appViewModel = new ViewModelProvider(requireActivity()).get(AppViewModel.class);
        navController = Navigation.findNavController(view);

        binding.buttonLogin.setOnClickListener(v -> {
            String username = binding.usernameLogin.getText().toString();
            String password = binding.passwordLogin.getText().toString();

            appViewModel.iniciarSesion(username, password);
        });


        binding.buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_signInFragment_to_splashScreenFragment);
            }
        });

    }
}