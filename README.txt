---------------------------
CRASHUB ROLLER PLUGIN


- Checkout the trunk with "git clone https://github.com/crashub/roller.git"
- mvn package
- mvn install

So you have in your local .m2 repo, the plugin jar

---------------------------
ROLLER SOURCE CODE

- Start with http://rollerweblogger.org/project/
- Source code is here : https://cwiki.apache.org/confluence/display/ROLLER/Roller+Source+Code
- Checkout the trunk with "svn co http://svn.apache.org/repos/asf/roller/trunk roller"
- Follow the tutorial to build roller source code : https://cwiki.apache.org/confluence/display/ROLLER/How+to+build+Roller

- Add the following lines to the "app/pom.xml" not in the root pom.xml

<dependency>
    <groupId>org.crsh</groupId>
    <artifactId>crsh.shell.ssh</artifactId>
    <version>1.3.0-beta2</version>
</dependency>

<dependency>
    <groupId>org.crsh</groupId>
    <artifactId>crsh.shell.core</artifactId>
    <version>1.3.0-beta2</version>
</dependency>

<dependency>
    <groupId>rollercrash</groupId>
    <artifactId>rollercrash</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>

- Copy the dir "src/crash" in from the previous project "crashub/roller" to the roller's WEB-INF dir
  You will copy a list of groovy files and a java command.
  
- Modify WEB-INF/web.xml to add CRaSH listener

<listener> <listener-class>org.crsh.plugin.WebPluginLifeCycle</listener-class> </listener>
