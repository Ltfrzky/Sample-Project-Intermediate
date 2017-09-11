package com.ksmandroid.oprec.lutfi.asean.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ksmandroid.oprec.lutfi.asean.R;
import com.ksmandroid.oprec.lutfi.asean.model.ItemModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lutfi on 10/09/2017.
 */

public class AseanAdapter extends RecyclerView.Adapter<AseanAdapter.AseanHolder> {
    private List<ItemModel> listData;
    private LayoutInflater inflater;

    private ItemClickCallback itemClickCallback;

    public interface ItemClickCallback {
        void onItemClick(int p);
    }

    public void setItemClickCallback(final ItemClickCallback itemClickCallback) {
        this.itemClickCallback = itemClickCallback;
    }

    public AseanAdapter(List<ItemModel> listData, Context c) {
        this.inflater = LayoutInflater.from(c);
        this.listData = listData;
    }

    @Override
    public AseanHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new AseanHolder(view);
    }

    @Override
    public void onBindViewHolder(AseanHolder holder, int position) {
        ItemModel item = listData.get(position);
        holder.bendera.setImageResource(item.getBendera());
        holder.namaNegara.setText(item.getNamaNegara());
    }

    public void setListData(ArrayList<ItemModel> exerciseList) {
        this.listData.clear();
        this.listData.addAll(exerciseList);
    }


    @Override
    public int getItemCount() {
        return listData.size();
    }

    class AseanHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView namaNegara;
        ImageView bendera;
        View container;

        public AseanHolder(View itemView) {
            super(itemView);

            namaNegara = (TextView) itemView.findViewById(R.id.lbl_item_text);
            bendera = (ImageView) itemView.findViewById(R.id.im_item_icon);
            container = itemView.findViewById(R.id.cont_item_root);
            container.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.cont_item_root) {
                itemClickCallback.onItemClick(getAdapterPosition());
            }
        }
    }
}
