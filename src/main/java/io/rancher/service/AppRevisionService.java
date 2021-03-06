package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AppRevision;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AppRevisionService {

  @GET("project/{projectid}/appRevision")
  Call<TypeCollection<AppRevision>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/appRevision")
  Call<TypeCollection<AppRevision>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/appRevision/{id}")
  Call<AppRevision> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/appRevision")
  Call<AppRevision> create(@Path("projectid") String projectid,@Body AppRevision appRevision);

  @PUT("project/{projectid}/appRevision/{id}")
  Call<AppRevision> update(@Path("projectid") String projectid,@Path("id") String id, @Body AppRevision appRevision);

  @DELETE("project/{projectid}/appRevision/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
