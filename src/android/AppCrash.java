package com.appcrash.plugin;
import org.json.JSONArray;
import java.lang.System;
import java.lang.RuntimeException;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import android.content.Context;

public class AppCrash extends CordovaPlugin {
  @Override
  public boolean execute(
    String action, 
    JSONArray args, 
    CallbackContext callbackContext
  ) throws RuntimeException {
    if ("crash".equals(action)) {
      this.crashAlreadyYouApp();
    }
    else {
      callbackContext.error("could not throw");
    }
    return false;
  }

  public void crashAlreadyYouApp() {
    this.cordova.getActivity().runOnUiThread(new Runnable() {
			@Override
			public void run() {
				throw new RuntimeException("This is a crash");
			}
		});
  }
}