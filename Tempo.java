public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Tempo(int hora, int minuto, int segundo) {
        if (isValido(hora, minuto, segundo)) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    public Tempo(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    public Tempo(int hora) {
        this(hora, 0, 0);
    }

    private boolean isValido(int hora, int minuto, int segundo) {
        return hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60 && segundo >= 0 && segundo < 60;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public boolean alterarHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
            return true;
        }
        return false;
    }

    public boolean alterarMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
            return true;
        }
        return false;
    }

    public boolean alterarSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
            return true;
        }
        return false;
    }

    public long emSegundos() {
        return hora * 3600 + minuto * 60 + segundo;
    }

    public long diferenca(Tempo outroTempo) {
        long tempoAtualEmSegundos = this.emSegundos();
        long outroTempoEmSegundos = outroTempo.emSegundos();
        return Math.abs(tempoAtualEmSegundos - outroTempoEmSegundos);
    }

    public static void main(String[] args) {
        Tempo tempo1 = new Tempo(7, 30, 0);
        Tempo tempo2 = new Tempo(1, 0, 0);

        System.out.println("Tempo 1: " + tempo1);
        System.out.println("Tempo 2: " + tempo2);

        System.out.println("Diferenca em segundos: " + tempo1.diferenca(tempo2));

        tempo1.alterarHora(10);
        tempo1.alterarMinuto(45);
        tempo1.alterarSegundo(30);

        System.out.println("Tempo 1 apos alteracoes: " + tempo1);
        System.out.println("Tempo 1 em segundos: " + tempo1.emSegundos());
    }
}
