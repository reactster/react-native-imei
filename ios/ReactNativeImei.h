
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNReactNativeImeiSpec.h"

@interface ReactNativeImei : NSObject <NativeReactNativeImeiSpec>
#else
#import <React/RCTBridgeModule.h>

@interface ReactNativeImei : NSObject <RCTBridgeModule>
#endif

@end
