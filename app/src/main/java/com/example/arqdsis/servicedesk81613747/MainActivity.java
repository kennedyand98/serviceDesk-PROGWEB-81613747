package com.example.arqdsis.servicedesk81613747;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String NOME = "com.example.arqdsis.servicedesk81613747.nome";
    private EditText txtNome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNome = findViewById(R.id.busca_fila);

    }
    public void buscarChamados (View view){
        Intent intent = new Intent (this, ListarChamadosActivity.class);
        String nome = txtNome.getText().toString();
        intent.putExtra(NOME,nome);
        startActivity(intent);



        //SELECT SE CHAMA SPNIER

    }
}
