# ice-cream-shop-decorator-factory-patterns

<b>Project Description:</b> Our goal is to use a combination of the Decorator design pattern and the Factory design pattern to create a simple store to purchase complez objects. This can be entirely in the console using simple console input and output. The user should be able to pick an item from the menu and then fill that item out with ingredients until they are done


<b>Instructions:</b> You are creating Point of Sale software for a small business with highly
customizable products.  The customer will order any number of items that can be
customized any number of ways.

You’ll employ the Decorator Pattern to allow the user to customize their products
and store each “Big Fancy Object” (BF-Object) in an appropriate data-structure
(probably an ArrayList).

When the order is complete.  You will summarize the order into an invoice giving
a breakdown of each item, the price of each item and the total.

<b>Specificiations:</b> You can build any type of store you wish, but the customer should have at least 3
things they can build (concrete objects) with at least 10 optional ingredients
for their item.

<b>Sample Output:</b>

Welcome to Decorator Ice Cream Shop!

Please begin your order:

[1] Bowl
[2] Cake Cone
[3] Waffle Cone
[0] Continue to Ice Cream Flavors
3
0

Choose your Ice Cream Flavors
[1] Chocolate
[2] Vanilla
[3] Strawberry
[4] Neapolitan
[5] Butter Pecan
[6] Chocolate Chip Cookie Dough
[7] Black Raspberry Chocolate Chip
[8] Cookies 'n Cream
[9] Mint Chocolate Chip
[10] Butterscotch
[11] Rocky Road
[12] Salted Caramel
[0] Complete Order and Display Invoice
1
3
5
0
Your Order
---------------------------------
Waffle-Cone
	-- Chocolate
	-- Strawberry
	-- Chocolate-Chip
Sub-total:                      $10.00
Tax:                            $0.56
Total:                          $10.56
