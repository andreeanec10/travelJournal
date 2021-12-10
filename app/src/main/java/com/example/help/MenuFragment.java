package com.example.help;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MenuFragment extends Fragment {

    private TextView Home;
    private TextView Contact;
    private TextView AboutUs;
    private TextView Share;


    public MenuFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_menu, null);
        Home = root.findViewById(R.id.home);
        Contact = root.findViewById(R.id.contact);
        AboutUs =root.findViewById(R.id.aboutUs);
        Share = root.findViewById(R.id.share);

        Home.setOnClickListener(v-> ((MainActivity) getActivity()).changeToHome());
        AboutUs.setOnClickListener(v-> ((MainActivity) getActivity()).changeToAboutUs());
        Contact.setOnClickListener(v-> ((MainActivity) getActivity()).changeToContact());
        Share.setOnClickListener(v-> ((MainActivity) getActivity()).changeToShare());

        return root;
    }
}