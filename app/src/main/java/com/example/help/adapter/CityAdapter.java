package com.example.help.adapter;

import android.app.FragmentManager;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.example.help.R;
import com.example.help.useful.City;

import java.util.List;

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.CityViewHolder>{

    public CityAdapter(List<City> cities, Context context) {
        this.context = context;
        this.cities = cities;
    }

    private List<City> cities;
    private Context context;

    @NonNull
    @Override
    public CityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_city, parent, false);
        return new CityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CityViewHolder holder, int position) {

        String tripName = cities.get(position).getTripName();
        holder.tripName.setText(tripName);

        String destination = cities.get(position).getDescription();
        holder.destination.setText(destination);

        String price = cities.get(position).getPrice();
        holder.price.setText(price);

        boolean favorite = cities.get(position).isFavorit();
        if (favorite) {
            holder.favorite.setImageResource(R.drawable.ic_favorit);
        } else {
            holder.favorite.setImageResource(R.drawable.ic_not_favorit);
        }

        holder.favorite.setOnClickListener(v -> {
            if (favorite) {
                holder.favorite.setImageResource(R.drawable.ic_not_favorit);
                cities.get(position).setFavorit(false);

            } else {
                holder.favorite.setImageResource(R.drawable.ic_favorit);
                cities.get(position).setFavorit(true);
            }
            //face nebunii daca nul il pun pe asta
            notifyDataSetChanged();
        });

        holder.view.setOnLongClickListener(v -> {
            FragmentManager manager = ((AppCompatActivity)context).getFragmentManager();
            DialogFragment info = new DialogFragment();
            info.show(manager, "Change");
            return false;
        });

    }

    @Override
    public int getItemCount() {
        return cities.size();
    }

    public class CityViewHolder extends RecyclerView.ViewHolder {

        private TextView tripName;
        private TextView destination;
        private TextView price;
        private ImageView favorite;
        private View view;

        public CityViewHolder(@NonNull View itemView) {

            super(itemView);
            tripName = itemView.findViewById(R.id.tripName);
            destination = itemView.findViewById(R.id.destination);
            price = itemView.findViewById(R.id.price);
            favorite = itemView.findViewById(R.id.favorite);
            this.view = itemView;

        }
    }
}
