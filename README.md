# neon-test-suite

To install
---------
* Eclipse
* Groovy plugin of Eclipse

To run
---------

```
* all tests: mvn test
* specific test: mvn -Dtest=NE8Spec test

```

### Tools
1. JDK v1.8u60: rpm: https://db.tt/07sgy6Qd (jdk-8u60-linux-x64.rpm) / tarball: https://db.tt/DeR6CGg1 (jdk-8u60-linux-x64.tar.gz) / dmg: https://db.tt/Df8tyGur (jdk-8u60-macosx-x64.dmg)
2. Eclipse Mars: https://db.tt/NlJPaXJK (eclipse-jee-mars-R-linux-gtk-x86_64.tar.gz) / https://db.tt/1k96ySdK (eclipse-jee-mars-R-macosx-cocoa-x86_64.tar.gz)
3. Maven v3.3.3: https://db.tt/QtcmQQ7v (apache-maven-3.3.3-bin.tar.gz)

### Change Oracle JDK as default (for Fedora users)
```
alternatives --install /usr/bin/java java /usr/java/latest/jre/bin/java 200000
alternatives --config java
```
### Eclipse plugins
1. Groovy-Eclipse: http://dist.springsource.org/snapshot/GRECLIPSE/e4.5/ or search it from Eclipse marketplace
2. Theme: http://eclipse-color-theme.github.io/update/

### Centralised repository setting files
* Maven (place settings.xml to .m2 folder.): https://db.tt/sYc0skfH

### Profile
```
JAVA_HOME=/home/rocky/dev/lib/jdk
JRE_HOME=$JAVA_HOME/jre
MAVEN_HOME=/home/rocky/dev/lib/maven
PATH=$PATH:$JAVA_HOME/bin:$MAVEN_HOME/bin
export JAVA_HOME JRE_HOME MAVEN_HOME PATH
```


Apply profile
```
source /etc/profile
```
