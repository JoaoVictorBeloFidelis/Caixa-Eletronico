public class CaixaEletronico{
    private String codigo;
    private int numero;
    private String endereco;
    private String cidade;
    private String estado;
    private int saldo;
    private int saldoBandeja;
    private Bandeja bandeja1;
    private Bandeja bandeja2;
    private Bandeja bandeja3;
    private Bandeja bandeja4;
    
    public CaixaEletronico() {
    
    saldo = "0";
    codigo = "AA123";
    numero = "1";
    endereco = "Rua Nicolau Cerone";
    cidade = "Campinas";
    estado = "Sao Paulo";
   
    Bandeja(){
        
    }
    
     Bandeja bandeja1 = new Bandeja(){
     bandeja1.ValorDaFace=10;
     bandeja1.QuantidadeDeCelula=10;
     };
  
     Bandeja bandeja2 = new Bandeja();
     bandeja2.ValorDaFace=20;
     bandeja2.QuantidaDeDeCelula=50;

     Bandeja bandeja3 = new Bandeja();
     bandeja3.ValorDaFace=100;
     bandeja3.QuantidadeDeCelula=20; 

     private Bandeja bandeja4 = new Bandeja();
     bandeja4.ValorDaFace=50;
     bandeja4.QuantidadeDeCelula=30;
     }
    


   public static void main(String[]args) {
    
   Bandeja bandeja1 = new Bandeja();
   Bandeja bandeja2 = new Bandeja();
   Bandeja bandeja3 = new Bandeja();
   Bandeja bandeja4 = new Bandeja();
   CaixaEletronico();
   saldo = Saldo();
   saldoDaBandeja = SaldoDaBandeja(bandeja1);
    Sacar(50,bandeja2);
    
}
      
       public int Saldo(){

     int totalBandeja1 = bandeja1.ValorDaFace * bandeja1.QuantidadeDeCelula;

     int totalBandeja2 = bandeja2.ValorDaFace * bandeja2.QuantidadeDeCelula;

     int totalBandeja3 = bandeja3.ValorDaFace * bandeja3.QuantidadeDeCelula;

     int totalBandeja4 = bandeja4.ValorDaFace * bandeja4.QuantidadeDeCelula;

       saldo = totalBandeja1+totalBandeja2+totalBandeja3+totalBandeja4; 

     return saldo; 


   }
     public int SaldoDaBandeja(Bandeja bandeja){

    int totalBandeja = bandeja.ValorDaFace * bandeja1.QUantidadeDeCelula;
    return totalBandeja;
}

  public void Sacar(int valor,Bandeja bandeja){

    int total = bandeja.ValorDaFace * bandeja.QuantidadeDeCelula; 
   
      if (total <= valor) { 

        total = total - valor;
        

        int[] cedulas = {100,50,25,10};

        for(int i = 0; i < cedulas.length; i++){
	    if( valor >= cedulas[i] ){
			System.out.println( (int)valor/cedulas[i] + " notas de " + cedulas[i]);
				valor = valor % cedulas[i];

	                          } 
       }
      }
       else {
          	System.out.println("ValorDoSaque e maior que o saldo");
     
	}
     
    } 
}
       




    


       

  
