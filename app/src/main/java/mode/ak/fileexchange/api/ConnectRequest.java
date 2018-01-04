package mode.ak.fileexchange.api;

import com.google.gson.annotations.SerializedName;

/**
 * - Created by Adrian on 29.12.2017.
 */
public class ConnectRequest {
    @SerializedName("token") private String token;

    public ConnectRequest(String token) {
        this.token = token;
    }
}
