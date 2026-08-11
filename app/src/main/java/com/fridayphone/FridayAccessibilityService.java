package com.fridayphone;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;

public class FridayAccessibilityService extends AccessibilityService {

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        if (event == null) {
            return;
        }

        // Only react when text is selected/highlighted.
        if (event.getEventType()
                == AccessibilityEvent.TYPE_VIEW_TEXT_SELECTION_CHANGED) {

            CharSequence text = event.getText() != null
                    && !event.getText().isEmpty()
                    ? event.getText().get(0)
                    : null;

            if (text != null && text.length() > 0) {
                String selectedText = text.toString();

                // F.R.I.D.A.Y. will process the selected text here.
                processSelectedText(selectedText);
            }
        }
    }

    private void processSelectedText(String selectedText) {
        // We will connect this to F.R.I.D.A.Y.'s question
        // detection and answer popup next.
    }

    @Override
    public void onInterrupt() {
        // Required by AccessibilityService.
    }
}
