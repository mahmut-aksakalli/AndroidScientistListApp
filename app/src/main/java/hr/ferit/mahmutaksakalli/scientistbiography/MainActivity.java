package hr.ferit.mahmutaksakalli.scientistbiography;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    protected Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showShannon(View view){
        int quoteNumber = this.r.nextInt(4);
        String[] quotes = getResources().getStringArray(R.array.shannonQuotes);
        this.displayToastMessage(quotes[quoteNumber]);
    }
    public void showShockley(View view){
        int quoteNumber = this.r.nextInt(2);
        String[] quotes = getResources().getStringArray(R.array.shockleyQuotes);
        this.displayToastMessage(quotes[quoteNumber]);
    }
    public void showGuido(View view){
        int quoteNumber = this.r.nextInt(2);
        String[] quotes = getResources().getStringArray(R.array.guidoQuotes);
        this.displayToastMessage(quotes[quoteNumber]);
    }

    private void displayToastMessage(String Text) {
        Toast T = Toast.makeText(MainActivity.this, Text, Toast.LENGTH_LONG);
        T.show();
    }
}
