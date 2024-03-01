import java.util.LinkedList;
import java.util.Queue;

public class RNAtoProtiens {

    public String aminoAcids(String rna) {

        Queue<String> q = new LinkedList<>();

        //go through the rna string and add
        for (int i = 0; i < rna.length()-2; i+=3) {
            String triplet = rna.substring(i, i + 3);
            q.add(triplet);
        }

        String result = "";
        while(!q.isEmpty()) {
            String triplet = q.remove();

            if(triplet.equals("UUU")||triplet.equals("UUC")) {
                result = result + "F";
            }
            else if(triplet.equals("UUA")||triplet.equals("UUG")) {
                result = result + "L";
            }
            if(triplet.equals("UCU")||triplet.equals("UCC")) {
                result = result + "S";
            }
            if(triplet.equals("UAU")||triplet.equals("UAC")) {
                result = result + "Y";
            }
            if(triplet.equals("UAA")||triplet.equals("UAG")||triplet.equals("UGA")) {
                result = result + ".";
            }
            if(triplet.equals("UGU")||triplet.equals("UGC")) {
                result = result + "C";
            }
            if(triplet.equals("UGG")) {
                result = result + "W";
            }
            if(triplet.equals("CUU")||triplet.equals("CUC")||triplet.equals("CUA")||triplet.equals("CUG")) {
                result = result + "L";
            }
            if(triplet.equals("CCU")||triplet.equals("CCA")||triplet.equals("CCG")||triplet.equals("CCC")) {
                result = result + "P";
            }
            if(triplet.equals("CAU")||triplet.equals("CAC")) {
                result = result + "H";
            }
            if(triplet.equals("CAA")||triplet.equals("CAG")) {
                result = result + "Q";
            }
            if(triplet.equals("CGA")||triplet.equals("CGC")||triplet.equals("CGG")||triplet.equals("CGU")) {
                result = result + "R";
            }
            if(triplet.equals("AUU")||triplet.equals("AUA")||triplet.equals("AUC")) {
                result = result + "I";
            }
            if(triplet.equals("AUG")) {
                result = result + "M";
            }
            if(triplet.equals("ACG")||triplet.equals("ACU")||triplet.equals("ACA")||triplet.equals("ACC")) {
                result = result + "T";
            }
            if(triplet.equals("AAU")||triplet.equals("AAC")) {
                result = result + "N";
            }
            if(triplet.equals("AAA")||triplet.equals("AAG")) {
                result = result + "K";
            }
            if(triplet.equals("AGU")||triplet.equals("AGC")) {
                result = result + "S";
            }
            if(triplet.equals("AGG")||triplet.equals("AGA")) {
                result = result + "R";
            }
            if(triplet.equals("GUU")||triplet.equals("GUC")||triplet.equals("GUG")||triplet.equals("GUA")) {
                result = result + "V";
            }
            if(triplet.equals("GCC")||triplet.equals("GCA")||triplet.equals("GCG")||triplet.equals("GCU")) {
                result = result + "A";
            }
            if(triplet.equals("GAC")||triplet.equals("GAU")) {
                result = result + "D";
            }
            if(triplet.equals("GAA")||triplet.equals("GAG")) {
                result = result + "E";
            }
            if(triplet.equals("GGU")||triplet.equals("GGG")||triplet.equals("GGC")||triplet.equals("GGA")) {
                result = result + "G";
            }



        }
        return result;
    }


    public static void main(String[] args) {
        String input = "UAAAGAGAAGCCAGC";

        RNAtoProtiens r = new RNAtoProtiens();
        String dna = r.aminoAcids(input);
        System.out.println(dna);


    }

}