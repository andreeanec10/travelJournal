package com.example.help;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView Menu;
    private LinearLayout Head;
    private FrameLayout Body;
    private TextView Message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Menu = findViewById(R.id.hamburger);
        Head = findViewById(R.id.head);
        Body = findViewById(R.id.body);
        Message = findViewById(R.id.init_message);

        Menu.setOnClickListener(v -> {
            Head.setAlpha(0.2f);
            Body.setAlpha(0.2f);
            FragmentManager manager = getFragmentManager();
            manager.beginTransaction()
                    .add(R.id.newfragment, new MenuFragment(),"MENU")
                    .addToBackStack(null)
                    .commit();
        });
    }

    @Override
    public void onBackPressed() {
        Head.setAlpha(1);
        Body.setAlpha(1);

        getFragmentManager().popBackStack();
    }

    public void changeToHome() {
        this.onBackPressed();
        Message.setVisibility(View.GONE);
        FragmentManager manager = getFragmentManager();
        manager.beginTransaction()
                .replace(R.id.body, new HomeFragment(), null)
                .commit();
    }

    public void changeToAboutUs() {
        this.onBackPressed();
        Message.setVisibility(View.GONE);
        FragmentManager manager = getFragmentManager();
        manager.beginTransaction()
                .replace(R.id.body, new AboutUsFragment(), null)
                .commit();
    }

    public void changeToContact() {
        this.onBackPressed();
        Message.setVisibility(View.GONE);
        FragmentManager manager = getFragmentManager();
        manager.beginTransaction()
                .replace(R.id.body, new ContactFragment(), null)
                .commit();
    }

    public void changeToShare() {
        this.onBackPressed();
        Message.setVisibility(View.GONE);
        FragmentManager manager = getFragmentManager();
        manager.beginTransaction()
                .replace(R.id.body, new ShareFragment(), null)
                .commit();
    }
}