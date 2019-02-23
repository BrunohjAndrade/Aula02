package i.pdm.geradornumeroaleatorios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void gerarValor(View view) {
        TextView l = (TextView) findViewById(R.id.texto);
        EditText campo = (EditText)findViewById(R.id.campo);
        l.setText(campo.getText());
        campo.setText("");


    }
}
