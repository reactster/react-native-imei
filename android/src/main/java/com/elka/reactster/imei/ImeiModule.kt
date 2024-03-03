package com.elka.reactster.imei

import android.Manifest
import android.util.Log;

import android.content.Context;
import android.telephony.TelephonyManager;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule

import com.elka.reactster.imei.support.AppUtils

@ReactModule(name = ImeiModule.NAME)
class ImeiModule(reactContext: ReactApplicationContext) :
  NativeImeiSpec(reactContext) {

  private val context = reactContext

  companion object {
    const val NAME = "Imei"
  }

  override fun getName(): String {
    return NAME
  }

  override fun get(promise: Promise) {
    try {
      context.currentActivity?.let { AppUtils.checkPermission(it, Manifest.permission.READ_PHONE_STATE) }

      val tm = context.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager

      promise.resolve(tm.deviceId)
    } catch (e: Exception) {
      promise.reject(e.message)
    }
  }
}
