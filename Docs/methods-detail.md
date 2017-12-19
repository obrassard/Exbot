# Methods Details
## mouseClickAt
```java
public void mouseClickAt(int x, int y)
```
*Perform a left click at the specified coordinates with the mouse.*
### Parameters:
*Coordinates (x, y) where to click :*<br>
**x** - X position<br>
**y** - Y position<br>

[*Find out how to get the coordinates of a specific point on a screen*](/get-screen-coordinate.md)
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

[*Find out how to get the coordinates of a specific point on a screen*](/get-screen-coordinate.md)

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

[*Find out how to get the coordinates of a specific point on a screen*](/get-screen-coordinate.md)

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

[*Find out how to get the coordinates of a specific point on a screen*](/get-screen-coordinate.md)


 **Details** : The robot will press the mouse right-button at source coordinates, move the cursor to destination index and release the button*
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

*We recommend you to* `import java.awt.event.KeyEvent`, *to enumerate the possible keycodes (e.g. KeyEvent.VK_A)*
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
```java
public void messageSender(int x, int y, String text, int frequency)
```
*Write text in a text box and "send" it several times (by pressing enter).*<br>
### Parameters:
**x** - X Position of the text box<br>
**y** - Y Position of the text box<br>
**text** - Text to send<br>
**frequency** - Number of repetitions


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

[*Find out how to get the coordinates of a specific point on a screen*](/get-screen-coordinate.md)


