Feature:Login
Scenario: Sucessful Login with Valid Credentials
Given User Launch Chrome browser
When User open url "https://admin-demo.nopcommerce.com/login"
And User enters Email as "admin@yourstore.com" and Password as "admin"
And Click on Login 
Then Page title should be "Dashboard / nopCommerce administration"

And close browser