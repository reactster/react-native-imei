import Imei from './NativeImei';
import { Platform, PermissionsAndroid } from 'react-native';

export const getIMEI = async () => {
  try {
    if (Platform.OS === 'android') {
      const granted = await PermissionsAndroid.request(
        'android.permission.READ_PHONE_STATE'
      );

      if (!granted) {
        throw 'Permission Un-granted';
      }
    }

    return Imei.get();
  } catch (error) {
    return Promise.reject(error);
  }
};
