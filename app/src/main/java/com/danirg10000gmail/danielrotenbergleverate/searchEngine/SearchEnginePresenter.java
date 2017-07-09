package com.danirg10000gmail.danielrotenbergleverate.searchEngine;

import com.danirg10000gmail.danielrotenbergleverate.common.data.SearchRepository;
import com.danirg10000gmail.danielrotenbergleverate.searchEngine.SearchEngineContract.View;
import javax.inject.Inject;

public class SearchEnginePresenter implements SearchEngineContract.Presenter {

  private SearchEngineContract.View mView;
  private SearchRepository mRepository;

  @Inject
  public SearchEnginePresenter( SearchRepository repository) {

    mRepository = repository;
  }

  @Override
  public void start() {

  }

  @Override
  public void stop() {

  }
}
