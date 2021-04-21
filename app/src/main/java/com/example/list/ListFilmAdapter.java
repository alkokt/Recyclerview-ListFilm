package com.example.list;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class ListFilmAdapter extends RecyclerView.Adapter<ListFilmAdapter.ViewHolder> {

    private List<Film> films;

    public ListFilmAdapter(List<Film> films) {
        this.films = films;
    }

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_row_film, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Film film = films.get(position);
        Glide.with(holder.itemView.getContext())
                .load(film.getPhoto())
                .apply(new RequestOptions().override(55, 55));
        holder.ivPhoto.setImageResource(film.getPhoto());
        holder.tvName.setText(film.getName());
        holder.tvDetail.setText(film.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(films.get(holder.getAdapterPosition()));
                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                intent.putExtra("Image", film.getPhoto());
                intent.putExtra("Name", film.getName());
                intent.putExtra("Detail", film.getDetail());

                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return films.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivPhoto;
        TextView tvName, tvDetail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPhoto = itemView.findViewById(R.id.iv_film);
            tvName = itemView.findViewById(R.id.tv_film_name);
            tvDetail = itemView.findViewById(R.id.tv_film_detail);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Film data);
    }
}