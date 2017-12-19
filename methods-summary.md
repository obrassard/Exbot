# Methods Summary
Exbot class include several action methods based on Java Robot. It allows you to quickly create robot workflow that interacts with the operating system of a computer.

| Method and Description | Modifier and Type | Operating system
| ------------- | ------------- | ---------------- |
| [Exbot](/getting-started.md/#getting-started)()<br>_Constructs an **Exbot** object in the coordinate system of the primary screen._| - | All |
| [mouseClickAt](/methods-detail.md/#mouseclickat)(int x, int y)<br>_Perform a click at the specified coordinates_ | void | All |
| [mouseRightClickAt](/methods-detail.md/#mouserightclickat)(int x, int y)<br>_Perform a right click at the specified coordinates_ | void | All |
| [mouseDoubleClick](/methods-detail.md/#mousedoubleclick)(int x, int y)<br>_Perform a double click at the specified coordinates_ | void | All |
| [mouseDragAndDrop](/methods-detail.md/#mousedraganddrop)(int srcX, int srcY, int destX, int destY)<br>_Drag and drop form a source coordinate to a destination coordinate_ | void | All |
| [pressEnter](/methods-detail.md/#pressenter)()<br>_Press the ENTER key_ | void | All |
| [typeText](/methods-detail.md/#typetext)(String text)<br>_Write text as direct keyboard input (A-Z letters, space, numbers or dot only)_ | void | All |
| [writeText](/methods-detail.md/#writetext)(String text)<br>_Write text with the bot by pasting a given string from the clipboard_ | void | All |
| [closeCurrentWindows](/methods-detail.md/#closecurrentwindows)()<br>_Close the current windows_ | void | All |
| [closeCurrentWindows](/methods-detail.md/#closecurrentwindows)(boolean quit)<br>_Close the current windows or quit the current app (on macOS)_ | void | All |
| [shortcut](/methods-detail.md/#shortcut)(int keycode)<br>_with the cmd or ctrl key (depending of the os) and another specified key_ | void | All |
| [macShowSpotlight](/methods-detail.md/#macshowspotlight)(String text)<br>_Do a "cmd + space" to show the Spotlight search box on mac_ | void | [macOS](#about-os-exclusive-methods) |
| [windowsShowStart](/methods-detail.md/#windowsshowstart)(String text)<br>_Press on the "windows" key to show the start menu on Windows_ | void | [Windows](#about-os-exclusive-methods) |
| [messageSender](/methods-detail.md/#messagesender)(int x, int y, String text)<br>*Write string in a text box and "send" it one times (by pressing enter)* | void | All |
| [messageSender](/methods-detail.md/#messagesender)(int x, int y, String text, int frequency)<br>*Write string in a text box and "send" it several times (by pressing enter)* | void | All |
| [messageSender](/methods-detail.md/#messagesender)(int x, int y, String text, int frequency, int interval)<br>*Write string in a text box and "send" it several times (by pressing enter), at a given interval.* | void | All |
| [encode](/encryption-methods.md/#encode)(String textToEncode)<br>_Encode a string using BASE64_ | static&nbsp;String | All |
| [decode](/encryption-methods.md/#decode)(String textToDecode)<br>_Decode a BASE64 string_ | static&nbsp;String | All |

#### About OS exclusive methods
Methods starting with *mac* or *windows*, for instance `macShowSpotlight()`, are exclusive to their operating system. You should only use them on the appropriate OS. Of course, other methods can be use on all systems.

