package ru.mustakimov.retrofittutorial;

import android.content.Context;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import ru.mustakimov.retrofittutorial.api.UmoriliApi;




public class MainActivity extends AppCompatActivity {

    private final String clientId = "your-client-id";
    private final String clientSecret = "your-client-secret";
    private final String redirectUri = "your://redirecturi";

    private String FILENAME = "response.json";


    private static final String TAG = "myLog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        posts = new ArrayList<>();
//
//        recyclerView = (RecyclerView) findViewById(R.id.posts_recycle_view);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);
//
//        PostsAdapter adapter = new PostsAdapter(posts);
//        recyclerView.setAdapter(adapter);


        //делаем запрос, сам callback возвращаем нам данные в объекте response
//        App.getApi().getData("bash", 50).enqueue(new Callback<List<PostModel>>() {
//            @Override
//            public void onResponse(Call<List<PostModel>> call, Response<List<PostModel>> response) {
//                posts.addAll(response.body());
//
//                recyclerView.getAdapter().notifyDataSetChanged();
//            }
//
//            @Override
//            public void onFailure(Call<List<PostModel>> call, Throwable t) {
//                Toast.makeText(MainActivity.this, "An error occurred during networking", Toast.LENGTH_SHORT).show();
//            }
//        });
//        UmoriliApi api = App.getApi();
//        String key = "AIzaSyAFgolvhAHKy9DcYs0M0VQ7wRN2Zu3yWME";
//        UserInfo userInfo = new UserInfo();
//        userInfo.setEmail("dimka22345@outlook.ru");
//        userInfo.setPassword("dimka12345");
//        userInfo.setReturnSecureToken(true);
//
//        App.getApi().signupNewUser(key, userInfo).observeOn(AndroidSchedulers.mainThread()).subscribe(user -> {
//            Log.d(TAG, "Уникальный идентифиткатор пользователя: " + user.getLocalId());
//        }, throwable -> {
//            Log.d(TAG, throwable.getMessage());
//        });

        try {
            String data = readFromAssets(this, "response.json");
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            Object murzik = gson.fromJson(data, Object.class);
            Log.d(TAG, data);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static String readFromAssets(Context context, String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(context.getAssets().open(filename)));

        // do reading, usually loop until end of file reading
        StringBuilder sb = new StringBuilder();
        String mLine = reader.readLine();
        while (mLine != null) {
            sb.append(mLine); // process line
            mLine = reader.readLine();
        }
        reader.close();
        return sb.toString();
    }
}
