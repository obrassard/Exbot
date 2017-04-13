/* Created by Olivier Brassard, 2017. */

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.xml.bind.DatatypeConverter;

/**
 * ExtendedBot.
 * This class give extra functionality to Java Robot class
 */
public class Exbot extends Robot{

    /**
     * Create a new instance of Exbot inheriting form Robot api
     * @throws AWTException
     */
    public Exbot() throws AWTException{
        super();
    }

    /**
     * Do a "cmd + space" to show the Spotlight search box on macOS
     */
    public void macShowSpotlight(){
        this.keyPress(KeyEvent.VK_META);
        this.keyPress(KeyEvent.VK_SPACE);
        this.keyRelease(KeyEvent.VK_SPACE);
        this.keyRelease(KeyEvent.VK_META);
        this.delay(500);
    }

    /**
     * Key press on the "windows" button to show the start menu on Windows
     */
    public void windowsShowStart(){
        this.keyPress(KeyEvent.VK_WINDOWS);
        this.keyRelease(KeyEvent.VK_WINDOWS);
        this.delay(500);
    }

    /**
     * Single key press on the Enter button
     */
    public void pressEnter(){
        this.keyPress(KeyEvent.VK_ENTER);
        this.keyRelease(KeyEvent.VK_ENTER);
        this.delay(500);
    }

    /**
     * Write text with the bot on Windows
     * Compatible with all characters
     * @param text Text to write
     */
    public void windowsWriteText(String text){

        StringSelection selection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);

        this.keyPress(KeyEvent.VK_CONTROL);
        this.keyPress(KeyEvent.VK_V);
        this.keyRelease(KeyEvent.VK_V);
        this.keyRelease(KeyEvent.VK_CONTROL);
    }

    /**
     * Write text with the bot on macOS
     * Compatible with all characters
     * @param text Text to write
     */
    public void macWriteText(String text){

        StringSelection selection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);

        this.keyPress(KeyEvent.VK_META);
        this.keyPress(KeyEvent.VK_V);
        this.keyRelease(KeyEvent.VK_V);
        this.keyRelease(KeyEvent.VK_META);
    }

    /**
     * Type text as a keyboard input.
     * Not compatible with special characters
     * @param text Text to write (A-Z letters, space, numbers or dot)
     */
    public void typeText(String text) {

        String textToType = text.toUpperCase();

        for (int i = 0; i < textToType.length(); i++) {
            char character = textToType.charAt(i);
            this.keyPress(character);
            this.keyRelease(character);
            this.delay(15);
        }
    }


    /**
     * Move the mouse to specific coordinates of the screen and perform a click
     * @param x x coordinate
     * @param y y coordinate
     */
    public void mouseClickAt(int x, int y){
        this.mouseMove(x,y);
        this.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        this.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    /**
     * Perform a drag and drop from a source coordinate to a destination coordinate
     * @param srcX X source position (where to start the drag and drop)
     * @param srcY Y source position (where to start the drag and drop)
     * @param destX X destination position (where to end the drag and drop)
     * @param destY Y destination position (where to end the drag and drop)
     */
    public void mouseDragAndDrop(int srcX, int srcY, int destX, int destY){
        this.mouseMove(srcX,srcY);
        this.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        this.mouseMove(destX,destY);
        this.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    /**
     * Perform a keyboard shortcut with the cmd key and a specified key
     * @param keycode Shortcut key (bot will do "cmd + key")
     */
    public void macCmdShortcut(int keycode){
        this.keyPress(KeyEvent.VK_META);
        this.keyPress(keycode);
        this.keyRelease(keycode);
        this.keyRelease(KeyEvent.VK_META);
        this.delay(500);
    }

    /**
     * Perform a keyboard shortcut with the ctrl key and a specified key
     * @param keycode Shortcut key (bot will do "ctrl + key")
     */
    public void windowsCtrlShortcut(int keycode){
        this.keyPress(KeyEvent.VK_CONTROL);
        this.keyPress(keycode);
        this.keyRelease(keycode);
        this.keyRelease(KeyEvent.VK_CONTROL);
        this.delay(500);
    }


    //--- Encryption static methods ------------------
    /**
     * Encode a string using BASE64
     * @param textToEncode string to incode
     * @return an encoded string
     */
    public static String encode(String textToEncode)
    {

        String encoded = DatatypeConverter.printBase64Binary(textToEncode.getBytes());
        return encoded;
    }


    /**
     * Decode a BASE64 string
     * @param textToDecode BASE64 string to decode
     * @return The decoded string
     */
    public static String decode(String textToDecode)
    {
        String decoded = new String(DatatypeConverter.parseBase64Binary(textToDecode));
        return decoded;
    }
}