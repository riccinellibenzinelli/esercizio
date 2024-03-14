import java.util.Scanner;
    public class Main{
        public static void main(String[]args){
        Scanner in = new.Scanner(System.in);
        String [] parole= new String[100];
        do{
            System.out.println("Scegli una tra le seguenti opzioni");
            System.out.println("1 - Aggiunta di un nome");
            System.out.println("2 - Cancellazione del singolo nome");
            System.out.println("3 - Ricerca sequenziale di un nome");
            System.out.println("4 - Visualizza nomi ripetuti con numero ripetizioni");
            System.out.println("5 - Modifica di un nome");
            System.out.println("6 - Visualizzazione di tutti i nomi presenti");
            System.out.println("7 - Ricerca del nome più lungo e più corto");
            System.out.println("8 - Cancellazione di tutte le occorrenze di un nome");
            System.out.println("0 - Uscita");
            int scelta = in.nextInt();
            switch(scelta){
                case 1:
                    conta++;
                    System.out.println("Inserire la parola da inserire");
                    String p=in.nextLine();
                    parole=isAggiunta(parole,p,conta);
                    break;
                case 2;
                case 3;
                case 4;
                case 5;
                case 6;
                        if(conta==0)
                        System.out.println("inserire almeno un valore prima");
                        }else{
                            System.out.println("Inserire la stringa da ricercare");
                            String sricerca=in.nextLine();
                        }
                case 7;
                case 8;
                case 0;
                        System.out.println("Ciao");
                        break;
                default;
                        System.out.println("Inserisci uno dei valori specificati");
                  }
         }while (scelta!=0);
        }
        private static String [] isAggiunta (String [] parole;String p, int conta){
            parole[conta-1]=p;
            return parole;
        }
        private static String [] isStampa (String [] parole; int i){
            String s=parole[i]
            return s;
        }
    }