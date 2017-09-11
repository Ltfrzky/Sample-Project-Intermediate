package com.ksmandroid.oprec.lutfi.asean.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ksmandroid.oprec.lutfi.asean.R;
import com.ksmandroid.oprec.lutfi.asean.adapter.AseanAdapter;
import com.ksmandroid.oprec.lutfi.asean.model.DataNegara;
import com.ksmandroid.oprec.lutfi.asean.model.ItemModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AseanAdapter.ItemClickCallback{

    private static final String BUNDLE_EXTRAS = "BUNDLE_EXTRAS";
    private static final String EXTRA_QUOTE = "EXTRA_QUOTE";
    private static final String EXTRA_ATTR = "EXTRA_ATTR";
    private static final String EXTRA_INT = "EXTRA_INT";

    private RecyclerView recyclerView;
    private AseanAdapter adapter;

    private ArrayList listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("ASEAN");

        listData = (ArrayList) DataNegara.getListData();

        recyclerView = (RecyclerView)findViewById(R.id.rv_list);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new AseanAdapter(DataNegara.getListData(), this);

        recyclerView.setAdapter(adapter);
        adapter.setItemClickCallback(this);
    }

    @Override
    public void onItemClick(int p) {
        ItemModel item = (ItemModel) listData.get(p);

        Intent i = new Intent(this, DetailActivity.class);

        Bundle extras = new Bundle();
        extras.putString(EXTRA_QUOTE, item.getNamaNegara());
        extras.putString(EXTRA_ATTR, item.getKeterangan());
        extras.putInt(EXTRA_INT, item.getBendera());
        i.putExtra(BUNDLE_EXTRAS, extras);
        startActivity(i);
    }
}
