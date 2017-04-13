# Exbot : An extension of Java Robot API <br>
![](https://img.shields.io/badge/language-Java%208-red.svg)
![](https://img.shields.io/badge/Include%20Robot%20actions%20for-macOS-blue.svg)
![](https://img.shields.io/badge/Include%20Robot%20actions%20for-Windows-blue.svg)

#### This class give extra functionality to [Java Robot API](https://docs.oracle.com/javase/7/docs/api/java/awt/Robot.html).<br>It allow you to perform many robot actions, while writing less code.
```java
public class Exbot extends Robot
```
## Table of Contents
[Getting started](#getting-started)<br>
[Method Summary](#method-summary)<br>
[About OS Specific methods](#about-os-specific-methods)<br>
[Method Detail](#method-detail)<br>
[Encryption Methods](#encryption-methods)<br>
[Project Ideas](#project-ideas)

[Learn more about Robot API](https://docs.oracle.com/javase/7/docs/api/java/awt/Robot.html)

# Getting Started
Get start by creating a ` new ` Exbot instance with a

```java
Exbot bot = new Exbot();
```

:book: Remember that Java Robot class must handle `AWTException`.
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

# Method Summary
Exbot class include several action methods based on Java Robot. It allows you to quickly create robot workflow that interact with the operating system of a computer.

| Method and Description  | Modifier and Type | Operating system
| ------------- | ------------- | ---------------- |
| [Robot](#getting-started)()<br>_Constructs an **Exbot** object in the coordinate system of the primary screen._| - | All |
| [mouseClickAt](#mouseclickat)(int x, int y)<br>_Perform a click at the specified coordinates_  | void | All |
| [mouseDragAndDrop](#mousedraganddrop)(int srcX, int srcY, int destX, int destY)<br>_Drag and drop form a source coordinate to a destination coordinate_ | void  | All |
| [pressEnter](#pressenter)()<br>_Press the ENTER key_  | void | All |
| [typeText](#typetext)(String text)<br>_Write text as direct keyboard input (A-Z letters, space, numbers or dot only)_  | void | All |
| [macWriteText](#macwritetext)(String text)<br>_Paste a specified string from the clipboard (on mac)_  | void | [macOS](#about-os-specific-methods) |
| [windowsWriteText](#windowswritetext)(String text)<br>_Paste a specified string from the clipboard (on Windows)_  | void | [Windows](#about-os-specific-methods) |
| [macCmdShortcut](#maccmdshortcut)(int keycode)<br>_Perform a keyboard shortcut with the cmd key and a specified key_  | void | [macOS](#about-os-specific-methods) |
| [windowsCtrlShortcut](#windowsctrlshortcut)(int keycode)<br>_Perform a keyboard shortcut with the ctrl key and a specified key_  | void | [Windows](#about-os-specific-methods) |
| [macShowSpotlight](#macshowspotlight)(String text)<br>_Do a "cmd + space" to show the Spotlight search box on mac_  | void | [macOS](#about-os-specific-methods) |
| [windowsShowStart](#windowsshowstart)(String text)<br>_Press on the "windows" key to show the start menu on Windows_  | void | [Windows](#about-os-specific-methods) |
| [encode](#encode)(String textToEncode)<br>_Encode a string using BASE64_  | static&nbsp;String | All |
| [decode](#decode)(String textToDecode)<br>_Decode a BASE64 string_  | static&nbsp;String | All |

##### About OS Specific Methods
Several actions have macOS and Windows equivalent methods because they are relied on keyboard shortcuts that differ depending of the operating system.

Concerned methods are those starting whit *mac* or *windows*, for instance : `macWriteText()` or `windowsWriteText()`. Other methods can be use with all operating system.

# Method detail
## MouseClickAt
```java
public void mouseClickAt(int x, int y)
```
*Perform a click at the specified coordinates with the mouse.*
### Parameters:
*Coordinates (x, y) where to click :*<br>
**x** - X position<br>
**y** - Y position
***
## mouseDragAndDrop
```java
public void mouseDragAndDrop(int srcX, int srcY, int destX, int destY)
```
*Perform a drag and drop movement from a source coordinate to a destination coordinate with the mouse.*
### Parameters:
**srcX** - X source position<br>
**srcY** - Y source position<br>
**destX** - X destination position<br>
**destY** - Y destination position

:robot: *Explanation : The robot will press the mouse right-button at source coordinates, move the cursor to destination index and release the button*
***
## pressEnter
```java
public void pressEnter()
```
*Perform a keyPress/keyRelease on the ENTER key.*
***
## typeText
```java
public void typeText(String text)
```
*Write text as direct keyboard input.*
### Parameters:
**text** - Text to write
*(Work with A-Z letters, space, numbers and dot)*
***
## <a id="macwritetext"></a>macWriteText &nbsp; ![](https://img.shields.io/badge/Specific_for-macOS-blue.svg)
```java
public void macWriteText(String text)
```
*Paste a specified string from the clipboard. (Perform a cmd + v of the string).*<br>
### Parameters:
**text** - Text to write (to paste)
***
## <a id="maccmdshortcut"></a>macCmdShortcut &nbsp; ![](https://img.shields.io/badge/Specific_for-macOS-blue.svg)
```java
public void macCmdShortcut(int keycode)
```
*Perform a keyboard shortcut with the cmd key and a specified key.*
### Parameters:
**keycode** - Key to press<br>

:book: *We recommend you to* `import java.awt.event.KeyEvent`, *to enumerate the possible keycodes (e.g. KeyEvent.VK_A)*
***
## <a id="macshowspotlight"></a>macShowSpotlight &nbsp; ![](https://img.shields.io/badge/Specific_for-macOS-blue.svg)
```java
public void macShowSpotlight()
```
*Do a "cmd + space" to show the Spotlight search box on macOS.*
***
## <a id="windowswritetext"></a>windowsWriteText &nbsp; ![](https://img.shields.io/badge/Specific_for-Windows-blue.svg)
```java
public void windowsShowStart()
```
*Paste a specified string from the clipboard. (Perform a ctrl + v of the string).*<br>
### Parameters:
**text** - Text to write (to paste)
***
## <a id="windowsctrlshortcut"></a>windowsCtrlShortcut &nbsp; ![](https://img.shields.io/badge/Specific_for-Windows-blue.svg)
```java
public void windowsCtrlShortcut(int keycode)
```
*Perform a keyboard shortcut with the ctrl key and a specified key.*
### Parameters:
**keycode** - Key to press<br>

:book: *We recommend you to* `import java.awt.event.KeyEvent`, *to enumerate the possible keycodes (e.g. KeyEvent.VK_A)*
***
## <a id="windowsshowstart"></a>windowsShowStart &nbsp; ![](https://img.shields.io/badge/Specific_for-Windows-blue.svg)
```java
windowsShowStart(String text)
```
*Perform a keyPress/keyRelease on the Windows key to show the start menu.*
***

# Encryption Methods
## encode
```java
public static String encode(String textToEncode)
```
*Encode a string using BASE64.*
### Parameters:
**textToEncode** - string to encode<br>
### Return:
The BASE64 encoded string.
***

## decode
```java
public static String decode(String textToEncode)
```
*Decode a BASE64 string.*
### Parameters:
**textToDecode** - string to decode
### Return:
The decoded string.
***
##### New methods coming soon...

# Project Ideas
Visit [this page](https://github.com/obrassard/Exbot/wiki) to find examples of projects and workflows created with **Exbot**

