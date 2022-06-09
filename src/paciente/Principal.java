package paciente;

public class Principal {

    public static void main(String[] args) {
       System.out.printf("%-10s%-10s%-10s%-10s%-10s%-20s%-35s%10s  %10s %-10s%-10s\n","DNI","NOMBRE", "1ER APELLIDO", "2DO APELLIDO", "TELEFONO", "CORREO", "DIRECCION",  "EDAD", "ESTATURA", "ESTADO CIVIL", "SEXO");
       System.out.printf("%-10s%-10s%-10s%-10s%-10s%-20s%-35s%10s  %10s %-10s%-10s\n","---","------", "------------", "------------", "--------", "------", "---------",  "----", "--------", "------------", "----");
//CREANDO UN OBJETO DE TIPO PACIENTE
       Paciente luis = new Paciente();
       luis.setDni("06717994Q");
       luis.setName("Luis");
       luis.setLName1("Ruiz");
       luis.setLName2("Perez");
       luis.setEmail("luisrperez@gmail.com");
       luis.setPhone("623414652");
       luis.setAddress("Calle de Las Musas 22");
       luis.setAge(25);
       luis.setHeight(1.72);
       luis.setGenre('M');
       luis.setIsMarried(true);
       //System.out.println(luis);
      luis.mostrar();
       
       
       Paciente miguel = new Paciente("Y9205748N",
                                        "Miguel",
                                        "Sanz",
                                        "Rodrigues",
                                        "604349984",
                                        "miguel123@gmail.com",
                                        "Calle Yecla 7",
                                        23,
                                        1.75,
                                        false,
                                        'M');
       //System.out.println(miguel);
       miguel.mostrar();
       
    }
    
}
