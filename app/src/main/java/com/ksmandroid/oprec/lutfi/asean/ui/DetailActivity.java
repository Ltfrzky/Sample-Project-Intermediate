package com.ksmandroid.oprec.lutfi.asean.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.ksmandroid.oprec.lutfi.asean.R;

public class DetailActivity extends AppCompatActivity {

    private static final String BUNDLE_EXTRAS = "BUNDLE_EXTRAS";
    private static final String EXTRA_INT = "EXTRA_INT";
    private static final String EXTRA_QUOTE = "EXTRA_QUOTE";
    private static final String EXTRA_ATTR = "EXTRA_ATTR";
    private static final String EXTRA_ID = "EXTRA_ID";
    private static final String EXTRA_JD = "EXTRA_JD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Bundle extras = getIntent().getBundleExtra(BUNDLE_EXTRAS);
        String namaNegara = extras.getString(EXTRA_QUOTE);
        String keterangan = extras.getString(EXTRA_ATTR);
        int img = extras.getInt(EXTRA_INT);
        setTitle(namaNegara);

        ((ImageView) findViewById(R.id.im_quote_img)).setImageResource(img);
        ((TextView) findViewById(R.id.lbl_quote_text)).setText(namaNegara);
        ((TextView) findViewById(R.id.lbl_quote_subtext)).setText(keterangan);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        onBackPressed();
        return true;
    }
}
