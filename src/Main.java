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
                double valorSalarioMinimo = 0;
                int auxilioTransporte = 200000;

        System.out.println("Ingrese su usuario: ");
        usuarioEmpleado  = sc.nextLine(); // EL "nextLine" sirve PARA CAPTURAR TEXTO
        System.out.println("Ingrese contraseña: ");
        contraseñaUsuario = sc.nextLine();

        if (usuarioEmpleado. equals("admin") && contraseñaUsuario.equals("admin")) {        // el "if"     if( ==) palabra reservada para decir si
            System.out.println("Ha ingresado de forma correcta");
            System.out.println("Ingrese el nombre del empleado: ");
            nombreEmpleado = sc.nextLine();
            System.out.println("Ingrese su documento de identidad: ");
            documentoIdentidad = sc.nextLine();
            System.out.println("Ingrese el dia de descanso (lunes - viernes): ");
            diaDescanso = sc.nextLine();
            System.out.println("Ingrese el valor de la hora: ");
            valorHora = sc.nextDouble();   // el nextDouble se pone por que se agrego un numero a la variable
            System.out.println("Ingrese la cantidad de horas trabajadas: ");
            cantidadHoras = sc.nextDouble();
            salarioBruto = valorHora * cantidadHoras;
            System.out.println("Ingrese valor salario minimo para este año");
            valorSalarioMinimo = sc.nextDouble();

            if (salarioBruto > (valorSalarioMinimo*2)) {
                bonificacionEmpleado = 0;
            } else {
                bonificacionEmpleado = salarioBruto*0.1;
                auxilioTransporte = 200000;
                salarioNeto = salarioBruto + bonificacionEmpleado + auxilioTransporte;
                System.out.println("El salario neto es:" + salarioNeto);

            }

        } else {
            System.out.println("Error de credenciales");


        }

    }
}


