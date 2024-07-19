# What is Java?

## Standard Specification and Development
### Standard Specification
- Java has a standard specification.

### Developing Java Programs
- Many companies develop Java programs that perform according to the standard specification.
- Examples of companies include Oracle Open JDK (currently in use), Adoptium Eclipse Temurin, Amazon Corretto, etc.
- All of these Java programs operate quite similarly but not identically.
    For example, Amazon Corretto is optimised for AWS.
- These companies offer several versions that operate on Windows, macOS, Linux, etc.
- All Java programs are developed according to the standard specification, allowing for easy transition between different implementations.

## Compile and Run
### Sequence of Running a Java Program
1. A developer writes Java source code, such as `Hello.java`
2. A program called `javac` compiles the source code into a `.class` file.
    - During this process:
    The Java source code is converted into bytecode.
    The source code is optimised for faster execution.
    Any syntax errors are detected.
    Comments are removed.
3. The JAVA program is run using a program called `java` along with the JAVA Virtual Machine (JVM).

## IDE and JAVA
**IntelliJ**
When you click the `Run` button on a source code file in IntelliJ IDE:
- It compiles the `.java` file in the `src` folder and saves the `.class` file in the `out` folder.
    - Users don't have to manually execute the `javac Hello.java` command.
- It runs the compiled program.
    - Users don't have to manually execute the `java Hello` command.

## JAVA OS Compatibility
- No matter which OS you use to develop and compile your Java code, once it is compiled, you can run it anywhere on any OS.
- The Java program installed on the user's OS converts the `.class` file into a format that can run on their specific OS.

## JAVA Development and Operation Environment
- A developer can develop Java programs on any OS they prefer, such as macOS or Windows.
- Deploy the `.class` Java file to a server running on Linux.
    - If the server uses AWS, then install Amazon Corretto Java on that server.

## Conclusion
**Write Once, Run Anywhere**
