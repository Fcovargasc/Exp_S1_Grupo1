
package exp_s1_grupo1;

import java.util.Scanner;


public class Exp_S1_Grupo1 {

   
    public static void main(String[] args) {
       
        Scanner scanner= new Scanner (System.in);
        
        int opcion;
        String rut="",nombre="",apellidoPaterno="",apellidoMaterno="",domicilio="",comuna="";
        int telefono=0,cuenta=0,saldo=0,deposito=0,giro=0;
        
        
        System.out.println("Bienvenidos A Bank Boston");
        do{
        System.out.println("Presione");
        System.out.println("1 Para Registrar Cliente");
        System.out.println("2 Para Ver datos del Cliente");
        System.out.println("3 Para Depositar");
        System.out.println("4 Para Girar");
        System.out.println("5 Para Consultar saldo");
        System.out.println("6 Para Salir");
        opcion=scanner.nextInt();
        Cliente cliente =new Cliente(rut,nombre,apellidoPaterno,apellidoMaterno,domicilio,comuna,telefono,cuenta,saldo);

            switch(opcion){
                case 1: 
                    saldo=0;
                    System.out.println("Registro de clientes");
                    do{
                    System.out.println("Ingrese su rut con punto y guion");
                    scanner.nextLine();
                    rut=scanner.nextLine();
                    }while(rut.length()>12||rut.length()<11);
                    System.out.println("Ingrese su Nombre");
                    nombre=scanner.nextLine();
                    System.out.println("Ingrese Apellido Paterno");
                    apellidoPaterno=scanner.nextLine();
                    System.out.println("Ingrese Apellido Materno");
                    apellidoMaterno=scanner.nextLine();
                    System.out.println("Ingrese Su Domicilio");
                    domicilio=scanner.nextLine();
                    System.out.println("Ingrese Comuna");
                    comuna=scanner.nextLine();
                    System.out.println("Ingrese Numero de Telefono");
                    telefono=scanner.nextInt();
                    
                    System.out.println("Ingrese Numero de Cuenta");
                    cuenta=scanner.nextInt();
                    
                    break;
                case 2:
                    System.out.println("Datos del CLiente");
                    
                    System.out.println("Rut: "+cliente.getRut());
                    System.out.println("Nombre: "+cliente.getNombre());
                    System.out.println("Apellido Paterno: "+cliente.getApellidoPaterno());
                    System.out.println("Apellido Materno: "+cliente.getApellidoMaterno());
                    System.out.println("Domicilio: "+cliente.getDomicilio());
                    System.out.println("Comuna: "+cliente.getComuna());
                    System.out.println("Telefono: "+cliente.getTelefono());
                    System.out.println("Numero de Cuenta Corriente: "+cliente.getCuenta());
                    System.out.println("Saldo: "+cliente.getSaldo());
                    break;
                case 3:
                    System.out.println("Deposito");
                    do{
                    System.out.println("Ingrese monto a depositar");
                     deposito=scanner.nextInt();
                    }while(deposito<=0);
                     saldo+=deposito;
                    cliente.depositar();
                    System.out.println("Ud tiene un saldo actual de: "+saldo);
                    break;
                case 4:
                    System.out.println("Giro");
                    do{
                    System.out.println("Ingrese monto a Girar");
                    giro=scanner.nextInt();
                    }while(giro>=saldo||giro<0);
                    saldo-=giro;
                    cliente.girar();
                    System.out.println("Ud tiene un saldo actual de: "+saldo);
                    break;
                case 5: 
                    System.out.println("Consulta saldo");
                    cliente.consultaSaldo();
                    break;
                case 6 :
                    System.out.println("Saliendo... Gracias por venir a Bank Boston");
            }       
        
        }while(opcion!=6);
    
        
   
        
        
    }
    
    
    
}
