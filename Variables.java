/* 
The Variable name rules
    - should not start with any special character 
    - Can include only underscore _ and dollar $ 
    - should not start with number
    - should start only with alphabets

Types of Variables
    - Local
    - static
    - Non-static
    - final  

Local:
    - 

Static:
    - A variable which is declared inside the class and outside of any method prefix with static keyword
    - It can be accessed anywhere in the class

Non-static:
    - A variable declared inside a class and outside a method with no static as prefix
    - A non-static variable cannot be accessed inside a static method directly but with the help of objects

Final:
    - final keyword as prefix
    - immutable once assigned cannot be changed
    - cannot update a value to final variable

*/



class Variables
{
    public static void main(String[] args) 
    {
        int a$b = 4;
        System.out.println(a$b); 

        // final
        final int a = 10;
        // a = 15; error: cannot assign a value to final variable a
        System.out.println(a); 
    }
}