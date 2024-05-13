import java.util.Scanner;

public class funciones {
    public static void main(String[] args) {
        System.out.println("           ");
        System.out.println(Spaces(10));
        
    }

    //Regresa una entrada por teclado desplegando un texto
    public static String input(String txt) {
        Scanner value = new Scanner(System.in);

        System.out.print(txt);
        String txtInput;
        txtInput = value.nextLine();
        return txtInput;
    }

    //Hace pausa y espera un ENTER desplegando un texto
    public static void waitKey(String txt) {
        Scanner key = new Scanner(System.in);
        System.out.print(txt);
        key.nextLine();
    }

    //Limpiar pantalla
    public static void clear() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    public static Double largNum(Double[] arrayNum){
        Double largestNum = arrayNum[0] ;
        for(int i=1; i <= (arrayNum.length-1); i++)
            if (largestNum < arrayNum[i]) 
                largestNum = arrayNum[i];
        
        return largestNum;
    }

    public static String Spaces(int cant){
        String txtSpace = "";
        for (int i = 0; i < cant; i++) txtSpace+=" ";
        return txtSpace;
    }

    public static String correctSpace(Double num, String simbol, int maxLength){
        String strNum = String.valueOf(num);
        int spaces = maxLength - strNum.length();
        String newText = strNum + simbol + spaces;

        return newText;
    }
    
}
