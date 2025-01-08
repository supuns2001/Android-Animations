package lk.javainstitute.app19;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

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
                textView1.setText("Hello Git Hub");
                t.setView(view1);

                t.setDuration(Toast.LENGTH_LONG);
                t.setGravity(Gravity.CENTER,0,0);
                t.show();
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                 new AlertDialog.Builder(MainActivity.this)
//                         .setTitle("Error")
//                         .setMessage("Invalin details of git hub")
//                         .show();

                LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
                View view2 = inflater.inflate(R.layout.layout2,null,false);

                TextView textView2 =  view2.findViewById(R.id.textView2);
                textView2.setText("Error");

                TextView textView3 =  view2.findViewById(R.id.textView3);
                textView3.setText("Invalid details of Git Hub");


                Button okbutton = view2.findViewById(R.id.button3);
                okbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.i("App19Log","ok");
                    }
                });

                new AlertDialog.Builder(MainActivity.this).setView(view2).show();


            }
        });

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View layoutView = findViewById(R.id.linearLayout1);
                Snackbar.make(layoutView , "hello Snack Bar",Snackbar.LENGTH_LONG)
                        .setAction("OK", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Log.i("App19Log","ok");
                            }
                        }).show();
            }
        });
    }
}