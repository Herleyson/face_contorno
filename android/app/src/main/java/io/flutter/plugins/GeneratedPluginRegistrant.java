package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.camera.CameraPlugin;
import com.gianmarcodifrancesco.firebase_face_contour.FirebaseFaceContourPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    CameraPlugin.registerWith(registry.registrarFor("io.flutter.plugins.camera.CameraPlugin"));
    FirebaseFaceContourPlugin.registerWith(registry.registrarFor("com.gianmarcodifrancesco.firebase_face_contour.FirebaseFaceContourPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
