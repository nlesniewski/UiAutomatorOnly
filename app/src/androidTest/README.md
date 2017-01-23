# How to run standalone UI Automator tests?

## Instruction

1. Build project with gradle
1. Push application to device:
    - adb push app-debug-androidTest.apk /data/app
1. (TODO Optional?) Install test apk file:
    - adb install -r app-debug-androidTest.apk
1. List all instrumentation:
    - adb shell pm list instrumentation
1. Run instrumentation test with command:
    - adb shell am instrument -w --no-window-animation it.lesniewski.uiautomatoronly.test/android.support.test.runner.AndroidJUnitRunner