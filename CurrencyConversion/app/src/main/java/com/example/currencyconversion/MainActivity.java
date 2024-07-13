package com.example.currencyconversion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        this.mViewHolder.editValue = findViewById(R.id.edit_valor);
        this.mViewHolder.textDollar = findViewById(R.id.text_dolar);
        this.mViewHolder.textEuro = findViewById(R.id.text_euro);
        this.mViewHolder.btnCalculate = findViewById(R.id.button_calculate);

        this.mViewHolder.btnCalculate.setOnClickListener(this);

        this.clearValues();
    }

    private void clearValues() {
        this.mViewHolder.editValue.setText("");
        this.mViewHolder.textDollar.setText("");
        this.mViewHolder.textEuro.setText("");
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button_calculate) {
            //this.calculate();
            String value = this.mViewHolder.editValue.getText().toString();
            if ("".equals(value))            {
                Toast.makeText(this, "Digite um valor", Toast.LENGTH_LONG).show();
            }else {
                Double valueDouble = Double.parseDouble(value);

                this.mViewHolder.textDollar.setText(String.format("%.2f", valueDouble / 5.0));
                this.mViewHolder.textEuro.setText(String.format("%.2f", valueDouble / 6.0));
            }

        }
    }

    private static class ViewHolder {
        EditText editValue;
        TextView textDollar;
        TextView textEuro;
        Button btnCalculate;
    }

}