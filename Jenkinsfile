pipeline {
   agent any 
   stages {
      stage('Test') {
         steps {
              echo 'Hello World'
//               git branch: 'main', credentialsId: 'c45dba1b-fa10-46ad-b046-4dd784dc3575', url: 'https://github.com/Streetlogix/Streetlogix-GIS4-Tests.git'
              bat('cd "C:/Users/shrut/Desktop/Katalon/Katalon_Studio_Engine_Windows/Katalon_Studio_Engine_Windows_Files" && katalonc -noSplash -runMode=console -projectPath="%WORKSPACE%/Streetlogix-GIS4-Tests.prj" -retry=0 -testSuitePath="Test Suites/Work Orders" -executionProfile="default" -browserType="Chrome" -apiKey="46055394-9a7d-4b2b-8ef0-5129765411e5" --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true')
         }
      }
   }
}