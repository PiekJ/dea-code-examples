This project contains an implementation of an OrderService with two packages:
* nl.oose.dea.orderservice.withoutsrp contains classes and test cases without the SRP principle applied
* nl.oose.dea.orderservice.withsrp contains some classes and test cases that guide you to apply the SRP

First read the sourcecode without SRP and run the test cases (comment the testcases with SRP applied to compile and run these testcases).
Second, read the test cases with SRP and (re)create the correct classes and interfaces so the unit tests all pass.

Refactor the code in the following order:
* PaymentProcessor
* ReservationService
* NotificationService
* POSCashOrder
* POSCreditOrder
* OnlineOrder