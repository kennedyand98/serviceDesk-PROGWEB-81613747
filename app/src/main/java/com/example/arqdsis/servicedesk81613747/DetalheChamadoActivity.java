package com.example.arqdsis.servicedesk81613747;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetalheChamadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_chamado);
        TextView nome = (TextView) findViewById(R.id.chamado_selecionado);
        Intent origemIntent = getIntent();

        nome.setText(origemIntent.getStringExtra(ListarChamadosActivity.DESCRICAO));
    }
}
