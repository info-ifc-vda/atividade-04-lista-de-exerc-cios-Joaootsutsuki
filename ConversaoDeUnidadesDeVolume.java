public class ConversaoDeUnidadesDeVolume {

    public static double litrosParaCentimetrosCubicos(double litros) {
        return litros * 1000;
    }

    public static double centimetrosCubicosParaLitros(double centimetrosCubicos) {
        return centimetrosCubicos / 1000;
    }

    public static double metrosCubicosParaLitros(double metrosCubicos) {
        return metrosCubicos * 1000;
    }

    public static double litrosParaMetrosCubicos(double litros) {
        return litros / 1000;
    }

    public static double metrosCubicosParaPesCubicos(double metrosCubicos) {
        return metrosCubicos * 35.32;
    }

    public static double pesCubicosParaMetrosCubicos(double pesCubicos) {
        return pesCubicos / 35.32;
    }

    public static double galoesAmericanosParaPolegadasCubicas(double galoesAmericanos) {
        return galoesAmericanos * 231;
    }

    public static double polegadasCubicasParaGaloesAmericanos(double polegadasCubicas) {
        return polegadasCubicas / 231;
    }

    public static double galoesAmericanosParaLitros(double galoesAmericanos) {
        return galoesAmericanos * 3.785;
    }

    public static double litrosParaGaloesAmericanos(double litros) {
        return litros / 3.785;
    }

    public static void main(String[] args) {
        double litros = 10;
        double metrosCubicos = 2;
        double pesCubicos = 5;
        double galoesAmericanos = 3;

        System.out.println(litros + " Litros = " + litrosParaCentimetrosCubicos(litros) + " Centimetros Cubicos");
        System.out.println(metrosCubicos + " Metros Cubicos = " + metrosCubicosParaLitros(metrosCubicos) + " Litros");
        System.out.println(metrosCubicos + " Metros Cubicos = " + metrosCubicosParaPesCubicos(metrosCubicos) + " Pes Cubicos");
        System.out.println(galoesAmericanos + " Galoes Americanos = " + galoesAmericanosParaPolegadasCubicas(galoesAmericanos) + " Polegadas Cubicas");
        System.out.println(galoesAmericanos + " Galoes Americanos = " + galoesAmericanosParaLitros(galoesAmericanos) + " Litros");
        System.out.println(litros + " Litros = " + litrosParaGaloesAmericanos(litros) + " Galoes Americanos");
    }
}
