





WELCOME
=======
Congratulations you have just created a new Mule module!

This wizard created a number of new classes and resources useful for Mule modules.  Each of the created files
contains documentation and _todo_ items where necessary.  Here is an overview of what was created.

./pom.xml:
A maven project descriptor that describes how to build this module.  If you enabled this project for the
MuleForge, this file will contain additional information about the project on MuleForge.

./assembly.xml:
A maven assembly descriptor that defines how this module will be packaged when you make a release.

./LICENSE.txt:
The open source license text for this project.

-----------------------------------------------------------------
./src/main/java/org/mule/module/MapPack/i18n/MapPackMessages.java:

The MapPackMessages java class contains methods for access i18n messages embedded in your java code.

-----------------------------------------------------------------
./src/main/resources/META-INF/services/org/mule/i18n/MapPack-messages.properties

These message properties contain i18n strings used by MapPackMessages.java.


-----------------------------------------------------------------
./src/main/resources/META-INF/mule-MapPack.xsd

The configuration schema file for this module. All configuration elements should be defined in this schema.

-----------------------------------------------------------------
./src/main/resources/META-INF/spring.schemas

Contains a mapping of the Namespace URI for this projects schema.

-----------------------------------------------------------------
./src/main/resources/META-INF/spring.handlers

Contains a mapping of the namespace handler to use for the schema in this project.

-----------------------------------------------------------------
./src/main/java/org/mule/module/MapPack/config/MapPackNamespaceHandler.java

The implmentation of the namespace handler used to parse elements defined in mule-MapPack.xsd.

TESTING
=======

This  project also contains test classes that can be run as part of a test suite.
-----------------------------------------------------------------
./src/test/java/org/mule/module/MapPack/MapPackTestCase.java

This is an example functional test case.  The test will work as is, but you need to configure it to actually test your
code.  For more information about testing see: http://www.mulesoft.org/documentation/display/MULE3USER/Functional+Testing.

-----------------------------------------------------------------
./src/test/resources/MapPack-functional-test-config.xml

Defines the Mule configuration for the MapPackTestCase.java.

-----------------------------------------------------------------
./src/test/java/org/mule/module/MapPack/MapPackNamespaceHandlerTestCase.java

A test case that is used to test each of the configuration elements inside your mule-MapPack.xsd schema file.

-----------------------------------------------------------------
./src/test/resources/MapPack-namespace-config.xml

The configuration file for the MapPackNamespaceHandlerTestCase.java testcase.

ADDITIONAL RESOURCES
====================
Everything you need to know about getting started with Mule can be found here:
http://www.mulesoft.org/documentation/display/MULE3INTRO/Home

There further useful information about extending Mule here:
http://www.mulesoft.org/documentation/display/MULE3USER/Introduction+to+Extending+Mule

  There is detailed information about creating Mule configuration schemas here:
http://www.mulesoft.org/documentation/display/MULE3USER/Creating+a+Custom+XML+Namespace
    
For information about working with Mule inside and IDE with maven can be found here:
http://www.mulesoft.org/documentation/display/MULE3INTRO/Setting+Up+Eclipse

Remember if you get stuck you can try getting help on the Mule user list:
http://www.mulesoft.org/email-lists

Also, MuleSoft, the company behind Mule, offers 24x7 support options:
http://www.mulesoft.com/enterprise-subscriptions-and-support

Enjoy your Mule ride!

The Mule Team

--------------------------------------------------------------------
