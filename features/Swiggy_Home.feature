Feature: Title of your feature
  I want to use this template for my feature file

	@tag1
	Scenario Outline: TC_01_Regression testing for Swiggy application
		Given Swiggy webpage is opened
		Then Enter "<location>" in search textbox
		And Select location and click go
		Then Click on first Restuarant
		When Click on Add for first food item of the Restuarant
		And Click on Checkout button
		Then Validate text on checkout page
    Examples: 
      | location |
      | Bangalore, Karnataka, India |
   
