package com.example.migamestreamserver;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnAccessibility;
    private Button btnStream;
    private TextView tvStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAccessibility = findViewById(R.id.btn_accessibility);
        btnStream = findViewById(R.id.btn_stream);
        tvStatus = findViewById(R.id.tv_status);

        btnAccessibility.setOnClickListener(v -> {
            Intent intent = new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS);
            startActivity(intent);
        });

        btnStream.setOnClickListener(v -> {
            if (btnStream.getText().toString().equals(getString(R.string.start_stream))) {
                startService(new Intent(this, StreamServiceOptimized.class));
                btnStream.setText(R.string.stop_stream);
                tvStatus.setText(R.string.stream_running);
            } else {
                stopService(new Intent(this, StreamServiceOptimized.class));
                btnStream.setText(R.string.start_stream);
                tvStatus.setText("");
            }
        });
    }
}
