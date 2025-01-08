package lk.javainstitute.app19;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Hello Dear!", Toast.LENGTH_SHORT).show();

                Toast t = new Toast(MainActivity.this);

                LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
                View view1 = inflater.inflate(R.layout.layout1,null,false);
                TextView textView1 =  view1.findViewById(R.id.textView);
                textView1.setText("Hello how are You");
                t.setView(view1);

                t.setDuration(Toast.LENGTH_LONG);
                t.show();
            }
        });
    }
}