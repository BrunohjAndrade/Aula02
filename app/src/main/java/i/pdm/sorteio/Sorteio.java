package i.pdm.sorteio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class Sorteio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorteio);
    }


    public void gerarSorteio(View view) {

        TextView resultado = (TextView) findViewById(R.id.resultado);
        EditText valor1 = (EditText) findViewById(R.id.valor1);
        EditText valor2 = (EditText) findViewById(R.id.valor2);
        int vlr1, vlr2, res;
        vlr1 = Integer.parseInt(valor1.getText().toString());
        vlr2 = Integer.parseInt(valor2.getText().toString());

        Random rdm = new Random();
        res = rdm.nextInt(vlr2-vlr1)+vlr1;
        resultado.setText(String.valueOf(res));

    }
}
