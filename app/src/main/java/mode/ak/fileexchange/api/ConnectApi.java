package mode.ak.fileexchange.api;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * - Created by Adrian on 29.12.2017.
 */
public interface ConnectApi {
    @GET
    Single<ConnectResponse> connect(@Url String url);
}
