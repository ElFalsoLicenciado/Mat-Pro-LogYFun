public class Ejer0 {

    public static int dineros = 678;

    public static void main(String[] args) {
        int[] cambio = {-1,-1,-1,-1,-1};
        int[] tipos = {100,50,10,5,2,1};

        for (int i = 0; i < 7; i++){
            cambio[i] = obtenerBilletes(dineros, tipos[i]);
            for (int j = 0; j < 6; j++){
                cambio[j+1] = obtenerBilletes(dineros, tipos[j+1]);
            }
        }
    }

    public static int obtenerBilletes(int dinero, int billete){
        int billetes = 0;

        while ((dinero - billete) > 0) {
            billetes += 1;
            dinero = dinero - billete;
        }

        return billetes;
    }
}
