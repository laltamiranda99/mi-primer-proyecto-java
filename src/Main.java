import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //UNA EMPRESA DESEA REGISTRAR LA INFORMACION DE CADA EMPLEADO
        // PARA ELLO UN EMPLEADO DEBE INGRESAR CON SU USUARIO Y CONTRASEÑA
        // UNA VES INGRESADO EL EMLEADO DEBE REGISTRAR LA SIGUIENTE INFORMACION
        // 1 NOMBRE COMPLETO
        // 2 DOCUMENTO DE IDENTIDAD
        // 3 VALOR DE LA HORA
        // 3 CANTIDAD DE HORA
        // 4 SELECCIONAR UN DI DE DESCANSO A LA SEMANA (L-V)
        // * EL SISTEMA DEBE MOSTRAR SU SALARIO AL EMPLEADO
        // SU SALARIO NETO, SALARI BRUTO, DEDUCCION POR PENSION, DEDUCCION
        // POR SALUD, AUXILIO DE TRANSPORTE (SI APLICA) Y BONIFICACION DEL 10%
        // SI NO APRUEBA 2 SLMMV (SIN INCLUIR AUXILIO DE TRANSPORTE)
        // SI NO SUPERA 2SMMLV (SIN INCLUIR AUXILIO DE TRAMSPORTE)
        // TODA LA INFORMACION DEL EMPLEADO SE DEBE MOSTRAR EN UN MENSAJE DESCRIPTIVO

        //definicion y asignacion de variables

        Scanner sc = new Scanner(System.in) ;
                String nombreEmpleado = "";
                String documentoIdentidad = "";
                String diaDescanso = "";
                String usuarioEmpleado = "";
                String contraseñaUsuario = "";
                double salarioBruto = 0;
                double salarioNeto = 0;
                double retencionSalud = 0;
                double retencionPension =0;
                double valorHora = 0;
                double cantidadHoras = 0;
                double bonificacionEmpleado = 0;
                int auxilioTransporte = 200000;

        System.out.println("Ingrese su usuario: ");
        usuarioEmpleado  = sc.nextLine(); // EL "nextLine" sirve PARA CAPTURAR TEXTO
        System.out.println("Ingrese contraseña: ");
        contraseñaUsuario = sc.nextLine();

        if (usuarioEmpleado. equals("admin") && contraseñaUsuario.equals("admin")) {        // el "if"     if( ==) palabra reservada para decir si
            System.out.println("Ha ingresado de forma correcta");

        } else {
            System.out.println("Error de credenciales");


        }

    }
}


