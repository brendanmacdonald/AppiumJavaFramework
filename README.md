# Appium Java Framework

Sample framework for running tests on Android emulators and real Android devices.
All of the tests run in the Chrome browser and perform basic steps on the website.

## Requirements
1. Install the Android SDK.
2. Create an emulator.
3. Update the resources/testng.xml file to match the names & platforms of your emulators/devices.
E.g.
<parameter name="deviceName" value="Nexus_6_API_26" />
<parameter name="platform" value="Android" />
4. Install Appium.
5. Install NodeJS.


## Execution
1. Start Appium Server:
```
appium --chromedriver-executable /<path to you local installation of>/chromedriver_2.30.exe
```
2. Execute the tests:
```
mvn test
```
3. To run on a physical device, execute the following to get a connected device name, and substitute it in point 2 above:
```
adb devices
```





