package com.siam.stopoverwrite;

import android.content.Context;
import android.widget.Toast;

public class Toastity {
    private String message;
    private Context context;

    public Toastity(String message, Context context) {
        this.message = message;
        this.context = context;

        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
