package com.danirg10000gmail.danielrotenbergleverate.searchEngine;

import com.danirg10000gmail.danielrotenbergleverate.common.injection.annotation.PerActivity;
import com.danirg10000gmail.danielrotenbergleverate.common.injection.component.SearchEngineNetworkComponent;
import dagger.Component;

@PerActivity
@Component(dependencies = SearchEngineNetworkComponent.class, modules = SearchEngineModule.class)
public interface SearchEngineComponent {

  void inject(SearchEngineActivity activity);
}
