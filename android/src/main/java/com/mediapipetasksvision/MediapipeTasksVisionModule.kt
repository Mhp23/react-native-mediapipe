package com.mediapipetasksvision

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = MediapipeTasksVisionModule.NAME)
class MediapipeTasksVisionModule(reactContext: ReactApplicationContext) :
  NativeMediapipeTasksVisionSpec(reactContext) {

  override fun getName(): String {
    return NAME
  }

  companion object {
    const val NAME = "MediapipeTasksVision"
  }
}
