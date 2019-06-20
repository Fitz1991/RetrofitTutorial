package ru.mustakimov.retrofittutorial;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserResponse implements UserResponseRegistration{

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("idToken")
    @Expose
    private boolean idToken;

    @SerializedName("refreshToken")
    @Expose
    private boolean refreshToken;

    @SerializedName("expiresIn")
    @Expose
    private boolean expiresIn;

    @SerializedName("localId")
    @Expose
    private boolean localId;

    public boolean isIdToken() {
        return idToken;
    }

    public void setIdToken(boolean idToken) {
        this.idToken = idToken;
    }

    public boolean isRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(boolean refreshToken) {
        this.refreshToken = refreshToken;
    }

    public boolean isExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(boolean expiresIn) {
        this.expiresIn = expiresIn;
    }

    public boolean isLocalId() {
        return localId;
    }

    public void setLocalId(boolean localId) {
        this.localId = localId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
