/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab10
 * Author: Sumeyye Acar
 * Id: 22103640
*/

public class Notebook {
    private Page[] notebook;
    private int currentPage = 0;

    //Constructor
    public Notebook( int pageCount, int pageSize ) {
        this.currentPage = pageCount;
        notebook = new Page[pageCount];
        for( int i = 0; i < pageCount; i++ ) {
            notebook[i] = new Page(pageSize);
        }
    }

    /**
     * this method writes the entered note to the current page
     * it stops writing only if: 
     * 1-contents array length is exceeded  
     * 2-parameter string's length is exceeded.
     * @param write (entered string)
     */
    public void writeNote( String write ) {
        int x = 0;
        while( x < this.currentPage ) {
            if( notebook[x].toString().charAt(0) == '-' ) {
                notebook[x].writePage( write );
                break;
            }
            else if( notebook[x].toString().charAt(0) != '-' ) {
                x++;
            }
        }
    }

    //prints the page with its page number
    public void printNotebook() {
        for( int j = 0; j < this.currentPage; j++ ) {
            System.out.println( "( " + j + " ) " + notebook[j].toString() + "\n" );
        }
    }
}
