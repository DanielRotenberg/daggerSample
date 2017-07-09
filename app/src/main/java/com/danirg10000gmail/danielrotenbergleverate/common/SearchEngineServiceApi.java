package com.danirg10000gmail.danielrotenbergleverate.common;

import com.danirg10000gmail.danielrotenbergleverate.common.data.model.Repository;
import com.danirg10000gmail.danielrotenbergleverate.common.data.model.RepositoryResponse;
import com.danirg10000gmail.danielrotenbergleverate.common.data.model.UserResponse;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SearchEngineServiceApi {

  @GET("/users/{username}")
  Call<UserResponse> getUser(
      @Path("username") String username
  );

  @GET("/users/{username}/repos")
  Call<List<RepositoryResponse>> getUsersRepositories(
      @Path("username") String username
  );

  @GET("/users/{user}/repos")
  Call<List<Repository>> getRepository(@Path("user") String userName);
}
