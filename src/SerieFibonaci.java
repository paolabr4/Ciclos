import javax.swing.*;
import java.net.StandardSocketOptions;

public class SerieFibonaci {
        public static void main(String[] args) {
            int cont = 0;
            int i = 0;
            int j = 1;
            int k = i+j;

            System.out.println("Serie Fibonaci");
            cont= Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos numeros de la serie desea generar.? "));

            if (cont==1){
                System.out.print(+i);
            }
           else if (cont==2){
                System.out.print(+i);
                System.out.print(" ,"+j);
            }
           else if (cont>=3) {
                System.out.print(+i);
                System.out.print(" ," + j);
                System.out.print(" ," + k);

                for (int c = 0; c < cont - 3; c++) {
                    i = j;
                    j = k;
                    k = i + k;
                    System.out.print(" ," + k);

                }
            }


        }
    }
