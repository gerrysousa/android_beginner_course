package com.festafimdeano.views;

import static com.festafimdeano.constants.FimDeAnoConstants.CONFIRMATION_NO;
import static com.festafimdeano.constants.FimDeAnoConstants.CONFIRMATION_YES;
import static com.festafimdeano.constants.FimDeAnoConstants.PRESENCE_KEY;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.festafimdeano.R;
import com.festafimdeano.data.SecurityPreferences;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ViewHolder mViewHolder = new ViewHolder();
    private static SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    private SecurityPreferences securityPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        this.mViewHolder.textToday = findViewById(R.id.today);
        this.mViewHolder.textDaysLeft = findViewById(R.id.text_days_left);
        this.mViewHolder.btnConfirm = findViewById(R.id.btn_confirm);

        this.mViewHolder.btnConfirm.setOnClickListener(this);
        this.securityPreferences = new SecurityPreferences(this);

        //Dates
        this.mViewHolder.textToday.setText(SIMPLE_DATE_FORMAT.format(Calendar.getInstance().getTime()));

        String daysLeft = String.format("%s %s", this.getDaysLeft(), getString(R.string.days));
        this.mViewHolder.textDaysLeft.setText(daysLeft);
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.verifyConfirmation();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_confirm) {
            String presence = this.securityPreferences.getStoredString(PRESENCE_KEY);
            Intent intent = new Intent(this, DetailsActivity.class);
            intent.putExtra(PRESENCE_KEY, presence);
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

    private void verifyConfirmation() {
        String presence = this.securityPreferences.getStoredString(PRESENCE_KEY);
        if (CONFIRMATION_YES.equals(presence)) {
            this.mViewHolder.btnConfirm.setText(getString(R.string.yes));
        } else if (CONFIRMATION_NO.equals(presence)) {
            this.mViewHolder.btnConfirm.setText(getString(R.string.no));
        } else {
            this.mViewHolder.btnConfirm.setText(getString(R.string.not_confirmed));
        }
    }
}