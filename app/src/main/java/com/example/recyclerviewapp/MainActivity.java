package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userLIst;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initData();
        initRecyclerView();


    }

    private void initData() {

        userLIst = new ArrayList<>();

        userLIst.add(new ModelClass(R.drawable.diddy,"Diddy","12:00AM","Got this crazy trac","__________________________"))

        userLIst.add(new ModelClass(R.drawable.kanye,"Kanye","12:00AM","Let's hit the studio","__________________________"))

        userLIst.add(new ModelClass(R.drawable.khaled,"DJ Khaled","12:01AM","Don't leave me out on this!","__________________________"))

        userLIst.add(new ModelClass(R.drawable.jay,"Jay z","12:02AM","Can I jump on it?","__________________________"))

        userLIst.add(new ModelClass(R.drawable.dre,"Dre","12:01AM","This gonna be lit","__________________________"))

        userLIst.add(new ModelClass(R.drawable.eminem,"Eminem","12:03AM","Check me in hommies","__________________________"))

        userLIst.add(new ModelClass(R.drawable.snoop,"Snoop","12:06AM","Bring it oldskool!","__________________________"))

        userLIst.add(new ModelClass(R.drawable.kendrick,"Kendrick","12:05AM","Time to rise n' shine","__________________________"))

        userLIst.add(new ModelClass(R.drawable.icecube,"Ice cube","12:04AM","For the love of HipHop!","__________________________"))

    }

    private void initRecyclerView() {

        recyclerView=findViewById(R.id.recyclerview);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userLIst);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}