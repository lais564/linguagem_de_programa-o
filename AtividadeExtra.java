package Darliane ;
import java.text.DecimalFormat;
import java.util.Locale;
/*
  Alunos: Darliane Arza de Oliveira, Jose Javier Paz Vaca, Kalondra Avaroma Vieira,
Lais Carvalho de Lima, Levi dos Santos Oliveira, Raquelly Tuye Hortiz.
*/
public class AtividadeExtra {
    
    public static void main(String[] args) {
        
    	byte variavelByte001 = 126;
		short variavelShort001 = 130;
		int variavelInt001 = 164654321;
		long variavelLong001 = 2147483648l;
		float variavelFloat001 = 99.9876F;
		double variavelDouble001 = 7645321.12345678;
		boolean variavelBoolean001 = (10<30) && (31<30);
		boolean variavelBoolean002 = (10<30) || (31<30);
		boolean variavelBoolean003 = !(10<30) || (31<30);
		char variavelChar001 = 'A';
		char variavelChar002 = 65;
		String nomeProfessorLogica = "Juliano";
		
		DecimalFormat dfAmericanoDuasCasas = (DecimalFormat)DecimalFormat.getInstance( new Locale("en", "US"));
		dfAmericanoDuasCasas.applyPattern("###,###,##0.00");
		
		DecimalFormat dfBrasileiroDuasCasas = (DecimalFormat)DecimalFormat.getInstance( new Locale("pt", "BR"));
		dfBrasileiroDuasCasas.applyPattern("###,###,##0.00");

		DecimalFormat dfAmericanoTresCasas = (DecimalFormat)DecimalFormat.getInstance( new Locale("en", "US"));
		dfAmericanoTresCasas.applyPattern("###,###,##0.000");
		
		DecimalFormat dfBrasileiroTresCasas = (DecimalFormat)DecimalFormat.getInstance( new Locale("pt", "BR"));
		dfBrasileiroTresCasas.applyPattern("###,###,##0.000");
		      
		      
		System.out.print("**** Estágio 01 - Mostrando valores com a função 'print'\n\n");
		System.out.print("  Valor da variável'variavelByte001': " + variavelByte001 +"\n");
		System.out.print("  Valor da variavel 'variavelShort001': " + variavelShort001+"\n");
		System.out.print("  Valor da variável'variavelByte001': " + variavelByte001 + "\n");
		System.out.print("  Valor da variavel 'variavelInt001': " + variavelInt001+"\n");
		System.out.print("  Valor da variavel 'variavelLong001': " + variavelLong001+"\n");
		System.out.print("  Valor da variavel 'variavelFloat001 (sem formato)': " + variavelFloat001 +"\n");
		System.out.print("  Valor da variavel 'variavelFloat001 (formato brasileiro)': " + dfBrasileiroDuasCasas.format(variavelFloat001) +"\n");
		System.out.print("  Valor da variavel 'variavelFloat001 (formato amerciano)': " + dfAmericanoDuasCasas.format(variavelFloat001) +"\n");
		System.out.print("  Valor da variavel 'variavelDouble001 (sem formato)': " + variavelDouble001 +"\n");
		System.out.print("  Valor da variavel 'variavelDouble001 (formato brasileiro)': " + dfBrasileiroTresCasas.format(variavelDouble001) +"\n");
		System.out.print("  Valor da variavel 'variavelDouble001 (formato amerciano)': " + dfAmericanoTresCasas.format(variavelDouble001) +"\n");
		System.out.print("  Valor da variavel 'variavelBoolean001': " + variavelBoolean001 + "\n");
		System.out.print("  Valor da variavel 'variavelBoolean002': " + variavelBoolean002 + "\n");
		System.out.print("  Valor da variavel 'variavelBoolean003': " + variavelBoolean003 + "\n");
		System.out.print("  Valor da variável 'variavelChar001': " + variavelChar001 + "\n");
		System.out.print("  Valor da variável 'variavelChar002': " + variavelChar002 + "\n");
		System.out.print("  Valor da variável 'nomeProfessorLogica': " + nomeProfessorLogica + "\n\n");
		      
		System.out.println("**** Estágio 02 - Mostrando valores com a função 'println' " +"\n");
		System.out.println("  Valor da variável'variavelByte001': " + variavelByte001);
		System.out.println("  Valor da variavel 'variavelShort001': " + variavelShort001);
		System.out.println("  Valor da variavel 'variavelByte001':  " + variavelByte001);
		System.out.println("  Valor da variavel 'variavelInt001': " + variavelInt001);
		System.out.println("  Valor da variavel 'variavelLong001': " + variavelLong001);
		System.out.println("  Valor da variavel 'variavelFloat001 (sem formato)': " + variavelFloat001);
		System.out.println("  Valor da variavel 'variavelFloat001 (formato brasileiro)': " + dfBrasileiroDuasCasas.format(variavelFloat001));
		System.out.println("  Valor da variavel 'variavelFloat001 (formato amerciano)':  " + dfAmericanoDuasCasas.format(variavelFloat001));
		System.out.println("  Valor da variavel 'variavelDouble001 (sem formato)': " + variavelDouble001);
		System.out.println("  Valor da variavel 'variavelDouble001 (formato brasileiro)': " + dfBrasileiroTresCasas.format(variavelDouble001));
		System.out.println("  Valor da variavel 'variavelDouble001 (formato amerciano)': " + dfAmericanoTresCasas.format(variavelDouble001));
		System.out.println("  Valor da variavel 'variavelBoolean001': " + variavelBoolean001);
		System.out.println("  Valor da variavel 'variavelBoolean002': " + variavelBoolean002);
		System.out.println("  Valor da variavel 'variavelBoolean003': " + variavelBoolean003);
		System.out.println("  Valor da variavel 'variavelChar001': " + variavelChar001);
		System.out.println("  Valor da variavel 'variavelChar002': " + variavelChar002);
		System.out.println("  Valor da variavel 'nomeProfessorLogica': " + nomeProfessorLogica + "\n");    
        
       System.out.printf("**** Estágio 03 - Mostrando valores com a função 'printf' \n\n");
       System.out.printf("  Valor da variável 'variavelByte001': %d \n", variavelByte001);    
       System.out.printf("  Valor da variavel 'variavelShort001': %d \n", variavelShort001);
       System.out.printf("  Valor da variável 'variavelByte001': %d \n", variavelByte001);
       System.out.printf("  Valor da variavel 'variavelInt001': %d \n", variavelInt001);
       System.out.printf("  Valor da variavel 'variavelLong001': %d \n", variavelLong001);
       System.out.printf("  Valor da variavel 'variavelFloat001 (sem formato)': %f \n", variavelFloat001);
       System.out.printf("  Valor da variavel 'variavelFloat001 (formato brasileiro)': %s \n", dfBrasileiroDuasCasas.format(variavelFloat001));
       System.out.printf("  Valor da variavel 'variavelFloat001 (formato americano)': %s \n", dfAmericanoDuasCasas.format(variavelFloat001));
       System.out.printf("  Valor da variavel 'variavelDouble001 (sem formato)': %f \n", variavelDouble001);
       System.out.printf("  Valor da variavel 'variavelDouble001 (formato brasileiro)': %s \n", dfBrasileiroTresCasas.format(variavelDouble001));
       System.out.printf("  Valor da variavel 'variavelDouble001 (formato americano)': %s \n", dfAmericanoTresCasas.format(variavelDouble001));
       System.out.printf("  Valor da variavel 'variavelBoolean001': %b \n", variavelBoolean001);
       System.out.printf("  Valor da variavel 'variavelBoolean002': %b \n", variavelBoolean002);
       System.out.printf("  Valor da variavel 'variavelBoolean003': %b \n", variavelBoolean003);
       System.out.printf("  Valor da variavel 'variavelChar001': %c \n", variavelChar001);
       System.out.printf("  Valor da variavel 'variavelChar002': %c \n", variavelChar002);
       System.out.printf("  Valor da variavel 'nomeProfessorLogica': %s \n", nomeProfessorLogica);
    }
}