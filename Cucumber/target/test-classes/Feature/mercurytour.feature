Feature: Login mercury tour demo page


@MT_Login
Scenario: Login Page
Given Open Chrome browser and open mercury tour website
When enter username in UserName textbox as "QQQQ"
And Enter passord in password textbox as "qqqq"
Then Click on submit button
Then Display Success page
Then navigate to register page


@MT_register
Scenario: Register page
When enter first name in  textbox as "Mahesh"
And enter last name in LastName textbox as "Raghu"
And enter phone no. in phone textbox as "9209006400"
And enter email id in email textbox as "QQQQ"
And enter address in address textbox as "Akurdi"
And enter city in city textbox as "Pune"
And enter state in state textbox as "Maharashtra"
And enter post in UserName post as "123456"
And Select country "GIBRALTAR"
And enter the user name "QQQQ"
And enter the password "qqqq"
And Enter password for confirmation "qqqq"
Then Click on submit button for register
Then Get our user name


@MT_Flight_booking
Scenario: Flight booking
When navigate to flight booking
And Select trip oneway or two way
And Select number of passenger "4"
And Select country for departure "Seattle"
And Select departure month as "May"
And Select departure date










