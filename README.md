# Cronometer Fork 

This is our fork of the Moxxie highcharts library. 

# Publishing a Version
To publish packages to here update the version number in the pom.xml and run mvn deploy (you need to have your git auth key stored in the ~/.m2/settings.xml as per https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-apache-maven-registry (use the owner cronometersoftware no caps).

# Updating main cronometer project 
Download the published jar file and replace the existing one in war/lib/. Update pom file to point to new file. 

# gwt-highcharts
GWT Highcharts is a freely available open source library that provides an elegant and feature complete approach for including Highcharts and Highstock visualizations within a GWT application using pure Java code.

Detailed documentation, demonstration of the different chart types, and source examples can be found on the [project home page](https://www.moxiegroup.com/moxieapps/gwt-highcharts/).

