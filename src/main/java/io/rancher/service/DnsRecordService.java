package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.DnsRecord;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface DnsRecordService {

  @GET("project/{projectid}/dnsRecord")
  Call<TypeCollection<DnsRecord>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/dnsRecord")
  Call<TypeCollection<DnsRecord>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/dnsRecord/{id}")
  Call<DnsRecord> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/dnsRecord")
  Call<DnsRecord> create(@Path("projectid") String projectid,@Body DnsRecord dnsRecord);

  @PUT("project/{projectid}/dnsRecord/{id}")
  Call<DnsRecord> update(@Path("projectid") String projectid,@Path("id") String id, @Body DnsRecord dnsRecord);

  @DELETE("project/{projectid}/dnsRecord/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
