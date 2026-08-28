@echo off

:: Change directory to sorce code folder
cd src

:: Compile the Java file
javac Main/*.java View/*.java Assets/*.java Utilities/*.java Controller/*.java

:: Check if compilation was successful
if %errorlevel% neq 0 (
    echo Compilation failed.
    pause
    exit /b
)

:: Run the Java program
java Main/Main

pause
