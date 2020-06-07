# Spring MVC
### Spring Model - View - Controller


***Models*** => Tells how is the data structured or What the data is Looking Like ?  
***Services*** => Contains the Business Logic which or Works upon the data.  
***Repository*** => Make Connection with Database or Fetch the Model via Repository.  
***Controllers*** => Transfers the data between Service and View (UI).  
***Utilities*** => Constants or a Helper Package  
***Views*** => (resources/static) Static data like files, images => (resources/templates) HTML Templates  

### Best Practices to be followed :-
1. Code Against Interface not Implementation 
    (Reason:- Interface remains same whereas Implementation can change).

2. Never Pass a Response/Object Directly, instead enclose the object in a DTO(Data Transfer Object).
    (Reason:- When the Server return a 404 Error the Code breaks.
   So, Make Sure the Response is never NULL even in 404)
