# Getting Started

### Download Exbot:<br>
You can either [download](https://github.com/obrassard/Exbot/releases) the `.jar` library or the source code from [this repo](/www.github.com/obrassard/exbot).

Note that you'll need to `import` the library `com.obrassard.Exbot` if you chose to download the JAR file.

### Create an Exbot object:<br>
Get started by creating a ` new ` Exbot instance with a

```java
Exbot bot = new Exbot();
```

Notice that Java Robot class must handle `AWTException`.
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



