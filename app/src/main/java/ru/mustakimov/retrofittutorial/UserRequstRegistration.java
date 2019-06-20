package ru.mustakimov.retrofittutorial;

public interface UserRequstRegistration {
    public String getEmail();

    public void setEmail(String email);

    public String getPassword();

    public void setPassword(String password);

    public boolean isReturnSecureToken();

    public void setReturnSecureToken(boolean returnSecureToken);
}
