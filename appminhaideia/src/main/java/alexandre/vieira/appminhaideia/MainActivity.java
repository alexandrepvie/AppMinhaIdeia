package alexandre.vieira.appminhaideia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String TAG = "APP_MINHA_IDEIA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                /**Fazendo teste no GitHub6*/
        Log.d(TAG, "onCreate: Tela principal carregada...");
    }
}