Feature: Lotto

@lotto
Scenario: Validate lotto

	Given URI for lotto
	Then validate the body of lotto
	And verify the status code is 200