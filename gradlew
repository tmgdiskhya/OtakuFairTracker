<?xml version="1.0" encoding="UTF-8"?>
<root>
  <item name="android.net.wifi.rtt.RangingRequest.Builder android.net.wifi.rtt.RangingRequest.Builder addAccessPoint(android.net.wifi.ScanResult) 0">
    <annotation name="android.support.annotation.NonNull" />
  </item>
  <item name="android.net.wifi.rtt.RangingRequest.Builder android.net.wifi.rtt.RangingRequest.Builder addAccessPoints(java.util.List&lt;android.net.wifi.ScanResult&gt;) 0">
    <annotation name="android.support.annotation.NonNull" />
  </item>
  <item name="android.net.wifi.rtt.RangingRequest.Builder android.net.wifi.rtt.RangingRequest.Builder addWifiAwarePeer(android.net.MacAddress) 0">
    <annotation name="android.support.annotation.NonNull" />
  </item>
  <item name="android.net.wifi.rtt.RangingRequest.Builder android.net.wifi.rtt.RangingRequest.Builder addWifiAwarePeer(android.net.wifi.aware.PeerHandle) 0">
    <annotation name="android.support.annotation.NonNull" />
  </item>
  <item name="android.net.wifi.rtt.RangingResult android.net.MacAddress getMacAddress()">
    <annotation name="android.support.annotation.Nullable" />
  </item>
  <item name="android.net.wifi.rtt.RangingResult android.net.wifi.aware.PeerHandle getPeerHandle()">
    <annotation name="android.support.annotation.Nullable" />
  </item>
  <item name="android.net.wifi.rtt.RangingResult int getStatus()">
    <annotation name="android.support.annotation.IntDef">
      <val name="value" val="{android.net.wifi.rtt.RangingResult.STATUS_SUCCESS, android.net.wifi.rtt.RangingResult.STATUS_FAIL, android.net.wifi.rtt.RangingResult.STATUS_RESPONDER_DOES_NOT_SUPPORT_IEEE80211MC}" />
    </annotation>
  </item>
  <item name="android.net.wifi.rtt.RangingResultCallback void onRangingFailure(int) 0">
    <annotation name="android.support.annotation.IntDef">
      <val name="value" val="{android.net.wifi.rtt.RangingResultCallback.STATUS_CODE_FAIL, android.net.wifi.rtt.RangingResultCallback.STATUS_CODE_FAIL_RTT_NOT_AVAILABLE}" />
    </annotation>
  </item>
  <item name="android.net.wifi.rtt.RangingResultCallback void onRangingResults(java.util.List&lt;android.net.wifi.rtt.RangingResult&gt;) 0">
    <annotation name="android.support.annotation.NonNull" />
  </item>
  <item name="android.net.wifi.rtt.WifiRttManager">
    <annotation name="android.support.annotation.SystemService">
      <val name="value" val="android.content.Context.WIFI_RTT_RANGING_SERVICE" />
    </annotation>
  </item>
  <item name="android.net.wifi.rtt.WifiRttManager void startRanging(android.net.wifi.rtt.RangingRequest, java.util.concurrent.Executor, android.net.wifi.rtt.RangingResultCallback)">
    <annotation name="android.support.annotation.RequiresPermission">
      <val name="allOf" val="{&quot;android.permission.ACCESS_FINE_LOCATION&quot;, &quot;android.permission.CHANGE_WIFI_STATE&quot;, &quot;android.permission.ACCESS_WIFI_STATE&quot;}" />
    </annotation>
  </item>
  <item name="android.net.wifi.rtt.WifiRttManager void startRanging(android.net.wifi.rtt.RangingRequest, java.util.concurrent.Executor, android.net.wifi.rtt.RangingResultCallback) 0">
    <annotation name="android.support.annotation.NonNull" />
  </item>
  <item name="android.net.wifi.rtt.WifiRttManager void startRanging(android.net.wifi.rtt.RangingRequest, java.util.concurrent.Executor, android.net.wifi.rtt.RangingResultCallback) 1">
    <annotation name="android.support.annotation.NonNull" />
    <annotation name="android.support.annotation.CallbackExecutor" />
  </item>
  <item name="android.net.wifi.rtt.WifiRttManager void startRanging(android.net.wifi.rtt.RangingRequest, java.util.concurrent.Executor, android.net.wifi.rtt.RangingResultCallback) 2">
    <annotation name="android.support.annotation.NonNull" />
  </item>
</root>

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 