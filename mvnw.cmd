@echo off
SETLOCAL
SET DIRNAME=%~dp0%
IF "%DIRNAME%" == "" SET DIRNAME=.
SET APP_BASE_NAME=%~n0%
SET APP_HOME=%DIRNAME%..
@REM Execute a user defined script before this one
IF EXIST "%APP_HOME%\mvnw.cmd.pre" CALL "%APP_HOME%\mvnw.cmd.pre"
@REM Find java.exe
IF DEFINED JAVA_HOME SET JAVA_EXE=%JAVA_HOME%/bin/java.exe
IF NOT DEFINED JAVA_EXE SET JAVA_EXE=java.exe
@REM Invoke mvn script
"%JAVA_EXE%" %MAVEN_OPTS% -classpath "%MAVEN_PROJECTBASEDIR%/.mvn/wrapper/maven-wrapper.jar" org.apache.maven.wrapper.MavenWrapperMain %MAVEN_CONFIG% %*
@REM Execute a user defined script after this one
IF EXIST "%APP_HOME%\mvnw.cmd.post" CALL "%APP_HOME%\mvnw.cmd.post"