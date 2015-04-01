# Testing #

Most of the code is covered with JUnit automated tests. To run all tests in Eclipse right click on PufTestSuite.java and pick "Run as JUnit test".

To run tests from command line use command `ant test`.

To measure test coverage run command `ant test-coverage`. It requires JDK directory as JAVA\_HOME. Set JAVA\_HOME directory under Control Panel -> System -> Advanced -> Environment variables. The coverage report is saved under `doc/test-coverage`. After measuring the coverage do a clean build using the command `ant clean test`.