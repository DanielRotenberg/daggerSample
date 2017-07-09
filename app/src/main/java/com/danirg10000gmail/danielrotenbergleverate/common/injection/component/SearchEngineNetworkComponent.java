package com.danirg10000gmail.danielrotenbergleverate.common.injection.component;

import com.danirg10000gmail.danielrotenbergleverate.common.SearchEngineServiceApi;
import com.danirg10000gmail.danielrotenbergleverate.common.data.SearchRepository;
import com.danirg10000gmail.danielrotenbergleverate.common.injection.module.NetworkModule;
import com.danirg10000gmail.danielrotenbergleverate.common.injection.module.SearchRepositoryModule;
import dagger.Component;
import javax.inject.Singleton;


@Singleton
@Component(modules = {NetworkModule.class, SearchRepositoryModule.class})
public interface SearchEngineNetworkComponent {

  SearchRepository getSearchRepository();

  SearchEngineServiceApi getSearchService();


}
