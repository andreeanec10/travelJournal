package com.example.help;

import android.os.Bundle;

import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.help.adapter.CityAdapter;
import com.example.help.adapter.DialogFragment;
import com.example.help.useful.City;
import com.example.help.useful.DataSource;

import java.util.List;

public class HomeFragment extends Fragment {

    public HomeFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_home, null);

        //define linear layout manager for recycler view (define views to be vertical aligned)
        RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.cityView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        //get data source
        List<City> cityList = new DataSource().getListCities();

        //set adapter
        CityAdapter cityAdapter = new CityAdapter(cityList, getContext());
        recyclerView.setAdapter(cityAdapter);

        return root;
    }
}