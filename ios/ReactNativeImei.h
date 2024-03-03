
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNImeiSpec.h"

@interface Imei : NSObject <NativeImeiSpec>
#else
#import <React/RCTBridgeModule.h>

@interface Imei : NSObject <RCTBridgeModule>
#endif

@end
