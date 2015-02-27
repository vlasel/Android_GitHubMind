package by.htp.vlas.githubmind;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.GET;

/**
 * Created by VlasEL on 25.02.2015 14:20
 */
public interface GitHubService {

    @GET("/zen")
    void zen(Callback<Response> callback);

}
