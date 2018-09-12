package BinarySearch;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MencariAngkaAcak {

    public static void main(String args[]) {
        int c, first, last, middle, n, search, array[];
        Scanner in = new Scanner(System.in);
        n = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Data"));
        System.out.println("#######HISTORY#######");
        System.out.println("Jumlah Data : " + n);
        array = new int[n];
        for (int a = 0; a < n; a++) {
            array[a] = new Random().nextInt(n + 1);
            System.out.println("Data ke-" + (a + 1) + " : " + array[a]);
            JOptionPane.showMessageDialog(null, "Data ke-" + (a + 1) + " : " + array[a]);

        }
        search = Integer.parseInt(JOptionPane.showInputDialog("Masukkan data yang ingin dicari : "));
        System.out.println("Data yang dicari : " + search);
        first = 0;
        last = n - 1;
        middle = (first + last) / 2;
        while (first <= last) {
            if (array[middle] < search) {
                first = middle + 1;
            } else if (array[middle] == search) {
                System.out.println("Terletak pada data ke-" + (middle + 1));
                JOptionPane.showMessageDialog(null, "Data " + search + " berada pada data ke-" + (middle + 1));

                break;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Data tidak ada");
            JOptionPane.showMessageDialog(null, "Data " + search + " tidak ada dalam data yang tersimpan  \n");

        }
        System.out.println("#######-DONE-########");
        System.out.println("By : Dimas Angkasa Nurindra (@angkasa27) ");
    }

}
