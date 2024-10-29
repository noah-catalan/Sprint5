public class Revisio {

    public static void main(String[] args) {
        // Llamar a cada ejercicio
        exercici1();
        exercici2();
        exercici3();
    }

    // Exercici 1
    public static void exercici1() {
        int edat = 8; // Ejemplo de edad
        int cicle = -1; // Inicialización de cicle
        int curs = -1; // Inicialización de curs

        if (edat < 3) {
            System.out.println("Avis: És massa petit.");
        } else if (edat < 6) {
            cicle = 0;
        } else if (edat < 7) {
            curs = 1;
            cicle = 1;
        } else if (edat < 8) {
            curs = 2;
            cicle = 1;
        } else if (edat < 9) {
            curs = 3;
            cicle = 2;
        } else if (edat < 10) {
            curs = 4;
            cicle = 2;
        } else if (edat < 11) {
            curs = 5;
            cicle = 3;
        } else if (edat < 12) {
            curs = 6;
            cicle = 3;
        } else {
            System.out.println("Avis: És massa gran.");
        }

        switch (cicle) {
            case 0:
                System.out.println("Es d'educació infantil.");
                break;
            case 1:
                System.out.println("Es d'educació primaria. Cicle inicial.");
                break;
            case 2:
                System.out.println("Es d'educació primaria. Cicle mitjà.");
                break;
            case 3:
                System.out.println("Es d'educació primaria. Cicle superior.");
                break;
        }

        if (curs != -1) {
            System.out.println("Curs: " + curs);
        }
    }

    // Exercici 2
    public static void exercici2() {
        double notaProva = 6.5; // Nota de la prueba
        int numeroLliuraments = 65; // Número de entregas
        final int TOTAL_LLIURAMENTS = 100; // Total de entregas
        double notaPractiques = 8; // Nota de prácticas
        boolean noSeguidaAC = false;
        double notaLLiuraments = 0;

        if (notaProva < 7) {
            System.out.println("Avis: Està suspés per prova final.");
        } else {
            if (numeroLliuraments < 0.7 * TOTAL_LLIURAMENTS) {
                System.out.println("Avis: Està suspés. No has seguit avaluació contínua.");
                noSeguidaAC = true;
            } else {
                if (numeroLliuraments == TOTAL_LLIURAMENTS) {
                    notaLLiuraments = 10;
                } else if (numeroLliuraments >= 0.9 * TOTAL_LLIURAMENTS) {
                    notaLLiuraments = 8;
                } else if (numeroLliuraments >= 0.8 * TOTAL_LLIURAMENTS) {
                    notaLLiuraments = 6;
                } else if (numeroLliuraments >= 0.7 * TOTAL_LLIURAMENTS) {
                    notaLLiuraments = 4;
                }

                double notaFinal = 0.2 * notaProva + 0.1 * notaLLiuraments + 0.7 * notaPractiques;

                if (notaFinal < 5) {
                    if (noSeguidaAC) {
                        System.out.println("Recomanacions: Cal seguir avaluació contínua.");
                    } else {
                        System.out.println("Recomanacions: Fes els exercicis preparatoris per a la PAF2.");
                    }
                }
            }
        }
    }

    // Exercici 3
    public static void exercici3() {
        double temperatura = 39; // Ejemplo de temperatura
        int edat = 5; // Ejemplo de edad
        double dosisParacetamol;

        if (temperatura < 38) {
            System.out.println("El nen està bé.");
        } else if (temperatura < 39) {
            System.out.println("Es recomanable donar-li un bany per baixar temperatura.");
        } else {
            if (edat < 3) {
                System.out.println("Has de consultar al médico.");
            } else if (edat < 12) {
                int pes = 10; // Ejemplo de peso en kilos
                dosisParacetamol = 15 * pes; // Cálculo de dosis
                System.out.println("Avis: Cal donar-li: " + dosisParacetamol + " mg cada 8h.");
            } else {
                dosisParacetamol = 500; // Dosis para mayores de 12
                System.out.println("Avis: Cal donar-li: " + dosisParacetamol + " mg cada 8h.");
            }
        }

        if (temperatura >= 40) {
            System.out.println("Avis: Per més de 40 cal portar-lo a l'hospital.");
        }
    }
}
