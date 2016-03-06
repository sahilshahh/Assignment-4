/* Shah, Sahil and Frederick, Cameron
 * ss63683 and csf596 
 * EE 422C - Assignment 4*/

package assignment4;

public class NoSuchLadderException extends Exception
{
    private static final long serialVersionUID = 1L;

    public NoSuchLadderException(String message)
    {
        super(message);
    }
}
