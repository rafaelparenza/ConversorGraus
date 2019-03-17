package rafaelparenza.com.conversorgraus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    private EditText grausEditText;
    private Button verificarButton;
    private TextView fahrenheitTextView;
    private TextView fahrenheitResultadoTextView;
    private TextView kelvinTextView;
    private TextView kelvinResultadoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState)   {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grausEditText = findViewById(R.id.activity_main_Graus_EditText);
        verificarButton = findViewById(R.id.activity_main_verificar_Button);
        fahrenheitResultadoTextView = findViewById(R.id.activity_main_textView_FahrenheitResultado);
        fahrenheitTextView = findViewById(R.id.activity_main_textView_Fahrenheit);
        kelvinTextView = findViewById(R.id.activity_main_textView_kevin);
        kelvinResultadoTextView = findViewById(R.id.activity_main_textView_kevinResultado);
        fahrenheitTextView.setText("Valor em fahrenheit:");
        kelvinTextView.setText("Valor em kelvin:");

        verificarButton.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        if(v == verificarButton)
            calculos();
    }
    public void calculos()
    {
        float celsius = Float.parseFloat( grausEditText.getText().toString());
        float fahrenheit = (float) (celsius*(9/5)+32.0);
        float kevin = (float) (celsius+273.15);

        kelvinResultadoTextView.setText(String.valueOf(kevin));
        fahrenheitResultadoTextView.setText(String.valueOf(fahrenheit));

    }


}
