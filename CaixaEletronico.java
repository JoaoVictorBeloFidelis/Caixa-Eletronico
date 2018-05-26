public class CaixaEletronico
{
    private String codigo;
    private int numero;
    private String endereco;
    private String cidade;
    private String estado;
    private int saldo;
    private int saldoBandeja;
    public Bandeja bandeja1;
    public Bandeja bandeja2;
    public Bandeja bandeja3;
    public Bandeja bandeja4;


    public CaixaEletronico()
    {

        this.saldoBandeja = 0;
        this.saldo = 0;
        this.codigo = "AA123";
        this.numero = 1;
        this.endereco = "Rua Nicolau Cerone";
        this.cidade = "Campinas";
        this.estado = "Sao Paulo";

    }

    public static void main(String[]args) {
        CaixaEletronico caixa = new CaixaEletronico();


        caixa.bandeja1.ValorDaFace=10;
        caixa.bandeja1.QuantidadeDeCelula=10;

        caixa.bandeja2.ValorDaFace=20;
        caixa.bandeja2.QuantidadeDeCelula=50;

        caixa.bandeja3.ValorDaFace=100;
        caixa.bandeja3.QuantidadeDeCelula=20;

        caixa.bandeja4.ValorDaFace=50;
        caixa.bandeja4.QuantidadeDeCelula=30;
        caixa.saldo = Saldo(caixa);
        caixa.saldoBandeja = SaldoDaBandeja(caixa.bandeja1);
        Sacar(50,caixa.bandeja2);
    }
    public static int Saldo(CaixaEletronico caixa){


        int totalBandeja1 = caixa.bandeja1.ValorDaFace * caixa.bandeja1.QuantidadeDeCelula;

        int totalBandeja2 = caixa.bandeja2.ValorDaFace * caixa.bandeja2.QuantidadeDeCelula;

        int totalBandeja3 = caixa.bandeja3.ValorDaFace * caixa.bandeja3.QuantidadeDeCelula;

        int totalBandeja4 = caixa.bandeja4.ValorDaFace * caixa.bandeja4.QuantidadeDeCelula;

        caixa.saldo = totalBandeja1+totalBandeja2+totalBandeja3+totalBandeja4;

        return caixa.saldo;


    }
    public static int SaldoDaBandeja(Bandeja bandeja){

        int totalBandeja = bandeja.ValorDaFace * bandeja.QuantidadeDeCelula;
        return totalBandeja;
    }

    public static void Sacar(int valor, Bandeja bandeja){

        int total = bandeja.ValorDaFace * bandeja.QuantidadeDeCelula;

        if (total >= valor) {

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

class Bandeja {
    public int ValorDaFace;
    public int QuantidadeDeCelula;
}
