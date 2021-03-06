package learn.java.javacode.Exceptions;

/*
 * 	Checked Exception is that which checking by compiler 
 * 	in compiler time before runtime. Compiler make you catch this kind
 * 	of exceptions. When we use some of method it declare that it throw 
 * 	exception and we should catch it. But it should not be Runtime Exception 
 * 
 *  Unchecked exceptions is that which implements Runtime exception and
 *  they appeared during running program. Compiler will never encourage you
 *  catch that kinds of exceptions
 *  Unchecked exceptions are supposed to look for errors on the programmer's part
 *
 *  IF WE WOULD LIKE TO OVERRIDE A METHOD WHICH THROWS EXCEPTION WE NEED TO BE COMPATIBLE:
 *  1. Exclude exception; OR
 *  2. Can have the same exception level; OR (method A() throws IOException{})
 *  3. Can have a derived exception(descednat) FileNotFoundException inherited form IOException.
 *
 */
public class CheckedUncheckedExceptions {
	
}
