package com.example.sprint1;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Network {

    private static final String BASE_URL = "https://gist.githubusercontent.com/Dcosta2205/cd3bf4cfdf6911fb26ae95672adb468e/raw/62d68fac146598cdba379317011ac9aa1aca8621/";

    /*
    This httpLoggingInterceptor is used to get the Api request logs, how the Api looks like, whats the
    status code, and the response.
     */
    private static HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

    /*
    This method gives the retrofit instance

     */
    public static retrofit2.Retrofit getRetrofitInstance() {
        Retrofit.Builder builder = new Retrofit.Builder().baseUrl(BASE_URL)
                //In most cases requests to a server, and the responses from the server, are not Java objects. They’re mapped to some language neutral format like JSON
                .addConverterFactory(GsonConverterFactory.create())
                //this client will help you to print the API call logs in the Logcat
                .client(new OkHttpClient.Builder()
                        .addInterceptor(httpLoggingInterceptor)
                        .build());
        return builder.build();
    }

}