set projectPath=C:\Users\baha\git\repository\TestNGExample
cd\
cd %projectPath%
set classpath=%projectPath%\bin;%projectPath%\lib\*;
java org.testng.TestNG testng.xml