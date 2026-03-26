package com.example.migamestreamserver;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;

public class MiGameAccessibilityService extends AccessibilityService {
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        // 无障碍服务核心逻辑
    }

    @Override
    public void onInterrupt() {}
}
