# Simple Shopping Cart [![Build Status](https://travis-ci.com/ausmarton/hmrc-shopping-cart.svg?branch=master)](https://travis-ci.com/ausmarton/hmrc-shopping-cart)
A simple shopping cart checkout implementation for a shop selling Apples and Oranges with some offers

## Release Notes
#### Version 0.2
* Introduce Offers
* Apples, 2 for 1
* Oranges, 3 for 2

#### Version 0.1
* Checkout Apples at 60p and Oranges at 25p

## Testing
The tests can be run via sbt using the following command:
`sbt test`

## CI
Commits to master trigger a CI build on Travis

## System Requirements
In order to set up a development environment, the following tools would need to be installed:
* JDK 8
* Scala 2.13.1
* Sbt 1.3.7