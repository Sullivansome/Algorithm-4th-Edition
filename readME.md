# Maven setup

```
brew install maven
```

1. Download the algs4.jar:
Obtain the algs4.jar from the official source or your preferred location.
Install algs4.jar to your local Maven repository:
Use the Maven install:install-file goal to add the jar to your local repository:
```

mvn install:install-file -Dfile=path/to/algs4.jar -DgroupId=edu.princeton.cs -DartifactId=algs4 -Dversion=1.0.0 -Dpackaging=jar

```

Replace path/to/algs4.jar with the actual path to your algs4.jar file.

2. Update your pom.xml:
Add the following dependency to your pom.xml:
```

<dependencies>
  <!-- Other dependencies -->
  <dependency>
    <groupId>edu.princeton.cs</groupId>
    <artifactId>algs4</artifactId>
    <version>1.0.0</version>
  </dependency>
</dependencies>
```

3. Configure Maven Compiler Plugin for JDK 21:
   In your pom.xml, set the Java version for the Maven Compiler plugin to JDK 21:

```
<build>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-compiler-plugin</artifactId>
      <version>3.8.1</version> <!-- Use the appropriate version -->
      <configuration>
        <release>21</release> <!-- Set the release to match your JDK version -->
      </configuration>
    </plugin>
  </plugins>
</build>
```

Ensure that you are using a version of the Maven Compiler plugin that supports the release flag for JDK 9 and above.

4. Build your project:
   Now you can compile your project with Maven:

```
mvn clean compile
```

This will compile your code using JDK 21 and include the algs4.jar in the classpath.

5. Run your project:
   To run your project, you can use the exec:java goal, specifying the main class and any arguments:

```
mvn exec:java -Dexec.mainClass="your.main.Class" -Dexec.args="arg1 arg2 arg3"
```

Replace your.main.Class with your actual main class and arg1 arg2 arg3 with the actual arguments you want to pass.

6. Create tasks.json in vscode
Open the Command Palette (via the View menu or by right-clicking) and type in and select Tasks: 
Configure task then select Create `tasks.json` from template.