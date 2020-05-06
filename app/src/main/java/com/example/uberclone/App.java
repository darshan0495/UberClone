package com.example.uberclone;
import com.parse.Parse;
import android.app.Application;

    public class App extends Application {

        // Initializes Parse SDK as soon as the application is created
        @Override
        public void onCreate() {
            super.onCreate();

            Parse.initialize(new Parse.Configuration.Builder(this)
                    .applicationId("l9rc2xAG9K868mAvyfeORoLWXqYsfwzya5Cslxne")
                    .clientKey("eEqJSknmmDzix6t1EG7cnpidpLK6DMn6XEcxbxtO")
                    .server("https://parseapi.back4app.com")
                    .build()
            );
        }
    }
