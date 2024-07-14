package com.festafimdeano.data;

import android.content.Context;
import android.content.SharedPreferences;

public class SecurityPreferences {
    private SharedPreferences sharedPreferences;

    // Construtor
    public SecurityPreferences(Context context) {
        this.sharedPreferences = context.getSharedPreferences("FestaFimDeAno", Context.MODE_PRIVATE);
    }

    public void storedString(String key, String value) {
        this.sharedPreferences.edit().putString(key, value).apply();
    }

    public String getStoredString(String key) {
        return this.sharedPreferences.getString(key, "");
    }
}
