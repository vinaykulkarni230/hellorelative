package in.ac.bldeacet.hellorelative;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView lcount;
    int mcount=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lcount=(TextView)findViewById(R.id.show_count);

    }
    public void countUp(View view){
       mcount++;
       if(lcount !=null) {
           lcount.setText(Integer.toString(mcount));
       }

    }


    public void show_toast(View view){
        Toast toast = Toast.makeText(getApplicationContext(), "Hello Toast", Toast.LENGTH_LONG);
        toast.show();

    }
}

