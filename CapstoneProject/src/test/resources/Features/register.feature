
@tagregister
	Feature: to register the user


 @tag4
 Scenario: user is to register on the application
 		Given user has opened Application
 		And user has opened login page
 		And user opts to register
 		When user enters details required
 		Examples: 
   		 | user@user.com  | user |
 		Then user should be registered
      