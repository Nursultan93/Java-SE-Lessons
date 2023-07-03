import exception.EmployeeNotFound;
import exception.NotFoundException;
import exception.PersonNotFoundException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Run {
    public static void main(String[] args) {

        try {

            BufferedReader f = new BufferedReader(new FileReader(""));

        Person p = null;

        System.out.println(p.getName());

        }catch (PersonNotFoundException e){
            System.out.println("Person tapilmadi");
        }catch (EmployeeNotFound e){
            System.out.println("Isci tapilmadi");
        }catch (NotFoundException e){
            System.out.println("Person tapilmadi");
        } catch (ArithmeticException e) {
            System.out.println("Riyazi xeta bas verdi");
        }catch (NullPointerException e){
            System.out.println("Person obyekti null'a beraberdir");
        }catch (NumberFormatException e){
            System.out.println("Reqemin formati duzgun deyil");
        }catch (Exception e){
            System.out.println("Her hansi basqa bir exception oldu");
        }

    }
}
