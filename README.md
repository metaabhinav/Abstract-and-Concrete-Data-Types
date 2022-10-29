# Abstract-and-Concrete-Data-Types
Problem 1

Implement the immutable class intSet using an array to represent a set of integers in the range 1-1000. It should support public methods like - 

isMember(int x) - check whether x is a member of the set and return a boolean value

size() - return the size of the set

isSubSet(intSet s) - check whether s is a subset of the set

getComplement()  - return the complement set, you can assume that 1..1000 is the universal set

union( intSet s) - return the union set

You may use private helper methods. 

Set operations -

Union: Set of members that belong to the first set "or" the second set. 
Intersection: Set of members that belong to both the first set "and" second set.
Difference: Set of members that belong to the first set "and not" the second set. 
Complement: Set of members that belong to the second (universal) set "and not" the first set. 

Given the following sets:

   A={2,4,6,8,10}
   B={1,2,3,4,5}

   Union:        A∪B = {1,2,3,4,5,6,8,10}
   Intersection: A∩B = {2,4}
   Difference:   A-B = {6,8,10}
   Complement:   AB = {1,3,5}

Problem 2

Implement the immutable class Poly using an array to represent single variable polynomial. Note that you should be storing only those terms of polynomial that have non zero coefficient. You can assume that the coefficients are integers
It should support methods like - 

evaluate(float) - return the value of the polynomial for the given value of the variable

degree() - return the degree of the polynomial

addPoly(Poly p1, Poly p2) - return the sum of the polynomials p1 and p2

multiplyPoly(Poly p1, Poly p2) - return the product of polynomials p1 and p2

You may use private helper methods. addPoly() and multiplyPoly() can make assumptions about size of the resulting polynomial to decide about the size of the array to be created.

Bonus problem 1

Implement mutable version of Poly where one can add and delete members from the polynomial dynamically, and there is no upper limit on the size of the polynomial.

Bonus problem 2

How would one represent multivariate polynomial where there is no limit on number of variables.
