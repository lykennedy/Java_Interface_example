# Java_Interface_example
Not really a project per se. This is just a way that really helped me understand interfaces in Java.
So for this small little program, I created an interface for logic gates, class that implements that said interface will have to implement the methods that are listed in there, it's sort of like a guideline.
If the classes that implement from that interface that don't implement those methods, then the program won't compile. 
Interfaces are also very flexibile and powerful. If a class method or function in the main program accepts some specific datatype as its parameter then if, in the future a change was made to that parameter, the whole program could break.
Instead of passing in a specific data type, pass in an interface instead and the whole code is more general and flexible. One example that is in Java already is List. 
List is an interface and a class that implements this list is the ArrayList. For example if I created something like this, List<String> test = new ArrayList<String>();. Instead of using ArrayList you could replace it with any class that implements from the interface. 
