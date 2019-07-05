package camera.vstc.com.flutter_plugin12;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;
import vstc2.nativecaller.NativeCaller;

/** FlutterPlugin12Plugin */
public class FlutterPlugin12Plugin implements MethodCallHandler {
  /** Plugin registration. */
  public static void registerWith(Registrar registrar) {
    final MethodChannel channel = new MethodChannel(registrar.messenger(), "flutter_plugin12");
    channel.setMethodCallHandler(new FlutterPlugin12Plugin());
  }

  @Override
  public void onMethodCall(MethodCall call, Result result) {
    NativeCaller mNativeCaller=new NativeCaller();
    if (call.method.equals("getPlatformVersion")) {
      result.success("Android " + android.os.Build.VERSION.RELEASE);
    } else {
      result.notImplemented();
    }
  }
}
