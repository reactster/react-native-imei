import * as React from 'react';
import { StyleSheet, View, Text } from 'react-native';
import { getIMEI } from '@reactster/react-native-imei';

export default function App() {
  React.useEffect(() => {
    getIMEI().then(console.log).catch(console.error);
  }, []);

  return (
    <View style={styles.container}>
      <Text>Hello World</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});
