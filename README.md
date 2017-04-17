# Exbot : An extension of Java Robot API <br>
![requirement](https://img.shields.io/badge/Require-Java%207%20or%20later-red.svg)
![version](https://img.shields.io/badge/Version-1.0.1-brightgreen.svg)
![Tested on macos and Windows](https://img.shields.io/badge/Tested%20on-macOS%20&%20Windows-blue.svg)



#### This class give extra functionality to [Java Robot API](https://docs.oracle.com/javase/7/docs/api/java/awt/Robot.html).<br>It allows you to perform many robot actions, while writing less code. &nbsp;:robot:
```java
public class Exbot extends Robot
```
## Table of Contents
[Getting Started](#getting-started)<br>
[Method Summary](#method-summary)<br>
[Method Detail](#method-detail)<br>
[Encryption Methods](#encryption-methods)<br>
[About OS exclusive methods](#about-os-exclusive-methods)<br>
[Project Ideas](#project-ideas)<br>

[Find screen coordinates](#help-coordinate)<br>
[Learn more about Robot API](https://docs.oracle.com/javase/7/docs/api/java/awt/Robot.html)

# Getting Started

### Download Exbot:<br>
You can either [download](https://github.com/obrassard/Exbot/releases) the `.jar` library or the source code from this repo.<br>
:bulb: Note that you'll need to `import` the library `com.obrassard.Exbot` if you chose to download the JAR file.

### Create an Exbot object:<br>
Get started by creating a ` new ` Exbot instance with a

```java
Exbot bot = new Exbot();
```

:book: Remember that Java Robot class must handle `AWTException`.
For that, you need to `try/catch` or `throw` the exception:
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
Exbot class include several action methods based on Java Robot. It allows you to quickly create robot workflow that interacts with the operating system of a computer.

| Method and Description  | Modifier and Type | Operating system
| ------------- | ------------- | ---------------- |
| [Exbot](#getting-started)()<br>_Constructs an **Exbot** object in the coordinate system of the primary screen._| - | All |
| [mouseClickAt](#mouseclickat)(int x, int y)<br>_Perform a click at the specified coordinates_  | void | All |
| [mouseRightClickAt](#mouserightclickat)(int x, int y)<br>_Perform a right click at the specified coordinates_  | void | All |
| [mouseDoubleClick](#mousedoubleclick)(int x, int y)<br>_Perform a double click at the specified coordinates_  | void | All |
| [mouseDragAndDrop](#mousedraganddrop)(int srcX, int srcY, int destX, int destY)<br>_Drag and drop form a source coordinate to a destination coordinate_ | void  | All |
| [pressEnter](#pressenter)()<br>_Press the ENTER key_  | void | All |
| [typeText](#typetext)(String text)<br>_Write text as direct keyboard input (A-Z letters, space, numbers or dot only)_  | void | All |
| [writeText](#writetext)(String text)<br>_Write text with the bot by pasting a given string from the clipboard_  | void | All |
| [closeCurrentWindows](#closecurrentwindows)()<br>_Close the current windows_ | void | All |
| [closeCurrentWindows](#closecurrentwindows)(boolean quit)<br>_Close the current windows or quit the current app (on macOS)_ | void | All |
| [shortcut](#shortcut)(int keycode)<br>_with the cmd or ctrl key (depending of the os) and another specified key_  | void | All |
| [macShowSpotlight](#macshowspotlight)(String text)<br>_Do a "cmd + space" to show the Spotlight search box on mac_  | void | [macOS](#about-os-exclusive-methods) |
| [windowsShowStart](#windowsshowstart)(String text)<br>_Press on the "windows" key to show the start menu on Windows_  | void | [Windows](#about-os-exclusive-methods) |
| [messageSender](#messagesender)(int x, int y, String text)<br>*Write string in a text box and "send" it one times (by pressing enter)* | void | All |
| [messageSender](#messagesender)(int x, int y, String text, int frequency)<br>*Write string in a text box and "send" it several times (by pressing enter)* | void | All |
| [messageSender](#messagesender)(int x, int y, String text, int frequency, int interval)<br>*Write string in a text box and "send" it several times (by pressing enter), at a given interval.* | void | All |
| [encode](#encode)(String textToEncode)<br>_Encode a string using BASE64_  | static&nbsp;String | All |
| [decode](#decode)(String textToDecode)<br>_Decode a BASE64 string_  | static&nbsp;String | All |

#### About OS exclusive methods
:warning: Methods starting with *mac* or *windows*, for instance `macShowSpotlight()`, are exclusive to their operating system. You should only use them on the appropriate OS. Of course, other methods can be use on all systems.

# Method detail
## mouseClickAt
```java
public void mouseClickAt(int x, int y)
```
*Perform a left click at the specified coordinates with the mouse.*
### Parameters:
*Coordinates (x, y) where to click :*<br>
**x** - X position<br>
**y** - Y position<br>

:bulb: [*Find out how to get the coordinates of a specific point on a screen*](#help-coordinate)
***
## mouseRightClickAt
```java
public void mouseRightClickAt(int x, int y)
```
*Perform a right click at the specified coordinates with the mouse.*
### Parameters:
*Coordinates (x, y) where to click :*<br>
**x** - X position<br>
**y** - Y position<br>

:bulb: [*Find out how to get the coordinates of a specific point on a screen*](#help-coordinate)
***
## mouseDoubleClick
```java
public void mouseDoubleClick(int x, int y)
```
*Perform a double click at the specified coordinates with the mouse.*
### Parameters:
*Coordinates (x, y):*<br>
**x** - X position<br>
**y** - Y position<br>

:bulb: [*Find out how to get the coordinates of a specific point on a screen*](#help-coordinate)
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

:bulb: [*Find out how to get the coordinates of a specific point on a screen*](#help-coordinate)

:robot: ***Details** : The robot will press the mouse right-button at source coordinates, move the cursor to destination index and release the button*
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
## <a id="writetext"></a>writeText
```java
public void writeText(String text)
```
*Write text with the bot by pasting a given string from the clipboard.*<br>
### Parameters:
**text** - Text to write (to paste)
***
## <a id="closecurrentwindows"></a>closeCurrentWindows
```java
public void closeCurrentWindows()
```
*Close the current windows*<br>
*(Equivalent of `closeCurrentWindows(false)`)*
<br>
<br>
```java
public void closeCurrentWindows(boolean quit)
```
*Close the current windows or quit an app*<br>
### Parameters:
**quit** - `true` completely quit the current app (on macOS only)

***
## <a id="shortcut"></a>shortcut
```java
public void shortcut(int keycode)
```
*Perform a keyboard shortcut with the cmd or ctrl key (depending of the os) and another specified key*
### Parameters:
**keycode** - Second key to press<br>

:bulb: *We recommend you to* `import java.awt.event.KeyEvent`, *to enumerate the possible keycodes (e.g. KeyEvent.VK_A)*
***
## <a id="macshowspotlight"></a>macShowSpotlight &nbsp; ![](https://img.shields.io/badge/Exclusive_to-macOS-blue.svg)
```java
public void macShowSpotlight()
```
*Do a "cmd + space" to show the Spotlight search box on macOS.*
***

## <a id="windowsshowstart"></a>windowsShowStart &nbsp; ![](https://img.shields.io/badge/Exclusive_to-Windows-blue.svg)
```java
public void windowsShowStart(String text)
```
*Perform a keyPress/keyRelease on the Windows key to show the start menu.*
***
## <a id="messagesender"></a>messageSender
```java
public void messageSender(int x, int y, String text)
```
*Write text in a text box and "send" it one time (by pressing enter).*<br>
### Parameters:
**x** - X Position of the text box<br>
**y** - Y Position of the text box<br>
**text** - Text to send
<br>
<br>
```java
public void messageSender(int x, int y, String text, int frequency)
```
*Write text in a text box and "send" it several times (by pressing enter).*<br>
### Parameters:
**x** - X Position of the text box<br>
**y** - Y Position of the text box<br>
**text** - Text to send<br>
**frequency** - Number of repetitions
<br>
<br>
```java
public void messageSender(int x, int y, String text, int frequency, int interval)
```
*Write string in a text box and "send" it several times (by pressing enter), at a given interval.*<br>
### Parameters:
**x** - X Position of the text box<br>
**y** - Y Position of the text box<br>
**text** - Text to send<br>
**frequency** - Number of repetitions<br>
**interval** - Delay between each sending (in ms)<br>

:bulb: [*Find out how to get the coordinates of a specific point on a screen*](#help-coordinate)

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

## :bulb: How to get specific (x,y) coordinates on a screen<a id="help-coordinate">

In **macOS**, the function is built-in. You only have to do `cmd + shift + 4` and press `escape` when you're done.<br>
In **Windows**, I found a free and lightweight application called [mousepos](http://www.adminsehow.com/wp-content/uploads/2012/03/MousePos.exe) that will do exactly that. *(source: [Admins eHow](http://www.adminsehow.com/2012/03/realtime-mouse-position-monitor-tool/)*

***
# Project Ideas
Visit [this page](https://github.com/obrassard/Exbot/wiki) to find examples of projects and workflows created with **Exbot**

```
                                                  _____
                                                 |     |
                                                 | | | |
                                                 |_____|
                                           ____ ___|_|___ ____
                                          ()___)         ()___)
                                          // /|           |\ \\
                                         // / |           | \ \\
                                        (___) |___________| (___)
                                        (___)   (_______)   (___)
                                        (___)     (___)     (___)
                                        (___)      |_|      (___)
                                        (___)  ___/___\___   | |
                                         | |  |           |  | |
                                         | |  |___________| /___\
                                        /___\  |||     ||| //   \\
                                       //   \\ |||     ||| \\   //
                                       \\   // |||     |||  \\ //
                                        \\ // ()__)   (__()
                                              ///       \\\
                                             ///         \\\
                                           _///___     ___\\\_
                                          |_______|   |_______|

                                           ___      __   __  ___
                                          |__  \_/ |__) /  \  |  
                                          |___ / \ |__) \__/  |  

                        
