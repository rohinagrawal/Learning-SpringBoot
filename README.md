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


### Learning Material:-
1. [Getting Started Spring.io](https://spring.io/guides/gs/spring-boot/)   
2. [AOP Spring.io](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#aop)  
   [AOP Journal.dev](https://www.journaldev.com/2583/spring-aop-example-tutorial-aspect-advice-pointcut-joinpoint-annotations)  
3. [CORS Mozilla.org](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)  
   [CORS Tutorialspoint.com](https://www.tutorialspoint.com/spring_boot/spring_boot_cors_support.htm)  
4. [Testing Spring.io](https://spring.io/guides/gs/testing-web/)  
   [Testing Spring.io Doc](https://docs.spring.io/spring-boot/docs/1.5.2.RELEASE/reference/html/boot-features-testing.html#:~:text=41.3%20Testing%20Spring%20Boot%20applications&text=Spring%20Boot%20provides%20a%20%40SpringBootTest,in%20your%20tests%20via%20SpringApplication%20)  
   [Testing Baeldung.com](https://www.baeldung.com/spring-boot-testing)  
5. [ORM Spring.io](https://docs.spring.io/autorepo/docs/spring-framework/4.2.7.RELEASE/spring-framework-reference/html/orm.html)  

### Videos:- 
1. `https://www.youtube.com/watch?v=Ch163VfHtvA&list=PLsyeobzWxl7oA8QOlMtQsRT_I7Rx2hoX4`  
