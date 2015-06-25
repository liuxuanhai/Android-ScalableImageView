package com.yqritc.scalableimageview.sample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by yqritc on 2015/06/18.
 */
public class SampleActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private SampleAdapter mSampleAdapter;

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, SampleActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mSampleAdapter = new SampleAdapter(this);
        mRecyclerView.setAdapter(mSampleAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_sample, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.sample_landscape:
                mSampleAdapter.setImageResId(R.drawable.landscape_sample);
                break;
            case R.id.sample_portrait:
                mSampleAdapter.setImageResId(R.drawable.portrait_sample);
                break;
            default:
                break;
        }
        return true;
    }
}
