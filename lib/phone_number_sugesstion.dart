import 'package:flutter/services.dart';
class PhoneNumberHint {
  final methodChannel = const MethodChannel('phone_number_hint');
  Future<Map<String,dynamic>?> requestHint() async {
    final result = await methodChannel.invokeMethod<Map<String,dynamic>>('requestHint');
    return result;
  }
}