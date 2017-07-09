package com.danirg10000gmail.danielrotenbergleverate.common.injection.module;

import com.danirg10000gmail.danielrotenbergleverate.common.SearchEngineServiceApi;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by DanielR on 07/07/2017.
 */
@Singleton
@Module
public class NetworkModule {

  private static final String BASE_URL = "https://api.github.com";

  @Provides
  @Singleton
  public OkHttpClient provideOkhttp() {
    OkHttpClient.Builder builder = new OkHttpClient.Builder();
    return builder.build();
  }

  @Provides
  @Singleton
  public Gson provideGson() {
    return new GsonBuilder().create();
  }

  @Provides
  @Singleton
  public Retrofit provideRetrofit(OkHttpClient client, Gson gson) {
    Retrofit.Builder builder = new Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(client)
        .addConverterFactory(GsonConverterFactory.create(gson));
    return builder.build();
  }

  @Provides
  @Singleton
  public SearchEngineServiceApi provideSearchService(Retrofit retrofit) {
    return retrofit.create(SearchEngineServiceApi.class);
  }
}
