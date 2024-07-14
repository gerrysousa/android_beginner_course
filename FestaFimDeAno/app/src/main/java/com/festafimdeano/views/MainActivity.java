package com.festafimdeano.views;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.festafimdeano.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ViewHolder mViewHolder = new ViewHolder();
    private static SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        this.mViewHolder.textToday = findViewById(R.id.today);
        this.mViewHolder.textDaysLeft = findViewById(R.id.text_days_left);
        this.mViewHolder.btnConfirm = findViewById(R.id.btn_confirm);

        this.mViewHolder.btnConfirm.setOnClickListener(this);

        //Dates
        this.mViewHolder.textToday.setText(SIMPLE_DATE_FORMAT.format(Calendar.getInstance().getTime()));

        String daysLeft = String.format("%s %s", this.getDaysLeft(), getString(R.string.days));
        this.mViewHolder.textDaysLeft.setText(daysLeft);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_confirm) {
            Intent intent = new Intent(this, DetailsActivity.class);
            startActivity(intent);
        }
    }

    private static class ViewHolder {
        TextView textToday;
        TextView textDaysLeft;
        Button btnConfirm;
    }

    private int getDaysLeft() {
        //Today
        Calendar today = Calendar.getInstance();
        int todayInt = today.get(Calendar.DAY_OF_YEAR);

        //Last day of year
        Calendar lastDayOfYear = Calendar.getInstance();
        int lastDayOfYearInt = lastDayOfYear.getActualMaximum(Calendar.DAY_OF_YEAR);

        return lastDayOfYearInt - todayInt;
    }
}