package com.danirg10000gmail.danielrotenbergleverate.common.injection.module;

import com.danirg10000gmail.danielrotenbergleverate.common.SearchEngineServiceApi;
import com.danirg10000gmail.danielrotenbergleverate.common.data.SearchRepository;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module
public class SearchRepositoryModule {

  @Provides
  @Singleton
  public SearchRepository provideSearchRepository(SearchEngineServiceApi serviceApi) {
    return new SearchRepository(serviceApi);
  }
}
