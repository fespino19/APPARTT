package com.example.spashscreen2.NavigationFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.spashscreen2.AppViewModel;
import com.example.spashscreen2.R;
import com.example.spashscreen2.databinding.FragmentAmigosBinding;

public class AmigosFragment extends Fragment {

    private FragmentAmigosBinding binding;
    private NavController navController;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return (binding = FragmentAmigosBinding.inflate(inflater, container, false)).getRoot();



    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);
        binding.chatamigo1.setOnClickListener(v -> navController.navigate(R.id.action_verAmigosFragment_to_chatFriendFragment));





    }


   /* class AdapterAmigos extends RecyclerView.Adapter<AdapterAmigos.AmigosViewHolder> {

        @NonNull
        @Override
        public AmigosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new AmigosViewHolder(ViewholderAmigosBinding.inflate(getLayoutInflater(), parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull AmigosViewHolder holder, int position) {
          //  String summonerName = elementosAmigos.get(position).getNameAmigo();
           // String summonerStatus = elementosAmigos.get(position).getStatusAmigo();

           // holder.binding.textoAmigos.setText(summonerName);
           // holder.binding.statusAmigos.setText(summonerStatus);

          //  Glide.with(requireContext()).load(elementosAmigos.get(position).getImgUrlAmigo()).into(holder.binding.imageAmigos);

        }

        @Override
        public int getItemCount() {
            return elementosAmigos.size();
        }

        class AmigosViewHolder extends RecyclerView.ViewHolder {
            private final ViewholderAmigosBinding binding;

            public AmigosViewHolder(ViewholderAmigosBinding binding) {
                super(binding.getRoot());
                this.binding = binding;

            }
        }
    }*/


}