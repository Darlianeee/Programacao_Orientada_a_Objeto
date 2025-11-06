public class Controle {

    public void mostrarCanal(TV tv) {
        if (tv.ligada == true) {
            System.out.println("Canal atual: " + tv.canal);
        } else {
            System.out.println("Ligue a TV primeiro.");
        }
    }

    public void canalMais(TV tv) {
        if (tv.ligada == true) {
            tv.canal = tv.canal + 1; 
            System.out.println("Canal: " + tv.canal);
        }
    }

    public void canalMenos(TV tv) {
        if (tv.ligada == true) {
            if (tv.canal > 1) {
                tv.canal = tv.canal - 1;
            }
            System.out.println("Canal: " + tv.canal);
        }
    }

    public void escolherCanal(TV tv, int numero) {
        if (tv.ligada == true) {
            tv.canal = numero;      
            System.out.println("Canal alterado para: " + tv.canal);
        }
    }

    public void aumentarVolume(TV tv) {
        if (tv.ligada == true) {
            tv.volume = tv.volume + 1;
            System.out.println("Volume: " + tv.volume);
        }
    }

    public void diminuirVolume(TV tv) {
        if (tv.ligada == true) {
            tv.volume = tv.volume - 1;
            System.out.println("Volume: " + tv.volume);
        }
    }
}