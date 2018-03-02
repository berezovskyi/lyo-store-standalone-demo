Standalone Lyo Store operation
============================================

This repo shows you all the steps you need to take to run Lyo Store in a standalone application.

## Getting started

Build the project

    mvn clean package

Run the following:

    $ java -jar target/original-lyo-store-standalone-demo-0.0.1-SNAPSHOT.jar

You should get similar output:

      Creating in-memory Store instance
      Exception in thread "main" java.lang.NoClassDefFoundError: org/eclipse/lyo/store/StoreFactory
      	at me.berezovskyi.lyo.StoreDemo.main(StoreDemo.java:16)
      Caused by: java.lang.ClassNotFoundException: org.eclipse.lyo.store.StoreFactory
      	at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
      	at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
      	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:338)
      	at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
      	... 1 more

WHAT? Run this:

    $ java -jar target/lyo-store-standalone-demo-0.0.1-SNAPSHOT.jar

You should get the following output:

    Creating in-memory Store instance
    Created a Store instance! Removing all triples...
    In-memory triplestore was cleared

Much better! Now take a look at `pom.xml` to see what is happening underneath.
