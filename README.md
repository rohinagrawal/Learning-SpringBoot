# SpringBoot-Demo
First SpringBoot Project
Getting Ready for Backend Java Spring Boot


**Ubuntu Terminal commands to get and install adoptopenjdk-14**

1. `wget -qO - https://adoptopenjdk.jfrog.io/adoptopenjdk/api/gpg/key/public | sudo apt-key add -`
2. `sudo add-apt-repository --yes https://adoptopenjdk.jfrog.io/adoptopenjdk/deb/`
3. `sudo apt-get install adoptopenjdk-14-hotspot`


**Setting up Aspectj in Intellij Idea**

Download latest stable release from following link
https://www.eclipse.org/aspectj/downloads.php

Example to install aspectj-1.9.5.jar on ubuntu run following command on Terminal
`java -jar aspectj-1.9.5.jar`

Perform following steps to add Aspectj to your project

1. Open Intellij and press Ctrl+shift+alt+s to open Project Structure Setting.
2. Click Libraries -> + button -> java -> aspectj1.9/lib/aspectjrt.jar
3. Click Facets -> + button -> Select AspectJ

**Or**

If you are using intellij and have chosen the Maven/Gradle build initially.

You can add the dependency for aspectj in the pom.xml file in the project:

Copy the Maven/Gradle dependency code from here:
https://mvnrepository.com/artifact/org.aspectj


Paste the code in the <dependencies> section of `pom.xml` (Maven) / `build.gradle` (Gradle) file


Now, rebuild the application and aspectj will be loaded automatically.

