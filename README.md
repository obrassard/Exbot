# Exbot : An extension of Java Robot API <br>
[![Hex.pm](https://img.shields.io/badge/language-Java%208-red.svg)]()
[![Hex.pm](https://img.shields.io/badge/Include%20Robot%20actions%20for-macOS-lightgrey.svg)]()
[![Hex.pm](https://img.shields.io/badge/Include%20Robot%20actions%20for-Windows-blue.svg)]()


#### This class give extra functionality to [Java Robot API](https://docs.oracle.com/javase/7/docs/api/java/awt/Robot.html).<br>It allow you to perform many Robot actions, while writing less code.


## Table of Contents
[Getting started](#getting-started)<br>
[Method Summary](#method-summary)<br>
[OS Specific methods](#)<br>
[Method Detail](#method-detail)<br>
[Static Encryption Methods](#)

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
Exbot class include several method based on Robot API.

| Method and Description  | Modifier and Type | Operating system
| ------------- | ------------- | ---------------- |
| [mouseClickAt](#)(int x, int y)<br>_Perform a click at the specified coordinates_  | void | All |
| [mouseDragAndDrop](#)(int srcX, int srcY, int destX, int destY)<br>_Drag and drop form a source coordinate to a destination coordinate_ | void  | All |
| [pressEnter](#)()<br>_ Press the ENTER key _  | void | All |
| [typeText](#)(String text)<br>_Write text as direct keyboard input (A-Z letter, space, numbers or dot only) _  | void | All |
| [macWriteText](#)(String text)<br>_ Paste a specified string from the clipboard (on mac) _  | void | macOS |
| [windowsWriteText](#)(String text)<br>_ Paste a specified string from the clipboard (on Windows) _  | void | Windows |
| [macCmdShortcut](#)(int keycode)<br>_ Perform a keyboard shortcut with the cmd key and a specified key _  | void | macOS |


## Method Detail

## Other details are coming very soon...
