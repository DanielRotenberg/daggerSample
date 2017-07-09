package com.danirg10000gmail.danielrotenbergleverate.common.data;

import com.danirg10000gmail.danielrotenbergleverate.common.SearchEngineServiceApi;
import javax.inject.Inject;

public class SearchRepository {

  private SearchEngineServiceApi mServiceApi;

  @Inject
  public SearchRepository(SearchEngineServiceApi serviceApi) {
    mServiceApi = serviceApi;
  }

}
