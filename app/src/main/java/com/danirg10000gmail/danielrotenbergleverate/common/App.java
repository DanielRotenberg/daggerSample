package com.danirg10000gmail.danielrotenbergleverate.common;

import android.app.Application;
import com.danirg10000gmail.danielrotenbergleverate.common.injection.component.DaggerSearchEngineNetworkComponent;
import com.danirg10000gmail.danielrotenbergleverate.common.injection.component.SearchEngineNetworkComponent;


public class App extends Application {

  private SearchEngineNetworkComponent mDaggerSearchEngineComponent;

  @Override
  public void onCreate() {
    super.onCreate();

    mDaggerSearchEngineComponent = DaggerSearchEngineNetworkComponent.builder().build();
  }

  public SearchEngineNetworkComponent getDaggerSearchEngineComponent() {
    return mDaggerSearchEngineComponent;
  }
}
