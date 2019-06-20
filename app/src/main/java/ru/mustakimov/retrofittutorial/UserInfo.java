package ru.mustakimov.retrofittutorial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserInfo{

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("password")
    @Expose
    private String password;

    @SerializedName("returnSecureToken")
    @Expose
    private boolean returnSecureToken;

    @SerializedName("kind")
    @Expose
    private String kind;

    @SerializedName("idToken")
    @Expose
    private String idToken;

    @SerializedName("refreshToken")
    @Expose
    private String refreshToken;

    @SerializedName("expiresIn")
    @Expose
    private String expiresIn;

    @SerializedName("localId")
    @Expose
    private String localId;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isReturnSecureToken() {
        return returnSecureToken;
    }

    public void setReturnSecureToken(boolean returnSecureToken) {
        this.returnSecureToken = returnSecureToken;
    }
}
