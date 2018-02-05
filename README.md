# TestAutomationDemo
This is a demo maven porject for test automation

In order to run the test you should execute the following in command line in project directory:

Mvn clean test  -Dtags=@demo.domain.navigate -Dbrowser=iexplorer

-Dtags : Specifies the test scenario tag. 
         The choices are: @demo.domain.navigate , @demo.domain.user , or @demo.domain for both
         
         
-Dbrowser : Specifies the target browser.
          The choices are: iexplorer, chrome and firefox
          The drivers are already included in the project under support/drivers
