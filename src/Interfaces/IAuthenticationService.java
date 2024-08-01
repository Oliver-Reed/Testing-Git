package Interfaces;
import classes.User;

public interface IAuthenticationService {
    User signUp(String username, String password);
    User logIn(String username, String password);
}