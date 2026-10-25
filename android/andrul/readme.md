# Android App Devlopment 

1. Native Android — Java or Kotlin
2. Flutter
3. React Native
4. Ionic + Capacitor
5. Progressive Web App (PWA)
6. No-code or visual app builders
7. Java + XML

## Requirments Installed
```
C:\Coding\java> java --version
java 25.0.4.1 2026-08-18 LTS
Java(TM) SE Runtime Environment (build 25.0.4.1+1-LTS-5)
Java HotSpot(TM) 64-Bit Server VM (build 25.0.4.1+1-LTS-5, mixed mode, sharing)
PS C:\Coding\java> & "$env:USERPROFILE\.gradle\wrapper\dists\gradle-9.1.0-all\7wzd0jkjit61aq2p43wpjgij9\gradle-9.1.0\bin\gradle.bat" --version

------------------------------------------------------------
Gradle 9.1.0
------------------------------------------------------------

Build time:    2025-09-18 13:05:56 UTC
Revision:      e45a8dbf2470c2e2474ccc25be9f49331406a07e

Kotlin:        2.2.0
Groovy:        4.0.28
Ant:           Apache Ant(TM) version 1.10.15 compiled on August 25 2024
Launcher JVM:  25.0.4.1 (Oracle Corporation 25.0.4.1+1-LTS-5)
Daemon JVM:    C:\Program Files\Java\jdk-25.0.4.1 (no JDK specified, using current Java home)
OS:            Windows 11 10.0 amd64

PS C:\Coding\java> Get-ChildItem "$env:LOCALAPPDATA\Android\Sdk\cmdline-tools"


    Directory: C:\Users\VICTUS\AppData\Local\Android\Sdk\cmdline-tools


Mode                 LastWriteTime         Length Name                                                          
----                 -------------         ------ ----                                                          
d-----          6/7/2026   2:55 PM                latest                                                        


PS C:\Coding\java> & "$env:LOCALAPPDATA\Android\Sdk\cmdline-tools\latest\bin\sdkmanager.bat" --version
20.0

PS C:\Coding\java> & "$env:LOCALAPPDATA\Android\Sdk\cmdline-tools\latest\bin\sdkmanager.bat" --list_installed
Installed packages:                     ] 25% Loading local repository...       
  Path                                                  | Version       | Description                                    | Location                                             
  -------                                               | -------       | -------                                        | -------                                              
  build-tools;31.0.0                                    | 31.0.0        | Android SDK Build-Tools 31                     | build-tools\31.0.0                                   
  build-tools;35.0.1                                    | 35.0.1        | Android SDK Build-Tools 35.0.1                 | build-tools\35.0.1                                   
  build-tools;36.0.0                                    | 36.0.0        | Android SDK Build-Tools 36                     | build-tools\36.0.0                                   
  cmake;3.22.1                                          | 3.22.1        | CMake 3.22.1                                   | cmake\3.22.1                                         
  emulator                                              | 35.3.12       | Android Emulator                               | emulator                                             
  extras;google;Android_Emulator_Hypervisor_Driver      | 2.2.0         | Android Emulator hypervisor driver (installer) | extras\google\Android_Emulator_Hypervisor_Driver     
  ndk;28.2.13676358                                     | 28.2.13676358 | NDK (Side by side) 28.2.13676358               | ndk\28.2.13676358                                    
  platform-tools                                        | 35.0.2        | Android SDK Platform-Tools                     | platform-tools                                       
  platforms;android-35                                  | 2             | Android SDK Platform 35                        | platforms\android-35                                 
  platforms;android-36                                  | 2             | Android SDK Platform 36                        | platforms\android-36                                 
  sources;android-35                                    | 1             | Sources for Android 35                         | sources\android-35                                   
  system-images;android-35;default;x86_64               | 2             | Intel x86_64 Atom System Image                 | system-images\android-35\default\x86_64              
  system-images;android-35;google_apis;x86_64           | 9             | Google APIs Intel x86_64 Atom System Image     | system-images\android-35\google_apis\x86_64          
  system-images;android-35;google_apis_playstore;x86_64 | 9             | Google Play Intel x86_64 Atom System Image     | system-images\android-35\google_apis_playstore\x86_64
```

## Technology Stack

### 1. Java — App logic
Handles button clicks, screen behavior, and interactions in MainActivity.java.

### 2. XML — User interface
Defines the layout, text, buttons, feed cards, and bottom navigation in activity_main.xml.

### 3. Android SDK — Android platform
Provides the Android libraries and tools needed to compile the app.

### 4. Gradle — Build system
Uses build.gradle and gradlew.bat to compile your code and generate the APK.

### 5. ADB — Install and debug
Installs the APK on your phone, launches the app, and displays logs.

## Your development workflow

```
VS Code

Write Java and XML

Gradle + Android SDK

Compile and package the app

app-debug.apk

Your installable Android application

Your Android phone

Install and run Andrul
```

