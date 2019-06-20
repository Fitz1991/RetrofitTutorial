package ru.mustakimov.retrofittutorial.api;

import java.util.List;


import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import ru.mustakimov.retrofittutorial.PostModel;
import ru.mustakimov.retrofittutorial.UserInfo;


/**
 * Created by misha on 31.10.2016.
 */
public interface UmoriliApi {


    @GET("/api/get")
    Call<List<PostModel>> getData(@Query("name") String resourceName, @Query("num") int count);
//
//    @POST("/api/post")
//    Call<Response> postData(@Part("name") String resourceName, @Part("num") int count);


    @Headers({"Content-Type:application/json"})
    @POST("/identitytoolkit/v3/relyingparty/signupNewUser/")
    Observable<UserInfo> signupNewUser(@Query("key") String key, @Body UserInfo userInfo);
}
