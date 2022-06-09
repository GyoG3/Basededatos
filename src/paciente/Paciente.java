/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paciente;

/**
 *
 * @author Curso Mañana
 */
public class Paciente {
    //(1)VARIABLES DE INSTANCIAS (ATRIBUTOS)
    String dni;
    String name;
    String lname1;
    String lname2;
    String phone;
    String email;
    String address;
    int age;
    double height;
    boolean ismarried;
    char genre;
    
    //(2)CONSTRUCTORES (SIRVEN PARA ASIGNARLE VALORES A LOS ATRIBUTOS)
    
    //(2.1)Constructor con todos los atributos
    public Paciente(String dni, String name, String lname1, String lname2, String phone, String email, String address, int age, double height, boolean ismarried, char genre) {
        this.dni = dni;
        this.name = name;
        this.lname1 = lname1;
        this.lname2 = lname2;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.age = age;
        this.height = height;
        this.ismarried = ismarried;
        this.genre = genre;
        // TODO code application logic here
    }

    //(2.2)Constructor vacio
    public Paciente() {
    }

    //(2.3)Constructor con los 4 principales atributos
    public Paciente(String dni, String name, String lname1, String lname2) {
        this.dni = dni;
        this.name = name;
        this.lname1 = lname1;
        this.lname2 = lname2;
    }

    //(3) METODOS 8GET Y SET)

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLName1() {
        return lname1;
    }

    public void setLName1(String lname1) {
        this.lname1 = lname1;
    }

    public String getLName2() {
        return lname2;
    }

    public void setLName2(String lname2) {
        this.lname2 = lname2;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean getIsMarried() {
        return ismarried;
    }

    public void setIsMarried(boolean ismarried) {
        this.ismarried = ismarried;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }


    //METODO TO_STRING
    @Override
    public String toString() {
        return "Paciente{" + "dni=" + dni + ", name=" + name + ", lname1=" + lname1 + ", lname2=" + lname2 + ", phone=" + phone + ", email=" + email + "\n, address=" + address + ", age=" + age + ", height=" + height + ", ismarried=" + ismarried + ", genre=" + genre + '}';
    }
    
    public void mostrar (){
    System.out.printf("%-10s%-10s%-10s%-10s%-10s%-20s%-35s%10d  %10.2f %-10s%-10s\n",this.dni, this.name, this.lname1, this.lname2, this.phone, this.email, this.address, this.age, this.height, this.ismarried, this.genre);
    //System.out.printf("%-10s%-10s%-10s%-10s\n",this.dni, this.name, this.lname1, this.lname2);

    }
    
}
