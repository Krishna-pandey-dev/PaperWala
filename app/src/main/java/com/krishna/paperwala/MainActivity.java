package com.krishna.paperwala;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.widget.Toast;

import com.krishna.paperwala.api.ApiInterface;
import com.krishna.paperwala.api.Apiclient;
import com.krishna.paperwala.models.Article;
import com.krishna.paperwala.models.News;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String API_KEY = "52044d0699714cd5b10cb501ca77177f";
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    List<Article> articles = new ArrayList<>();
    UserAdapter adapter;
    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        adapter = new UserAdapter(MainActivity.this, articles);
        layoutManager = new LinearLayoutManager(MainActivity.this);




        loadjson();

    }
    public void loadjson()
    {
        ApiInterface apiInterface = Apiclient.getapiclient().create(ApiInterface.class);
        String country = Utils.getCountry();

        Call<News> call;
        call = apiInterface.getnews(country,API_KEY);
        call.enqueue(new Callback<News>() {
            @Override
            public void onResponse(Call<News> call, Response<News> response) {
                if (response.isSuccessful() && response.body().getArticle() !=  null) {

                    if (!articles.isEmpty())
                    {
                        articles.clear();
                    }
                    articles = response.body().getArticle();
                    recyclerView.setLayoutManager(layoutManager);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setNestedScrollingEnabled(false);
                    recyclerView.setAdapter(adapter);
                    adapter.notifyDataSetChanged();

                } else
                {
                    Toast.makeText(MainActivity.this, "No Result!!", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<News> call, Throwable t) {

            }
        });
    }
}
