package datas;

/**
 *
 * @author Iasmin
 */

public class Data { //definição da classe Datas
    private int dia, mes, ano;
    //construtor
    //o 'this' referencia o atributo que está privado
    public Data(int day, int month, int year){
        
        if (day == 29 && month == 2){
            if (((year % 400 == 0) || (year % 4 == 0)) && (year % 100 != 0)){ //verifica se é ano bissexto
                this.dia = day;
            }
            else {
                this.dia = 0;
            }
        }
        
        else if (day > 30 && month == 4){
            this.dia = 0;
        } 
        else if (day > 30 && month == 6){
            this.dia = 0;        
        }
        else if (day > 30 && month == 9){
            this.dia = 0;  
        }
        else if (day > 30 && month == 11){
            this.dia = 0;  
        } else{
            this.dia = day;
        }
        if (month > 12 || month < 0){
            this.mes = 0;
        } else{
           this.mes = month; 
        }
        if (year < 0){
            this.ano = 0;
        } else{
            this.ano = year;
        }
        
    }
    public void setDia (int day){
        this.dia = day;  
    }
    public void setMes (int month){
        this.mes = month;
    }
    public void setAno (int year){
        this.ano = year;
    }
    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAno(){
        return this.ano;
    }
    public String toString(){
        if (this.dia <= 0 || this.mes <= 0 || this.ano <= 0){
            return "Data inválida";
        } 
        else {
            return getDia() + "/" + getMes() + "/" + getAno();
        }
    }
    
    public void proxDia(){
        this.dia++;
        if (this.dia > 29 && this.mes == 2){
            this.dia = 1;
            this.mes++;
        }
        else if (this.dia > 30 && this.mes == 4){
            this.dia = 1;
            this.mes++;
        }
        else if (this.dia > 30 && this.mes == 6){
            this.dia = 1;
            this.mes++;
        }
        else if (this.dia > 30 && this.mes == 9){
            this.dia = 1;
            this.mes++;
        }
        else if (this.dia > 30 && this.mes == 11){
            this.dia = 1;
            this.mes++;
        }
        else if(this.dia > 31){
            this.dia = 1;
            this.mes++;
        } 
        if(this.mes > 12){
        this.mes = 1; this.ano++;
        }
    }
}