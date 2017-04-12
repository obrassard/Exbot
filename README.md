# Exbot : An extension of Java Robot API <br>
![](https://img.shields.io/badge/language-Java%208-red.svg)
![](https://img.shields.io/badge/Include%20Robot%20actions%20for-macOS-lightgrey.svg)
![](https://img.shields.io/badge/Include%20Robot%20actions%20for-Windows-blue.svg)



#### This class give extra functionality to [Java Robot API](https://docs.oracle.com/javase/7/docs/api/java/awt/Robot.html).<br>It allow you to perform many robot actions, while writing less code.
```java
public class Exbot extends Robot{ }
```
## Table of Contents
[Getting started](#getting-started)<br>
[Method Summary](#method-summary)<br>
[About OS Specific methods](#)<br>
[Method Detail](#method-detail)<br>
[Encryption Methods](#)

[Learn more about Robot API](https://docs.oracle.com/javase/7/docs/api/java/awt/Robot.html)

## Getting Started
Get start by creating a ` new ` Exbot instance with a

```java
Exbot bot = new Exbot();
```

Remember that Java Robot class must handle `AWTException`.
For that, you need to `try/catch` exceptions or `throw` the exception:
```java
public static void main(String[] args) {

        try {
            Exbot bot = new Exbot();

        } catch (java.awt.AWTException e) {
            e.printStackTrace();
        }
    }
```

## Method Summary
Exbot class include several action methods based on Java Robot. It allows you to quickly create robot workflow that interact with the operating system of a computer.

| Method and Description  | Modifier and Type | Operating system
| ------------- | ------------- | ---------------- |
| [Robot](#getting-started)()<br>_Constructs an **Exbot** object in the coordinate system of the primary screen._| - | All |
| [mouseClickAt](#)(int x, int y)<br>_Perform a click at the specified coordinates_  | void | All |
| [mouseDragAndDrop](#)(int srcX, int srcY, int destX, int destY)<br>_Drag and drop form a source coordinate to a destination coordinate_ | void  | All |
| [pressEnter](#)()<br>_Press the ENTER key_  | void | All |
| [typeText](#)(String text)<br>_Write text as direct keyboard input (A-Z letter, space, numbers or dot only)_  | void | All |
| [macWriteText](#)(String text)<br>_Paste a specified string from the clipboard (on mac)_  | void | [macOS](#about-os-specific-methods) |
| [windowsWriteText](#)(String text)<br>_Paste a specified string from the clipboard (on Windows)_  | void | [Windows](#about-os-specific-methods) |
| [macCmdShortcut](#)(int keycode)<br>_Perform a keyboard shortcut with the cmd key and a specified key_  | void | [macOS](#about-os-specific-methods) |
| [windowsCtrlShortcut](#)(int keycode)<br>_Perform a keyboard shortcut with the ctrl key and a specified key_  | void | [Windows](#about-os-specific-methods) |
| [macShowSpotlight](#)(String text)<br>_Do a "cmd + space" to show the Spotlight search box on mac_  | void | [macOS](#about-os-specific-methods) |
| [windowsShowStart](#)(String text)<br>_Press on the "windows" key to show the start menu on Windows_  | void | [Windows](#about-os-specific-methods) |
| [encode](#)(String textToEncode)<br>_Encode a string using BASE64_  | static&nbsp;String | All |
| [decode](#)(Decode a BASE64 string)<br>_Decode a BASE64 string_  | static&nbsp;String | All |

##### About OS Specific Methods
Several actions have macOS and Windows equivalent methods because they are relied on keyboard shortcuts that differ depending of the operating system.

Concerned methods are those starting whit *mac* or *windows*, for instance : `macWriteText()` or `windowsWriteText()`. Other methods can be use with all operating system.


## Method Detail

## Other details are coming very soon...
