package com.example.kseniya.weather.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.kseniya.weather.R;
import com.example.kseniya.weather.WeatherApp;
import com.example.kseniya.weather.data.RetrofitService;
import com.example.kseniya.weather.modelsSearch.SearchPlaceModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ActivitySearch extends ActivityBase implements View.OnClickListener, AdapterView.OnItemClickListener {
    private RetrofitService service;
    private EditText editText;
    private ListView listView;
    private Button btnSearch;
    private List<SearchPlaceModel> model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        service = WeatherApp.get(getApplicationContext()).getService();
        editText = findViewById(R.id.edit_textSearch);
        listView = findViewById(R.id.list_town);
        listView.setOnItemClickListener(this);
        btnSearch = findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(this);
    }

    private void forSearchPlace() {
        showProgressBar();
        service.searchPlace(editText.getText().toString(), getString(R.string.api_key2), "ru-Ru")
                .enqueue(new Callback<List<SearchPlaceModel>>() {
                    @Override
                    public void onResponse(Call<List<SearchPlaceModel>> call, Response<List<SearchPlaceModel>> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            // Toast.makeText(getApplicationContext(), " RESPONSE NOT NULL", Toast.LENGTH_LONG).show();
                            model = response.body();
                            ArrayList<String> arrayList = new ArrayList();
                            for (int i = 0; i < model.size(); i++) {
                                arrayList.add(model.get(i).getLocalizedName() + "\n" +
                                        model.get(i).getAdministrativeArea().getLocalizedName() + ", " + model.get(i).getCountry().getLocalizedName());

                            }
                            ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, arrayList);
                            listView.setAdapter(adapter);
                        } else {
                            Toast.makeText(getApplicationContext(), "Сервер не отвечает", Toast.LENGTH_LONG).show();
                        }
                        if (model.size() == 0 && response.body() == null) {
                            Toast.makeText(getApplicationContext(), "не найдено", Toast.LENGTH_LONG).show();
                        }

                        dismissProgressBar();
                    }

                    @Override
                    public void onFailure(Call<List<SearchPlaceModel>> call, Throwable t) {

                    }
                });
    }

    @Override
    public void onClick(View v) {

        forSearchPlace();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent();
        intent.putExtra("locationKey", model.get(position).getKey());
        intent.putExtra("CityName", model.get(position).getLocalizedName());
        setResult(RESULT_OK, intent);
        finish();
    }
}
