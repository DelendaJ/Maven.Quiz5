package rocks.zipcode.io.quiz4.objectorientation;


/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    private Character delimeter;
    private String assembler = "";


    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
    }

    public StringAssembler append(String str) {

       assembler += str + delimeter;
       return this;
    }

    public String assemble() {

        return assembler.substring(0, assembler.length()-1) ;
    }
}
