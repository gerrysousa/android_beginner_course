package com.festafimdeano.views;

import static com.festafimdeano.constants.FimDeAnoConstants.CONFIRMATION_NO;
import static com.festafimdeano.constants.FimDeAnoConstants.CONFIRMATION_YES;
import static com.festafimdeano.constants.FimDeAnoConstants.PRESENCE_KEY;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.festafimdeano.R;
import com.festafimdeano.data.SecurityPreferences;

public class DetailsActivity extends AppCompatActivity implements View.OnClickListener {
    private ViewHolder mViewHolder = new ViewHolder();
    private SecurityPreferences securityPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_details);

        this.securityPreferences = new SecurityPreferences(this);
        this.mViewHolder.checkParticipate = findViewById(R.id.check_participate);
        this.mViewHolder.checkParticipate.setOnClickListener(this);

        this.loadDataFromActivity();
    }

    private void loadDataFromActivity() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String presence = getIntent().getStringExtra(PRESENCE_KEY);
            if (CONFIRMATION_YES.equals(presence)) {
                this.mViewHolder.checkParticipate.setChecked(true);
            } else {
                this.mViewHolder.checkParticipate.setChecked(false);
            }
        }
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.check_participate) {
            if (this.mViewHolder.checkParticipate.isChecked()) {
                this.securityPreferences.storedString(PRESENCE_KEY, CONFIRMATION_YES);
            } else {
                this.securityPreferences.storedString(PRESENCE_KEY, CONFIRMATION_NO);
            }
        }
    }

    private static class ViewHolder {
        CheckBox checkParticipate;
    }
}