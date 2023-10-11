package Deitel.Cap3ClassessObjetoseMetodos.exercicios.a3_14date;

public class Date {
    int dia;
    int mes;
    int ano;

    public Date(){
        int dia = 0;
        int mes = 0;
        int ano = 0;
    }

    public void displayDate (){
        if (this.mes < 10){
            System.out.printf("%d / 0%d / %d", this.dia, this.mes, this.ano);
        } else {
            System.out.printf("%d / %d / %d", this.dia, this.mes, this.ano);
        }
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public int getDia(){
        return dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public int getMes(){
        return mes;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int ano(){
        return ano;
    }
}