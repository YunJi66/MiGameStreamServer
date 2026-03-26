package com.example.migamestreamserver;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class MiGameTouchInjector extends AccessibilityService {
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        // 触控注入逻辑将在这里实现
    }

    @Override
    public void onInterrupt() {
        // 中断处理
    }
}
