import 'dart:async';

import 'package:flutter/services.dart';

class FlutterPlugin12 {
  static const MethodChannel _channel =
      const MethodChannel('flutter_plugin12');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }
}
