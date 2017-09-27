package appquercarona.loginquercarona;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class telaLogin extends AppCompatActivity {

    EditText editEmail1, editSenha1;
    Button btnLogar;
    TextView txtCadastro;

    String url = "";
    String parametros = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);

        editEmail1 = (EditText)findViewById(R.id.editEmail1);
        editSenha1 = (EditText)findViewById(R.id.editSenha1);
        btnLogar = (Button)findViewById(R.id.btnLogar);
        txtCadastro = (TextView)findViewById(R.id.txtCadastro);


        txtCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreCadastro = new Intent(telaLogin.this, TelaCadastro.class);
                startActivity(abreCadastro);
            }
        });

        btnLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editEmail1.getText().equals("eder")  && editSenha1.getText().equals("123")){
                    Toast.makeText(getApplicationContext(),"Logim Realizado", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Usuario ou senha incorretos", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
