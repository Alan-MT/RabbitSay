public class rabbitsay {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("ERROR: Debe proporcionar un mensaje como argumento.");
            return;
        }

        String mensaje = args[0];
        String mensajeFormateado = formatearMensaje(mensaje, 20);
        String[] lineas = mensajeFormateado.split("\n");
        int longitudLinea = lineas[0].length();
        String marco = generaMarco('-', longitudLinea + 2);

        System.out.println(" " + marco);
        for (int i = 0; i < lineas.length; i++) {
            if (mensaje.length() <= 20) {
                System.out.println("<" + lineas[i] + " >");
            } else {
                if (i == 0) {
                    System.out.println("/ " + lineas[i] + " \\");
                } else if (i == lineas.length - 1) {
                    System.out.println("\\ " + lineas[i] + " /");
                } else {
                    System.out.println("| " + lineas[i] + " |");
                }
            }
        }
        System.out.println(" " + marco);
        System.out.println("       \\     ");
        System.out.println("         \\     (\\-/-)");
        System.out.println("              (='.'=)");
        System.out.println("              (\")-(" + ")o");
        System.out.println("               ^^ ^^");
    }

    public static String generaMarco(char linea, int tamanio) {
        StringBuilder contador = new StringBuilder();
        for (int i = 0; i < tamanio; i++) {
            contador.append(linea);
        }
        return contador.toString();
    }

    public static String formatearMensaje(String mensaje, int caracteresPorLinea) {
        StringBuilder mensajeFormateado = new StringBuilder();
        int contador = 0;
        for (int i = 0; i < mensaje.length(); i++) {
            mensajeFormateado.append(mensaje.charAt(i));
            contador++;
            if (contador == caracteresPorLinea && i != mensaje.length() - 1) {
                mensajeFormateado.append("\n");
                contador = 0;
            }
        }
        return mensajeFormateado.toString();
    }
}
