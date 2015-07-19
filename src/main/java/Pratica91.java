/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica91 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        
        Runtime rt = Runtime.getRuntime();
        System.out.println(rt.availableProcessors());
        System.out.println(rt.totalMemory());
        System.out.println(rt.freeMemory());
        System.out.println(rt.maxMemory());
    }
}
