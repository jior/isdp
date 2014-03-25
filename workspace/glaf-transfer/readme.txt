1、安装JDK
下载网站：
http://www.oracle.com/technetwork/java/javase/downloads/index.html
推荐下载jdk1.6的版本。
根据操作系统的版本，32位或64位，选择其中一个版本安装。
其中的32位Windows：jdk-6u45-windows-i586.exe，安装到C:\，推荐安装在C:\jdk1.6.0目录下。
其中的64位Windows：jdk-6u45-windows-x64.exe，安装到C:\，推荐安装在C:\jdk1.6.0目录下。

2、设置JAVA_HOME
  点击桌面上“我的电脑”或“计算机”右键，选择“属性”，点击“环境变量”，弹出对话框,新建一个环境变量JAVA_HOME：
JAVA_HOME=c:\jdk1.6.0

3、配置基础环境的数据源信息conf\jdbc.properties
    
jdbc.name=default
jdbc.type=sqlserver
jdbc.driver=com.microsoft.sqlserver.jdbc.SQLServerDriver
jdbc.url=jdbc:sqlserver://127.0.0.1:1433;databaseName=yz
jdbc.user=sa
jdbc.password=

4、运行run.bat
   配置完成运行run.bat即可。

