
public class QuadradoMagico {

    public static boolean ehQuadradoMagico(int[][] matriz) {
        if (matriz.length != matriz[0].length) {
            return false;
        }

        int n = matriz.length;
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        int somaReferencia = 0;
        for (int i = 0; i < n; i++) {
            somaReferencia += matriz[0][i];
        }

        for (int i = 0; i < n; i++) {
            int somaLinha = 0;
            for (int j = 0; j < n; j++) {
                somaLinha += matriz[i][j];
            }
            if (somaLinha != somaReferencia) {
                return false;
            }
        }

        for (int i = 0; i < n; i++) {
            int somaColuna = 0;
            for (int j = 0; j < n; j++) {
                somaColuna += matriz[j][i];
            }
            if (somaColuna != somaReferencia) {
                return false;
            }
        }

        for (int i = 0; i < n; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }

        for (int i = 0; i < n; i++) {
            somaDiagonalSecundaria += matriz[i][n - 1 - i];
        }

        if (somaDiagonalPrincipal != somaReferencia || somaDiagonalSecundaria != somaReferencia) {
            return false;
        }

        boolean[] encontrado = new boolean[n * n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int valor = matriz[i][j];
                if (valor < 1 || valor > n * n || encontrado[valor]) {
                    return false;
                }
                encontrado[valor] = true;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] quadradoMagico = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };

        int[][] quadradoNaoMagico = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 9}
        };

        System.out.println("Quadrado magico? " + ehQuadradoMagico(quadradoMagico));
        System.out.println("Quadrado magico? " + ehQuadradoMagico(quadradoNaoMagico));
    }
}
