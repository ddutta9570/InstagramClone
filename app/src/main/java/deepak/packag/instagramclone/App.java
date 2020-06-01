package deepak.packag.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("xuWnsGKdBgFP9y48a2UpkZBQDnPsXcWT6vy2kciJ")
                // if defined
                .clientKey("L2Tqn9eE5hjvsGg6Iyn2YxPlLfMbess4uJgD2b4y")
                .server("https://parseapi.back4app.com/")
                .build()
        );


    }
}
