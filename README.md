# Exbot : An extension of Java Robot API <br>
[![Hex.pm](https://img.shields.io/badge/language-Java%208-red.svg)]()

#### This class give extra functionality to Java Robot API and allow you to perform many Robot actions, while writing less code.<br>


## Table of Contents
[Getting started](#getting-started)<br>
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
## Other details are coming very soon...
