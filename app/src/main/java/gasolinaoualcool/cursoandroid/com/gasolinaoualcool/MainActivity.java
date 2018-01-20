package gasolinaoualcool.cursoandroid.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool,precoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool    = (EditText)  findViewById(R.id.precoAlcoolID);
        precoGasolina  = (EditText)  findViewById(R.id.precoGasolinaId);
        botaoVerificar = (Button)    findViewById(R.id.botaoVerificarId);
        textoResultado = (TextView)  findViewById(R.id.textoResultadoId);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //recuperar valores digitados
                String textoPrecoAlcool   = precoAlcool.getText().toString();
                String textoPrecoGasolina = precoGasolina.getText().toString();

                //converter  string para double
                Double valorAlcool = Double.parseDouble(textoPrecoAlcool);
                Double valorGasolina = Double.parseDouble(textoPrecoGasolina);

                //alcool / gasolina
                double resultado = valorAlcool / valorGasolina;

              if(textoPrecoAlcool.isEmpty() || textoPrecoGasolina.isEmpty()){
                  textoResultado.setText("Preencha corretamente");
              }

               else if(resultado >= 0.7){
                    //Gasolina
                    textoResultado.setText("Melhor utilizar Gasolina");

                }else{
                    //Alcool
                    textoResultado.setText("Melhor utilizar Alcool");


                }

            }
        });


    }
}
