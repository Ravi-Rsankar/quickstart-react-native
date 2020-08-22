package com.quickstart;
import com.facebook.react.ReactActivity;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.android.gms.tasks.OnCompleteListener;
import androidx.annotation.NonNull;
import android.widget.Toast;
import com.google.android.gms.tasks.Task;

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "quickstart";
  }
}
