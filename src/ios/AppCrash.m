/********* AppCrash.m Cordova Plugin Implementation *******/

#import <Cordova/CDV.h>

@interface AppCrash : CDVPlugin {
  // Member variables go here.
}

- (void)crash:(CDVInvokedUrlCommand*)command;
@end

@implementation AppCrash

- (void)crash:(CDVInvokedUrlCommand *)command{
    CDVPluginResult* pluginResult = nil;
    NSString* echo = [command.arguments objectAtIndex:0];
    
    if (echo != nil && [echo length] > 0) {
        int x = 0;
        int y = x/0;

    } else {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR];
    }
    
    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end
