package features.user.loginUser;

import com.intuit.karate.junit5.Karate;

public class LoginUserRunner {
    @Karate.Test
    Karate testLoginUser(){
        return Karate.run("logoutUserRegression.feature").relativeTo(getClass());
    }
}
