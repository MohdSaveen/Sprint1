package com.example.sprint1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;


public class HomeFragment extends Fragment implements OnItemClicked {

    private ArrayList<NowShowingDTO> moviesList=new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        setRecyclerView();
    }

    private void setRecyclerView() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        AdapterClass adapterClass=new AdapterClass(moviesList,this::itemClicked);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapterClass);
    }

    private void initViews(View view) {
        recyclerView=view.findViewById(R.id.recyclerHome);
    }

    ApiService apiService=Network.getRetrofitInstance().create(ApiService.class);

    Call<List<ResponseDTO>> call=apiService.getData();



    @Override
    public void itemClicked(int position) {

    }
}