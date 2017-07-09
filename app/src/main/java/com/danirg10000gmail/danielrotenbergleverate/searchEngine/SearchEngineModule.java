package com.danirg10000gmail.danielrotenbergleverate.searchEngine;

import com.danirg10000gmail.danielrotenbergleverate.common.injection.annotation.PerActivity;
import com.danirg10000gmail.danielrotenbergleverate.searchEngine.SearchEngineContract.View;
import dagger.Module;
import dagger.Provides;

@PerActivity
@Module
public class SearchEngineModule {

  private SearchEngineContract.View mView;

  public SearchEngineModule(View view) {
    mView = view;
  }

  @Provides
  @PerActivity
  public SearchEngineContract.View provideView() {
    return mView;
  }
}
