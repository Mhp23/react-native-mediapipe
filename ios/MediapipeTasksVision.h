
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNMediapipeTasksVisionSpec.h"

@interface MediapipeTasksVision : NSObject <NativeMediapipeTasksVisionSpec>
#else
#import <React/RCTBridgeModule.h>

@interface MediapipeTasksVision : NSObject <RCTBridgeModule>
#endif

@end
