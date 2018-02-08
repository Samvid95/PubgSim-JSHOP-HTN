import JSHOP2.*;

public class TracePrint implements Calculate {
  public Term call(List l) {
  	System.out.println(l);
  	
  	// In the JSHOP 2 implementation null represents false while everything else
  	// represents true. So return the number 1.0 as a way to say "this evaluates to true".
  	// This is what the < > = etc. functions in JSHOP2.StdLib do.
  	return new TermNumber(1.0); 
  }
}