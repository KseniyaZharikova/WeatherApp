package com.example.kseniya.weather.ui.search;

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
import com.example.kseniya.weather.data.modelsCurrentWeather.modelsSearch.SearchPlaceModel;
import com.example.kseniya.weather.ui.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends BaseActivity implements View.OnClickListener, AdapterView.OnItemClickListener, SearchContract.View {
    private EditText editText;
    private ListView listView;
    private Button btnSearch;
    private SearchPresenter mPresenter;
    List<SearchPlaceModel> model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        mPresenter = new SearchPresenter(getApplicationContext());
        mPresenter.bind(this);
        editText = findViewById(R.id.edit_textSearch);
        listView = findViewById(R.id.list_town);
        listView.setOnItemClickListener(this);
        btnSearch = findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        mPresenter.getWeatherByName(editText.getText().toString());
    }

    @Override
    public void onSuccess(List<SearchPlaceModel> placeModels) {
        model = placeModels;
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < placeModels.size(); i++) {
            arrayList.add(placeModels.get(i).getLocalizedName() + "\n" +
                    placeModels.get(i).getAdministrativeArea().getLocalizedName());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);
    }

    @Override
    public void onError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent();
        intent.putExtra("locationKey", model.get(position).getKey());
        intent.putExtra("CityName", model.get(position).getLocalizedName());
        setResult(RESULT_OK, intent);
        finish();
    }

    @Override
    public void showInvalidCityMessage(String msg) {
        editText.setError(msg);
    }

    @Override
    public void showLoadingIndicator() {
        showProgressBar();
    }

    @Override
    public void hideLoadingIndicator() {
        dismissProgressBar();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.unbind();
    }
}
