# Appium Java Framework

Sample framework for running tests on Android emulators.
All of the tests run in Chrome and perform basic steps on the website.

## Requirements
1. Install the Android SDK.
2. Create an emulator.
3. Install Appium.
4. Install NodeJS.


## Execution
1. Start Appium Server:
```
appium --chromedriver-executable /c/Users/bmacdonald/Documents/Drivers/chromedriver_2.30.exe
```
2. Execute the tests:
```
mvn test -DdeviceName=Nexus_5X_API_26 -Dplatform=Android
```
3. To run on a physical device, execute the following to get a connected device name, and substitute it in point 2 above:
```
adb devices
```





