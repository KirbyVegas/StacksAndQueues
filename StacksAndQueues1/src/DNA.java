import java.util.Arrays;

public class DNA {

    public String DNAtoRNA(String input) {

        String[] array = input.split("");
        for(int i = 0; i< array.length; i++) {
            if(array[i].equals("T") ) {
                array[i] = "U";
            }
        }

        String result = "";
        for(int j = 0; j<array.length;j++) {
            result = result + array[j];
        }
        return result;

    }


    public static void main(String[] args) {

        String input = "CTTTGGGACTAGTAACCCATTTCGGCT";
        DNA d = new DNA();
        String result = d.DNAtoRNA(input);
        System.out.println(result);


    }



}
