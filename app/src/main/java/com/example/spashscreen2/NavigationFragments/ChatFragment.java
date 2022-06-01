package com.example.spashscreen2.NavigationFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.spashscreen2.Model.Chat;
import com.example.spashscreen2.Model.ChatMessageViewModel;
import com.example.spashscreen2.R;
import com.example.spashscreen2.databinding.FragmentChatBinding;
import com.example.spashscreen2.databinding.ViewholderChatBinding;

import java.util.ArrayList;
import java.util.List;

public class ChatFragment extends Fragment {

    private FragmentChatBinding binding;
    private List<Chat> elementosChats = new ArrayList<>();
    private AdapterChat adapterChat;
    private NavController navController;
    private ChatMessageViewModel chatMessageViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentChatBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        chatMessageViewModel = new ViewModelProvider(requireActivity()).get(ChatMessageViewModel.class);
        navController = Navigation.findNavController(view);

        adapterChat = new AdapterChat();
        binding.recyclerViewChat.setAdapter(adapterChat);

        Chat chat1 = new Chat();
        chat1.setImgCharURL("https://i.pinimg.com/originals/e2/f9/ea/e2f9ea729865e385db19071c65d39107.jpg");
        chat1.setNameChat("Ross");
        chat1.setStatusChat("Online");
        chat1.setStatusBall("green");
        elementosChats.add(chat1);

        Chat chat2 = new Chat();
        chat2.setImgCharURL("https://static.wikia.nocookie.net/marvelcinematicuniverse/images/0/06/Thanos.png/revision/latest?cb=20220510235448&path-prefix=es");
        chat2.setNameChat("Shihiro");
        chat2.setStatusChat("Online");
        chat2.setStatusBall("green");
        elementosChats.add(chat2);

        Chat chat3 = new Chat();
        chat3.setImgCharURL("https://pm1.narvii.com/6684/028806ece8b7596274a39c9f061a8fdd20ee0237_hq.jpg");
        chat3.setNameChat("Kawasaki");
        chat3.setStatusChat("Online");
        chat3.setStatusBall("green");
        elementosChats.add(chat3);

        Chat chat4 = new Chat();
        chat4.setImgCharURL("https://cdna.artstation.com/p/assets/images/images/038/210/660/20210531131145/smaller_square/rossdraws-spectral-depths-web.jpg?1622484706");
        chat4.setNameChat("Masashi");
        chat4.setStatusChat("Online");
        chat4.setStatusBall("green");
        elementosChats.add(chat4);

        Chat chat5 = new Chat();
        chat5.setImgCharURL("https://cdna.artstation.com/p/assets/images/images/038/210/660/20210531131145/smaller_square/rossdraws-spectral-depths-web.jpg?1622484706");
        chat5.setNameChat("kishimoto");
        chat5.setStatusChat("Online");
        chat5.setStatusBall("green");
        elementosChats.add(chat5);

        Chat chat6 = new Chat();
        chat6.setImgCharURL("https://cdna.artstation.com/p/assets/images/images/038/210/660/20210531131145/smaller_square/rossdraws-spectral-depths-web.jpg?1622484706");
        chat6.setNameChat("Marcos");
        chat6.setStatusChat("Online");
        chat6.setStatusBall("green");
        elementosChats.add(chat6);

        Chat chat7 = new Chat();
        chat7.setImgCharURL("https://cdna.artstation.com/p/assets/images/images/038/210/660/20210531131145/smaller_square/rossdraws-spectral-depths-web.jpg?1622484706");
        chat7.setNameChat("Saphiro");
        chat7.setStatusChat("Offline");
        chat7.setStatusBall("red");
        elementosChats.add(chat7);

        Chat chat8 = new Chat();
        chat8.setImgCharURL("https://cdna.artstation.com/p/assets/images/images/038/210/660/20210531131145/smaller_square/rossdraws-spectral-depths-web.jpg?1622484706");
        chat8.setNameChat("Jdark");
        chat8.setStatusChat("Offline");
        chat8.setStatusBall("red");
        elementosChats.add(chat8);

        Chat chat9 = new Chat();
        chat9.setImgCharURL("https://cdna.artstation.com/p/assets/images/images/038/210/660/20210531131145/smaller_square/rossdraws-spectral-depths-web.jpg?1622484706");
        chat9.setNameChat("chaki");
        chat9.setStatusChat("Offline");
        chat9.setStatusBall("red");
        elementosChats.add(chat9);

        Chat chat10 = new Chat();
        chat10.setImgCharURL("https://cdna.artstation.com/p/assets/covers/images/040/771/992/20210824142957/smaller_square/rossdraws-rossdraws-123123412.jpg?1629833398");
        chat10.setNameChat("Thanos");
        chat10.setStatusChat("Offline");
        chat10.setStatusBall("red");
        elementosChats.add(chat10);

        Chat chat11 = new Chat();
        chat11.setImgCharURL("https://cdna.artstation.com/p/assets/covers/images/040/771/992/20210824142957/smaller_square/rossdraws-rossdraws-123123412.jpg?1629833398");
        chat11.setNameChat("Liu");
        chat11.setStatusChat("Offline");
        chat11.setStatusBall("red");
        elementosChats.add(chat11);

        Chat chat12 = new Chat();
        chat12.setImgCharURL("https://cdna.artstation.com/p/assets/images/images/038/210/660/20210531131145/smaller_square/rossdraws-spectral-depths-web.jpg?1622484706");
        chat12.setNameChat("Cruz");
        chat12.setStatusChat("Offline");
        chat12.setStatusBall("red");
        elementosChats.add(chat12);

        Chat chat13 = new Chat();
        chat13.setImgCharURL("https://cdna.artstation.com/p/assets/images/images/038/210/660/20210531131145/smaller_square/rossdraws-spectral-depths-web.jpg?1622484706");
        chat13.setNameChat("Jezuz");
        chat13.setStatusChat("Offline");
        chat13.setStatusBall("red");
        elementosChats.add(chat13);

        Chat chat14 = new Chat();
        chat14.setImgCharURL("https://cdna.artstation.com/p/assets/covers/images/040/771/992/20210824142957/smaller_square/rossdraws-rossdraws-123123412.jpg?1629833398");
        chat14.setNameChat("Bryan");
        chat14.setStatusChat("Offline");
        chat14.setStatusBall("red");
        elementosChats.add(chat14);

        Chat chat15 = new Chat();
        chat15.setImgCharURL("https://cdna.artstation.com/p/assets/covers/images/040/771/992/20210824142957/smaller_square/rossdraws-rossdraws-123123412.jpg?1629833398");
        chat15.setNameChat("Gargamiel");
        chat15.setStatusChat("Offline");
        chat15.setStatusBall("red");
        elementosChats.add(chat15);

    }


    class AdapterChat extends RecyclerView.Adapter<AdapterChat.ChatViewHolder> {

        @NonNull
        @Override
        public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ChatViewHolder(ViewholderChatBinding.inflate(getLayoutInflater(), parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {

            String summoner = elementosChats.get(position).getNameChat();
            String status = elementosChats.get(position).getStatusChat();
            String statusBall = elementosChats.get(position).getStatusBall();

            holder.binding.summonerChat.setText(summoner);
            holder.binding.statusChat.setText(status);
            Glide.with(requireContext()).load(elementosChats.get(position).getImgCharURL()).into(holder.binding.imageViewChat);

            if (statusBall.equals("green")) {
                holder.binding.statusBallChat.setBackgroundResource(R.drawable.online_circular_chat_status);
            } else {
                holder.binding.statusBallChat.setBackgroundResource(R.drawable.offline_circular_chat_status);
            }

            if (status.equals("Online") || status.equals("En línea") || status.equals("En línia")) {
                holder.binding.statusChat.setTextColor(ContextCompat.getColor(requireActivity(), R.color.OnlineColor));
            } else {
                holder.binding.statusChat.setTextColor(ContextCompat.getColor(requireContext(), R.color.OfflineColor));
            }

            holder.itemView.setOnClickListener(v -> {
                chatMessageViewModel.seleccionar(elementosChats.get(position));
                navController.navigate(R.id.action_amigosFragment_to_chatMessagesFragment);
            });

        }

        @Override
        public int getItemCount() {
            return elementosChats.size();
        }

        class ChatViewHolder extends RecyclerView.ViewHolder{
            private final ViewholderChatBinding binding;

            public ChatViewHolder(@NonNull ViewholderChatBinding binding) {
                super(binding.getRoot());
                this.binding = binding;
            }
        }
    }


}