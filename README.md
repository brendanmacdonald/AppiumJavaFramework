# Appium Java Framework

Sample framework for running tests on Android emulators and real Android devices.
All of the tests run in the Chrome browser and perform basic steps on the website.

## Requirements
1. Install the Android SDK.
2. Create an emulator.
3. Install Appium.
4. Install NodeJS.
5. Install browser drivers (e.g. chromedriver)

## Update testng.xml configuration
Update the resources/testng.xml file to match the names and platforms of your emulators/devices.
* parameter name="deviceName" value="_**Nexus_6_API_26**_"
* parameter name="platform" value="_**Android**_"


## Execution
1. Start Appium Server:
```
appium --chromedriver-executable <path to you local installation of chromedriver>
```
2. Execute the tests:
```
mvn test
```
3. To run on a physical device, execute the following to get a connected device name, and substitute it in point 2 above:
```
adb devices
```





