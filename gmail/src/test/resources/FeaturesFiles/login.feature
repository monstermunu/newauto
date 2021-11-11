
Feature: Verifiy wishlist feature  

  
  Scenario: Add four items to the wishlist and add lowest of them to cart  
    Given I login to "https://testscriptdemo.com/"
    Given I add four products to my wishlist 
    When I view my whishlist table 
    Then I find total four seleted items in my wish list  
    When I search for lowest price product
    And I am able to add the lowest price item to the cart 
    Then I am able to verify the item in the cart   
    

