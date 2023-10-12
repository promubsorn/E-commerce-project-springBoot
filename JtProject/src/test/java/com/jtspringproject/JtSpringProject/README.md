<!-- Output copied to clipboard! -->

<!-----

Yay, no errors, warnings, or alerts!

Conversion time: 3.369 seconds.


Using this Markdown file:

1. Paste this output into your source file.
2. See the notes and action items below regarding this conversion run.
3. Check the rendered output (headings, lists, code blocks, tables) for proper
   formatting and use a linkchecker before you publish this page.

Conversion notes:

* Docs to Markdown version 1.0β34
* Wed Oct 11 2023 23:12:35 GMT-0700 (PDT)
* Source doc: Project 1 Unit Test
* Tables are currently converted to HTML tables.
----->


**Member** \
6388007 Promubsorn Boonrod

6388031 Nutawat Boonkhong

6388066 Chanyanud Suwannimit

6388056 Nopparwut Sirisawat

6388119 Kittipat Arpanon

6388142 Tawan-ok Ruekveerawattana


<table>
  <tr>
   <td><strong>Test case ID</strong>
   </td>
   <td colspan="3" >TC0001
   </td>
  </tr>
  <tr>
   <td><strong>Test case name</strong>
   </td>
   <td colspan="3" > A new product is successfully added to the database.
   </td>
  </tr>
  <tr>
   <td><strong>Purpose</strong>
   </td>
   <td colspan="3" >Verify that the `addProduct` method correctly adds a product to the database and returns the saved product. This test ensures the service layer functions correctly when adding a new product.
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Input characteristics</strong>
   </td>
  </tr>
  <tr>
   <td>
<ol>

<li><strong>Interface-based characteristics</strong>
</li>
</ol>
   </td>
   <td colspan="3" >C1: Whether the added Product is null 
   </td>
  </tr>
  <tr>
   <td>
<ol>

<li><strong>Functionality-based characteristics</strong>
</li>
</ol>
   </td>
   <td colspan="3" >C1: Availability of the product
   </td>
  </tr>
  <tr>
   <td><strong>Testable functions</strong>
   </td>
   <td colspan="3" >testAddProduct()
   </td>
  </tr>
  <tr>
   <td><strong>Parameters</strong>
   </td>
   <td colspan="3" >Product
   </td>
  </tr>
  <tr>
   <td><strong>Return types</strong>
   </td>
   <td>Product
   </td>
   <td><strong>Return values</strong>
   </td>
   <td>Saved product
   </td>
  </tr>
  <tr>
   <td><strong>Exceptional Behavior</strong>
   </td>
   <td colspan="3" >-
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Input domain</strong>
   </td>
  </tr>
  <tr>
   <td>B1: Product is null
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>B2: Product is not null
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Test requirements (ACoC, ECC, PWC, BCC, MBCC)</strong>
   </td>
  </tr>
  <tr>
   <td>ACoC = 2 test cases
   </td>
   <td colspan="3" >{(Null), ( Product)}
   </td>
  </tr>
  <tr>
   <td>
   </td>
   <td colspan="3" >
   </td>
  </tr>
  <tr>
   <td>
   </td>
   <td colspan="3" >
   </td>
  </tr>
  <tr>
   <td><strong>Test value</strong>
   </td>
   <td>
<ol>

<li>Null

<li>New Product() 
</li>
</ol>
   </td>
   <td><strong>Expected result</strong>
   </td>
   <td>
<ol>

<li>Throw error exception

<li>Product ID is exist
</li>
</ol>
   </td>
  </tr>
</table>



<table>
  <tr>
   <td><strong>Test case ID</strong>
   </td>
   <td colspan="3" >TC0002
   </td>
  </tr>
  <tr>
   <td><strong>Test case name</strong>
   </td>
   <td colspan="3" >A product is retrieved correctly with a valid ID
   </td>
  </tr>
  <tr>
   <td><strong>Purpose</strong>
   </td>
   <td colspan="3" >Verify that the getProduct(int ID) method correctly retrieves a product from the database when provided with a valid product ID. This test ensures that the method can successfully fetch an existing product by its ID.
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Input characteristics</strong>
   </td>
  </tr>
  <tr>
   <td>
<ol>

<li><strong>Interface-based characteristics</strong>
</li>
</ol>
   </td>
   <td colspan="3" >C1: Relation of ID to 0
   </td>
  </tr>
  <tr>
   <td>
<ol>

<li><strong>Functionality-based characteristics</strong>
</li>
</ol>
   </td>
   <td colspan="3" >C1: Whether the given ID has an actual product in the database
   </td>
  </tr>
  <tr>
   <td><strong>Testable functions</strong>
   </td>
   <td colspan="3" >testGetProductByID()
   </td>
  </tr>
  <tr>
   <td><strong>Parameters</strong>
   </td>
   <td colspan="3" >Product ID
   </td>
  </tr>
  <tr>
   <td><strong>Return types</strong>
   </td>
   <td>Product
   </td>
   <td><strong>Return values</strong>
   </td>
   <td>Product of the given ID
   </td>
  </tr>
  <tr>
   <td><strong>Exceptional Behavior</strong>
   </td>
   <td colspan="3" >-
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Input domain</strong>
   </td>
  </tr>
  <tr>
   <td>B1: A valid ID
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>B2: An invalid ID
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Test requirements (ACoC, ECC, PWC, BCC, MBCC)</strong>
   </td>
  </tr>
  <tr>
   <td>ECC = 2 test cases
   </td>
   <td colspan="3" >{(valid ID), (invalid ID)}
   </td>
  </tr>
  <tr>
   <td><strong>Test value </strong>
   </td>
   <td>
<ol>

<li>1

<li>-1
</li>
</ol>
   </td>
   <td><strong>Expected result</strong>
   </td>
   <td>
<ol>

<li>Return Product

<li>Return Null
</li>
</ol>
   </td>
  </tr>
</table>



<table>
  <tr>
   <td><strong>Test case ID</strong>
   </td>
   <td colspan="3" >TC0003
   </td>
  </tr>
  <tr>
   <td><strong>Test case name</strong>
   </td>
   <td colspan="3" >testNewUserRegister
   </td>
  </tr>
  <tr>
   <td><strong>Purpose</strong>
   </td>
   <td colspan="3" >To validate the registration of a new user, ensuring that the user is correctly assigned the role “ROLE_NORMAL”, added to the system, and then redirected to the home page.
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Input characteristics</strong>
   </td>
  </tr>
  <tr>
   <td>
<ol>

<li><strong>Interface-based characteristics</strong>
</li>
</ol>
   </td>
   <td colspan="3" >C1: Input parameter is null
   </td>
  </tr>
  <tr>
   <td>
<ol>

<li><strong>Functionality-based characteristics</strong>
</li>
</ol>
   </td>
   <td colspan="3" >C2: Add user to database
   </td>
  </tr>
  <tr>
   <td><strong>Testable functions</strong>
   </td>
   <td colspan="3" >userService.addUser(User user)
   </td>
  </tr>
  <tr>
   <td><strong>Parameters</strong>
   </td>
   <td colspan="3" >
<ul>

<li>Address

<li>Email

<li>Password

<li>Role

<li>Username
</li>
</ul>
   </td>
  </tr>
  <tr>
   <td><strong>Return types</strong>
   </td>
   <td>String
   </td>
   <td><strong>Return values</strong>
   </td>
   <td>“redirect:/”
   </td>
  </tr>
  <tr>
   <td><strong>Exceptional Behavior</strong>
   </td>
   <td colspan="3" >
<ul>

<li>If the “User” object is null, the method might throw an exception or behave unexpectedly.
</li>
</ul>
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Input domain</strong>
   </td>
  </tr>
  <tr>
   <td>B1: A valid User object
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>B2: An invalid User object
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Test requirements (ACoC, ECC, PWC, BCC, MBCC)</strong>
   </td>
  </tr>
  <tr>
   <td>
   </td>
   <td>B1: A valid User object
   </td>
   <td>B2: An invalid User object
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>C1: Input parameter is null
   </td>
   <td>False
   </td>
   <td>True
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>C2: Add user to database
   </td>
   <td>Capable
   </td>
   <td> Incapable
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>PWC = 4 case
   </td>
   <td>{(False, Capable),
<p>
(False, Incapable),
<p>
(True,Capable),
<p>
(True, Incapable)}
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td><strong>Test value</strong>
<p>
(False, Capable)
   </td>
   <td>'4', 'TestAddress', 'Test@example.com', 'password123', 'ROLE_NORMAL', 'TestUser'
   </td>
   <td><strong>Expected result</strong>
   </td>
   <td>The method able to add new user to the table and return
<p>
“redirect:/”
   </td>
  </tr>
  <tr>
   <td><strong>Test value</strong>
<p>
(False, Incapable)
   </td>
   <td>'4', 'TestAddress', 'invalidemailformat', 'password123', 'ROLE_NORMAL', 'TestUser'
   </td>
   <td><strong>Expected result</strong>
   </td>
   <td>The method unable to add new user to the table and return
<p>
“redirect:/”
   </td>
  </tr>
  <tr>
   <td><strong>Test value</strong>
<p>
(True,Capable)
   </td>
   <td>'4',null, 'Test@example.com', 'password123', 'ROLE_NORMAL', 'TestUser'
   </td>
   <td><strong>Expected result</strong>
   </td>
   <td>The method able to add new user to the table and return
<p>
“redirect:/”
   </td>
  </tr>
  <tr>
   <td><strong>Test value</strong>
<p>
(True, Incapable)
   </td>
   <td>'4',null, 'Test@example.com', 'password123', 'ROLE_NORMAL', null
   </td>
   <td><strong>Expected result</strong>
   </td>
   <td>The method able to add new user to the table and return
<p>
“redirect:/”
   </td>
  </tr>
</table>



<table>
  <tr>
   <td><strong>Test case ID</strong>
   </td>
   <td colspan="3" >TC0004
   </td>
  </tr>
  <tr>
   <td><strong>Test case name</strong>
   </td>
   <td colspan="3" >TestGetUser
   </td>
  </tr>
  <tr>
   <td><strong>Purpose</strong>
   </td>
   <td colspan="3" >To validate the retrieval of a user based on the provided username. The method should return the correct user details if the username exists in the system, and handle scenarios where the username does not exist.
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Input characteristics</strong>
   </td>
  </tr>
  <tr>
   <td>
<ol>

<li><strong>Interface-based characteristics</strong>
</li>
</ol>
   </td>
   <td colspan="3" >C1: Input parameter is not null
   </td>
  </tr>
  <tr>
   <td>
<ol>

<li><strong>Functionality-based characteristics</strong>
</li>
</ol>
   </td>
   <td colspan="3" >C2:  type of credential
   </td>
  </tr>
  <tr>
   <td><strong>Testable functions</strong>
   </td>
   <td colspan="3" >userDao.getUser(String username,String password)
   </td>
  </tr>
  <tr>
   <td><strong>Parameters</strong>
   </td>
   <td colspan="3" >
<ul>

<li>Username

<li>Password
</li>
</ul>
   </td>
  </tr>
  <tr>
   <td><strong>Return types</strong>
   </td>
   <td>Object or null
   </td>
   <td><strong>Return values</strong>
   </td>
   <td>User object or null
   </td>
  </tr>
  <tr>
   <td><strong>Exceptional Behavior</strong>
   </td>
   <td colspan="3" > If the provided username does not exist, the method might return null 
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Input domain</strong>
   </td>
  </tr>
  <tr>
   <td>B1: A valid input parameter
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>B2: An invalid input parameter
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Test requirements (ACoC, ECC, PWC, BCC, MBCC)</strong>
   </td>
  </tr>
  <tr>
   <td>
   </td>
   <td>B1: A valid input parameter
   </td>
   <td>B2: An invalid input parameter
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>C1: Input parameter is null
   </td>
   <td>False
   </td>
   <td>True
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>C2: type of credential
   </td>
   <td>Correct credential
   </td>
   <td>Incorrect credential
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>PWC = (4 Case)
   </td>
   <td>{(False, correct credential),
<p>
(False,Incorrect credential),
<p>
(True, correct credential),
<p>
(True, Incorrect credential)}
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td><strong>Test value</strong>
<p>
(False, correct credential)
   </td>
   <td>'admin', '123'
   </td>
   <td><strong>Expected result</strong>
   </td>
   <td>'1', '123, Albany Street', 'admin@nyan.cat', '123', 'ROLE_ADMIN', 'admin'
   </td>
  </tr>
  <tr>
   <td><strong>Test value</strong>
<p>
(False,Incorrect credential)
   </td>
   <td>‘admin’,’invalidpassword’
   </td>
   <td><strong>Expected result</strong>
   </td>
   <td>Null
   </td>
  </tr>
  <tr>
   <td><strong>Test value</strong>
<p>
(True, correct credential)
   </td>
   <td>‘admin’,null
   </td>
   <td><strong>Expected result</strong>
   </td>
   <td>Null
   </td>
  </tr>
  <tr>
   <td><strong>Test value</strong>
<p>
(True, Incorrect credential)
   </td>
   <td>‘invalidusername’,null
   </td>
   <td><strong>Expected result</strong>
   </td>
   <td>Null
   </td>
  </tr>
</table>





<table>
  <tr>
   <td><strong>Test case ID</strong>
   </td>
   <td colspan="3" >TC0005
   </td>
  </tr>
  <tr>
   <td><strong>Test case name</strong>
   </td>
   <td colspan="3" >AddCartTests
   </td>
  </tr>
  <tr>
   <td><strong>Purpose</strong>
   </td>
   <td colspan="3" >To Verify when Add new cart to the database.
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Input characteristics</strong>
   </td>
  </tr>
  <tr>
   <td>
<ol>

<li><strong>Interface-based characteristics</strong>
</li>
</ol>
   </td>
   <td colspan="3" >C1: cart user is not null
   </td>
  </tr>
  <tr>
   <td>
<ol>

<li><strong>Functionality-based characteristics</strong>
</li>
</ol>
   </td>
   <td colspan="3" >C1: Must be able to add new Cart to database
   </td>
  </tr>
  <tr>
   <td><strong>Testable functions</strong>
   </td>
   <td colspan="3" >cartDao.addCart(cart);
   </td>
  </tr>
  <tr>
   <td><strong>Parameters</strong>
   </td>
   <td colspan="3" >User, Product, Cart
   </td>
  </tr>
  <tr>
   <td><strong>Return types</strong>
   </td>
   <td>object
   </td>
   <td><strong>Return values</strong>
   </td>
   <td>Cart
   </td>
  </tr>
  <tr>
   <td><strong>Exceptional Behavior</strong>
   </td>
   <td colspan="3" >-
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Input domain</strong>
   </td>
  </tr>
  <tr>
   <td>B1: A valid new cart
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>B2: invalid new cart
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Test requirements (ACoC, ECC, PWC, BCC, MBCC)</strong>
   </td>
  </tr>
  <tr>
   <td>ACoC
   </td>
   <td>B1:A valid new cart
   </td>
   <td>B2: invalid new cart
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>C1: cart user is not null
   </td>
   <td>‘User’,’product’ True
   </td>
   <td>‘Null’, ‘Product’ False
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>C2: Must be able to add new Cart
   </td>
   <td>‘User’,’product’ True
   </td>
   <td>‘Null’, ‘Product’ False
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td><strong>Test value</strong>
   </td>
   <td>
<ol>

<li>(‘TestUser’, ‘TestAddress’, ‘<a href="mailto:lisa@gmail.com">lisa@gmail.com</a>’, ‘password123’),(‘Mock Product’, ‘100’)  

 
</li>
</ol>
   </td>
   <td><strong>Expected result</strong>
   </td>
   <td>Cart successfully added.
   </td>
  </tr>
</table>



<table>
  <tr>
   <td><strong>Test case ID</strong>
   </td>
   <td colspan="3" >TC0006
   </td>
  </tr>
  <tr>
   <td><strong>Test case name</strong>
   </td>
   <td colspan="3" >DeleteCartTests
   </td>
  </tr>
  <tr>
   <td><strong>Purpose</strong>
   </td>
   <td colspan="3" >To Verify that the cart is removed when Delete the cart.
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Input characteristics</strong>
   </td>
  </tr>
  <tr>
   <td>
<ol>

<li><strong>Interface-based characteristics</strong>
</li>
</ol>
   </td>
   <td colspan="3" >C1: Number of cart is not null
   </td>
  </tr>
  <tr>
   <td>
<ol>

<li><strong>Functionality-based characteristics</strong>
</li>
</ol>
   </td>
   <td colspan="3" >C1: Must be able to delete cart from database
   </td>
  </tr>
  <tr>
   <td><strong>Testable functions</strong>
   </td>
   <td colspan="3" >cartDao.deleteCart(cart);
   </td>
  </tr>
  <tr>
   <td><strong>Parameters</strong>
   </td>
   <td colspan="3" >Cart
   </td>
  </tr>
  <tr>
   <td><strong>Return types</strong>
   </td>
   <td>-
   </td>
   <td><strong>Return values</strong>
   </td>
   <td>size() of cart
   </td>
  </tr>
  <tr>
   <td><strong>Exceptional Behavior</strong>
   </td>
   <td colspan="3" >-
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Input domain</strong>
   </td>
  </tr>
  <tr>
   <td>B1: valid cart
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>B2: invalid cart 
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Test requirements (ACoC, ECC, PWC, BCC, MBCC)</strong>
   </td>
  </tr>
  <tr>
   <td>ACoC
   </td>
   <td>B1:A valid cart
   </td>
   <td>B2:Invalid cart
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>C1: cart is not null
   </td>
   <td>‘Cart’ 
   </td>
   <td>‘Invalid’
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>C2: Must be able to delete new Cart
   </td>
   <td>‘Cart’
   </td>
   <td>‘Invalid’
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td><strong>Test value</strong>
   </td>
   <td>
    cart.size()
   </td>
   <td><strong>Expected result</strong>
   </td>
   <td>0
   </td>
  </tr>
</table>



<table>
  <tr>
   <td><strong>Test case ID</strong>
   </td>
   <td colspan="3" >TC0007
   </td>
  </tr>
  <tr>
   <td><strong>Test case name</strong>
   </td>
   <td colspan="3" >TestUserLogin
   </td>
  </tr>
  <tr>
   <td><strong>Purpose</strong>
   </td>
   <td colspan="3" >To validate the user login functionality ensuring proper redirection and error handling based on user credentials.
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Input characteristics</strong>
   </td>
  </tr>
  <tr>
   <td>
<ol>

<li><strong>Interface-based characteristics</strong>
</li>
</ol>
   </td>
   <td colspan="3" >C1: Provided username and password
   </td>
  </tr>
  <tr>
   <td>
<ol>

<li><strong>Functionality-based characteristics</strong>
</li>
</ol>
   </td>
   <td colspan="3" >C2: Verification of user credentials against the database.
   </td>
  </tr>
  <tr>
   <td><strong>Testable functions</strong>
   </td>
   <td colspan="3" >userController.userlogin()
   </td>
  </tr>
  <tr>
   <td><strong>Parameters</strong>
   </td>
   <td colspan="3" >Username, Password, Session, HttpServletResponse
   </td>
  </tr>
  <tr>
   <td><strong>Return types</strong>
   </td>
   <td>ModelAndView
   </td>
   <td><strong>Return values</strong>
   </td>
   <td>View name for redirection and any applicable model attributes.
   </td>
  </tr>
  <tr>
   <td><strong>Exceptional Behavior</strong>
   </td>
   <td colspan="3" >Incorrect login credentials should redirect to "userLogin" with an appropriate error message.
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Input domain</strong>
   </td>
  </tr>
  <tr>
   <td>B1: Valid user credentials
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>B2: Invalid user credentials
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Test requirements (ACoC, ECC, PWC, BCC, MBCC)</strong>
   </td>
  </tr>
  <tr>
   <td>
   </td>
   <td>B1: Valid user credentials
   </td>
   <td>B2: Invalid user credentials
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>C1: Correct username and password provided
   </td>
   <td>Valid
   </td>
   <td>Invalid
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>C2: Verification against database
   </td>
   <td>Valid
   </td>
   <td>Invalid
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>MBCC(8)
   </td>
   <td>1.)Valid,Valid, ("johnDoe", "password123")
<p>
2.)Valid,Invalid
<p>
3.)Invalid,Valid
<p>
4.)Invalid,Invalid
<p>
5.)Valid,Valid
<p>
6.)Valid,Invalid
<p>
7.)Invalid,Valid
<p>
8.)Invalid,Invalid
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td><strong>Test value</strong>
   </td>
   <td>1. "Testeiei", "password123"
<p>
2. "invalidUser", "invalidPass"
   </td>
   <td><strong>Expected result</strong>
   </td>
   <td>1. Redirection to "index"
<p>
2. Redirection to "userLogin" with error message "Please enter correct email and password"
   </td>
  </tr>
</table>



<table>
  <tr>
   <td><strong>Test case ID</strong>
   </td>
   <td colspan="3" >TC0008
   </td>
  </tr>
  <tr>
   <td><strong>Test case name</strong>
   </td>
   <td colspan="3" >UpdateCategoryTests
   </td>
  </tr>
  <tr>
   <td><strong>Purpose</strong>
   </td>
   <td colspan="3" >To verify that the updateCategory method in categoryDao updates the category name correctly in the database when provided with a valid category ID.
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Input characteristics</strong>
   </td>
  </tr>
  <tr>
   <td>
<ol>

<li><strong>Interface-based characteristics</strong>
</li>
</ol>
   </td>
   <td colspan="3" >C1: A valid category ID is provided.
<p>
C2: A new name for the category is provided.
   </td>
  </tr>
  <tr>
   <td>
<ol>

<li><strong>Functionality-based characteristics</strong>
</li>
</ol>
   </td>
   <td colspan="3" >C3: The method fetches the category from the database based on the provided ID.
<p>
C4: The method updates the category name in the database.
   </td>
  </tr>
  <tr>
   <td><strong>Testable functions</strong>
   </td>
   <td colspan="3" >categoryDao.updateCategory(int id, String name)
   </td>
  </tr>
  <tr>
   <td><strong>Parameters</strong>
   </td>
   <td colspan="3" >Category ID, New Category Name
   </td>
  </tr>
  <tr>
   <td><strong>Return types</strong>
   </td>
   <td>Category
   </td>
   <td><strong>Return values</strong>
   </td>
   <td>Updated Category Object
   </td>
  </tr>
  <tr>
   <td><strong>Exceptional Behavior</strong>
   </td>
   <td colspan="3" >The method might throw exceptions if there's a database connection issue, a problem with the Hibernate session, or if the provided category ID is not present in the database.
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Input domain</strong>
   </td>
  </tr>
  <tr>
   <td>B1: A valid category ID that exists in the database.
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>B2: A new valid name for the category.
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Test requirements (ACoC, ECC, PWC, BCC, MBCC)</strong>
   </td>
  </tr>
  <tr>
   <td>ACoC
   </td>
   <td>B1: A valid category ID that 
   </td>
   <td>B2: A new valid name for the category.
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>C1: A valid category ID is provided.
   </td>
   <td>Invalid
   </td>
   <td>Valid
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>C2: A new name for the category is provided.
   </td>
   <td>Valid
   </td>
   <td>Invalid
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>C3: The method fetches the category from the database based on the provided ID
   </td>
   <td>Valid
   </td>
   <td>Valid
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>C4: The method updates the category name in the database.
   </td>
   <td>Valid
   </td>
   <td>Valid
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td><strong>Test value</strong>
   </td>
   <td>1.) Category ID: 1, New Category Name: "UpdatedCategory"
   </td>
   <td><strong>Expected result</strong>
   </td>
   <td>1.) The returned Category object should have its name updated to "UpdatedCategory".
   </td>
  </tr>
</table>



<table>
  <tr>
   <td><strong>Test case ID</strong>
   </td>
   <td colspan="3" >TC0009
   </td>
  </tr>
  <tr>
   <td><strong>Test case name</strong>
   </td>
   <td colspan="3" >addCategory
   </td>
  </tr>
  <tr>
   <td><strong>Purpose</strong>
   </td>
   <td colspan="3" >To validate that the system correctly adds a category to the database and handles various input characteristics.
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Input characteristics</strong>
   </td>
  </tr>
  <tr>
   <td>
<ol>

<li><strong>Interface-based characteristics</strong>
</li>
</ol>
   </td>
   <td colspan="3" >C1:Adding a category with a new, unique name.
   </td>
  </tr>
  <tr>
   <td>
<ol>

<li><strong>Functionality-based characteristics</strong>
</li>
</ol>
   </td>
   <td colspan="3" >C2:A new Category object is created and persisted in the database.
   </td>
  </tr>
  <tr>
   <td><strong>Testable functions</strong>
   </td>
   <td colspan="3" >addCategory
   </td>
  </tr>
  <tr>
   <td><strong>Parameters</strong>
   </td>
   <td colspan="3" >categoryName
   </td>
  </tr>
  <tr>
   <td><strong>Return types</strong>
   </td>
   <td>Category
   </td>
   <td><strong>Return values</strong>
   </td>
   <td>An instance of Category with the given name
   </td>
  </tr>
  <tr>
   <td><strong>Exceptional Behavior</strong>
   </td>
   <td colspan="3" >-
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Input domain</strong>
   </td>
  </tr>
  <tr>
   <td>B1: A valid category name
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>B2: An invalid category name
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Test requirements (ACoC, ECC, PWC, BCC, MBCC)</strong>
   </td>
  </tr>
  <tr>
   <td>ACoC:
   </td>
   <td>B1: A valid category name
   </td>
   <td>B2: An invalid category name
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>C1:Adding a category with a new, unique name
   </td>
   <td>Valid
   </td>
   <td>Invalid
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>C2:The method adds category to the database
   </td>
   <td>Valid
   </td>
   <td>Invalid
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td><strong>Test value</strong>
   </td>
   <td>1."Electronics"
<p>
2."" (empty string)
<p>
3.null
<p>
4."Electronics"
   </td>
   <td><strong>Expected result</strong>
   </td>
   <td>1.Category successfully added
<p>
2.Error due to invalid name
<p>
3.Error due to invalid name
<p>
4.Error due to database failure
   </td>
  </tr>
</table>



<table>
  <tr>
   <td><strong>Test case ID</strong>
   </td>
   <td colspan="3" >TC0010
   </td>
  </tr>
  <tr>
   <td><strong>Test case name</strong>
   </td>
   <td colspan="3" >DeleteCategoryTests
   </td>
  </tr>
  <tr>
   <td><strong>Purpose</strong>
   </td>
   <td colspan="3" >To validate that the system correctly deletes a category from the database when given a valid category ID.
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Input characteristics</strong>
   </td>
  </tr>
  <tr>
   <td>
<ol>

<li><strong>Interface-based characteristics</strong>
</li>
</ol>
   </td>
   <td colspan="3" >C1: The category ID is a valid input that corresponds to an existing category in the database.
   </td>
  </tr>
  <tr>
   <td>
<ol>

<li><strong>Functionality-based characteristics</strong>
</li>
</ol>
   </td>
   <td colspan="3" >C2: The method deletes a category from the database
   </td>
  </tr>
  <tr>
   <td><strong>Testable functions</strong>
   </td>
   <td colspan="3" >categoryDao.deletCategory(int id)
   </td>
  </tr>
  <tr>
   <td><strong>Parameters</strong>
   </td>
   <td colspan="3" >Category ID
   </td>
  </tr>
  <tr>
   <td><strong>Return types</strong>
   </td>
   <td>Boolean
   </td>
   <td><strong>Return values</strong>
   </td>
   <td>True, False
   </td>
  </tr>
  <tr>
   <td><strong>Exceptional Behavior</strong>
   </td>
   <td colspan="3" >
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Input domain</strong>
   </td>
  </tr>
  <tr>
   <td>B1: A valid category ID that exists in the database.
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>B2: An invalid category ID that doesn't exist in the database.
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Test requirements (ACoC, ECC, PWC, BCC, MBCC)</strong>
   </td>
  </tr>
  <tr>
   <td>
   </td>
   <td>B1: A valid category ID that exists in the database.
   </td>
   <td>B2: An invalid category ID that doesn't exist in the database.
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>C1: Category ID provided to the method.
   </td>
   <td>Valid
   </td>
   <td>Invalid
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>C2: The method's capability to delete a category from the database.
   </td>
   <td>True
   </td>
   <td>False
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>BCC( case)
   </td>
   <td>1).(Valid,True)
<p>
2).(Invalid,True)
<p>
3).(Valid,False)                                                                                             
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td><strong>Test value</strong>
   </td>
   <td>1.)1(assuming this is a valid ID)
<p>
2.)2(assuming this is an invalid ID)
<p>
3.3 (assuming this is another invalid ID, different from the second test case)
   </td>
   <td><strong>Expected result</strong>
   </td>
   <td>1.True
<p>
2.False
<p>
3.False (because it's an invalid ID and the system should not delete anything, thus returning False)
   </td>
  </tr>
</table>



<table>
  <tr>
   <td><strong>Test case ID</strong>
   </td>
   <td colspan="3" >TC0011
   </td>
  </tr>
  <tr>
   <td><strong>Test case name</strong>
   </td>
   <td colspan="3" >DeleteProductsTests
   </td>
  </tr>
  <tr>
   <td><strong>Purpose</strong>
   </td>
   <td colspan="3" >Check to see whether the<strong> ‘deletProduct’ </strong>function successfully removes a product from the database and returns true. This test makes that the service layer deletes a product properly.
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Input characteristics</strong>
   </td>
  </tr>
  <tr>
   <td>
<ol>

<li><strong>Interface-based characteristics</strong>
</li>
</ol>
   </td>
   <td colspan="3" >C1:  Relation of ID to 0
   </td>
  </tr>
  <tr>
   <td>
<ol>

<li><strong>Functionality-based characteristics</strong>
</li>
</ol>
   </td>
   <td colspan="3" >C2: Whether the given ID has an actual product in the database
   </td>
  </tr>
  <tr>
   <td><strong>Testable functions</strong>
   </td>
   <td colspan="3" >productService.deletProduct(productId)
   </td>
  </tr>
  <tr>
   <td><strong>Parameters</strong>
   </td>
   <td colspan="3" >Product ID
   </td>
  </tr>
  <tr>
   <td><strong>Return types</strong>
   </td>
   <td>Boolean
   </td>
   <td><strong>Return values</strong>
   </td>
   <td>True , False 
   </td>
  </tr>
  <tr>
   <td><strong>Exceptional Behavior</strong>
   </td>
   <td colspan="3" >-
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Input domain</strong>
   </td>
  </tr>
  <tr>
   <td>B1: A valid ID
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>B2: An invalid ID
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Test requirements (ACoC, ECC, PWC, BCC, MBCC)</strong>
   </td>
  </tr>
  <tr>
   <td>ACoC = 2 test cases
   </td>
   <td>B1: Product available 
   </td>
   <td>B2: Product not available
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>C1: product id is not null
   </td>
   <td> 1, ‘True’
   </td>
   <td>  1, ‘False’
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>C2: product id is invalid
   </td>
   <td> { }, ’True ’
   </td>
   <td>{ },  ‘False’
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td><strong>Test value</strong>
   </td>
   <td>
<ol>

<li>Product available and have product id

<li>Product not  available and  have product id 

<li>Product  available and don’t have product id

<li>Product not  available and don’t have product id 
</li>
</ol>
   </td>
   <td><strong>Expected result</strong>
   </td>
   <td>
<ol>

<li>True 

<li>False

<li>False

<li>False 
</li>
</ol>
   </td>
  </tr>
</table>



<table>
  <tr>
   <td><strong>Test case ID</strong>
   </td>
   <td colspan="3" >TC0012
   </td>
  </tr>
  <tr>
   <td><strong>Test case name</strong>
   </td>
   <td colspan="3" >GetCartTests
   </td>
  </tr>
  <tr>
   <td><strong>Purpose</strong>
   </td>
   <td colspan="3" >Check to see that the database list of carts is properly retrieved by the getCarts() function. This test makes that the service layer retrieves cart data accurately.
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Input characteristics</strong>
   </td>
  </tr>
  <tr>
   <td>
<ol>

<li><strong>Interface-based characteristics</strong>
</li>
</ol>
   </td>
   <td colspan="3" >C1:Have the cart information in database not null
   </td>
  </tr>
  <tr>
   <td>
<ol>

<li><strong>Functionality-based characteristics</strong>
</li>
</ol>
   </td>
   <td colspan="3" >C2: Availability of the cart in database
   </td>
  </tr>
  <tr>
   <td><strong>Testable functions</strong>
   </td>
   <td colspan="3" >cartDao.getCarts();
   </td>
  </tr>
  <tr>
   <td><strong>Parameters</strong>
   </td>
   <td colspan="3" >-
   </td>
  </tr>
  <tr>
   <td><strong>Return types</strong>
   </td>
   <td>List&lt;Cart>
   </td>
   <td><strong>Return values</strong>
   </td>
   <td>List of retrieved carts
   </td>
  </tr>
  <tr>
   <td><strong>Exceptional Behavior</strong>
   </td>
   <td colspan="3" >-
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Input domain</strong>
   </td>
  </tr>
  <tr>
   <td>B1: No carts exist in the database
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>B2: Carts exist in the database
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td colspan="4" ><strong>Test requirements (ACoC, ECC, PWC, BCC, MBCC)</strong>
   </td>
  </tr>
  <tr>
   <td>ACoC = 2 test cases
   </td>
   <td colspan="3" >{(No carts exist in the database),(Carts exist in the database)}
   </td>
  </tr>
  <tr>
   <td><strong>Test value</strong>
   </td>
   <td>
<ol>

<li>No carts exist in the database

<li> Carts exist in the database
</li>
</ol>
   </td>
   <td><strong>Expected result</strong>
   </td>
   <td>
<ol>

<li> Empty list of carts

<li>List of retrieved carts
</li>
</ol>
   </td>
  </tr>
</table>

