package Deitel.Cap3ClassessObjetoseMetodos.exercicios.a3_14date;

import Deitel.Cap3ClassessObjetoseMetodos.exercicios.a3_14date.Date;
import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {

        int dia;
        int mes;
        int ano;

        Date data = new Date();

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the day: ");
        dia = in.nextInt();
        data.setDia(dia);
        System.out.print("Enter the month: ");
        mes = in.nextInt();
        data.setMes(mes);
        System.out.print("Enter the year: ");
        ano = in.nextInt();
        data.setAno(ano);

        in.close();

        data.displayDate();
    }
}
