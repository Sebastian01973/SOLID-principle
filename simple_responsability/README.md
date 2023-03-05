# Single Responsibility Principle

Every class should have a single responsibility. There should never be more than one reason for a class to change.

This example is derived from a simple businees. The bad example provides a generic Business class that it contains everythings business of company, but this it bad , why the Single Responsibility Principle tells us that this class is actually handling far too many responsibilities.

Consider the Business class in the "good" example. The only thing it is responsible for is knowing about employees that while the Finance class is responsable of everythings themes for payroll of employees.
