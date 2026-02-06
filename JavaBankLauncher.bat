@echo off
cd /d "%~dp0\target\image\bin"
start "" javaw -m com.mycompany.javabank/com.mycompany.javabank.App
exit