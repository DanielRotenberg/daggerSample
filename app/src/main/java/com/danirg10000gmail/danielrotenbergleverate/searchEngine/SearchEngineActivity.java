package com.danirg10000gmail.danielrotenbergleverate.searchEngine;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.danirg10000gmail.danielrotenbergleverate.R;
import com.danirg10000gmail.danielrotenbergleverate.common.App;
import com.danirg10000gmail.danielrotenbergleverate.common.base.BaseActivity;
import com.danirg10000gmail.danielrotenbergleverate.searchEngine.SearchEngineContract.Presenter;
import javax.inject.Inject;

public class SearchEngineActivity extends AppCompatActivity implements SearchEngineContract.View {

  @Inject
  SearchEngineContract.Presenter mPresenter;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_search_engine);
    DaggerSearchEngineComponent.builder()
        .searchEngineNetworkComponent(((App) getApplication()).getDaggerSearchEngineComponent())
        .searchEngineModule(new SearchEngineModule(this))
        .build()
        .inject(this);


  }

  @Override
  public void setPresenter(Presenter presenter) {

  }
}
