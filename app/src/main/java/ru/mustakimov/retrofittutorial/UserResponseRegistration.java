package ru.mustakimov.retrofittutorial;

public interface UserResponseRegistration {
    public boolean isIdToken();

    public void setIdToken(boolean idToken);

    public boolean isRefreshToken();

    public void setRefreshToken(boolean refreshToken);

    public boolean isExpiresIn();

    public void setExpiresIn(boolean expiresIn);

    public boolean isLocalId();

    public void setLocalId(boolean localId);

    public String getEmail();

    public void setEmail(String email);
}
