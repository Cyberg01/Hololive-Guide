package com.example.hololiveguide;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListTalentAdapter extends RecyclerView.Adapter<ListTalentAdapter.ListViewHolder>{
    private ArrayList<Talent> listTalent;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_member, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Talent talent = listTalent.get(position);
        Glide.with(holder.itemView.getContext())
                .load(talent.getPhoto())
                .into(holder.talentPhoto);
        holder.tvName.setText(talent.getName());
        holder.tvGen.setText(talent.getHololive());
        holder.tvQuotes.setText(talent.getQuotes());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listTalent.get(holder.getAdapterPosition()));
                Intent intent = new Intent(v.getContext(), TalentProfil.class);
                intent.putExtra(TalentProfil.TALENT_IMAGE, talent.getPhoto());
                intent.putExtra(TalentProfil.TALENT_NAME, talent.getName());
                intent.putExtra(TalentProfil.TALENT_QUOTES, talent.getQuotes());
                intent.putExtra(TalentProfil.TALENT_DESC, talent.getDesc());
                intent.putExtra(TalentProfil.TALENT_NICKNAME, talent.getNickName());
                intent.putExtra(TalentProfil.TALENT_DEBUT, talent.getDebute());
                intent.putExtra(TalentProfil.TALENT_BIRTH, talent.getBirthday());
                intent.putExtra(TalentProfil.TALENT_HEIGHT, talent.getHeight());
                intent.putExtra(TalentProfil.TALENT_FAN, talent.getFanbase());
                intent.putExtra(TalentProfil.TALENT_ILLUS, talent.getIllustrator());
                intent.putExtra(TalentProfil.TALENT_AFFLI, talent.getAffiliation());
                intent.putExtra(TalentProfil.TALENT_CHANNEL, talent.getTalentChannel());
                intent.putExtra(TalentProfil.TALENT_WEBIO, talent.getTalentWebio());
                intent.putExtra(TalentProfil.TALENT_TWITTER, talent.getTalentTwitter());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listTalent.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView talentPhoto;
        TextView tvName, tvGen, tvQuotes;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            talentPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_talentname);
            tvGen = itemView.findViewById(R.id.tv_item_gen);
            tvQuotes = itemView.findViewById(R.id.tv_item_quotes);
        }
    }

    public ListTalentAdapter(ArrayList<Talent> list) {

        this.listTalent = list;
    }

    public interface OnItemClickCallback {
        void onItemClicked(Talent data);
    }
}
