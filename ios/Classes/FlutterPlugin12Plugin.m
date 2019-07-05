#import "FlutterPlugin12Plugin.h"
#import <flutter_plugin12/flutter_plugin12-Swift.h>

@implementation FlutterPlugin12Plugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftFlutterPlugin12Plugin registerWithRegistrar:registrar];
}
@end
