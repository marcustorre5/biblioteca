package biblioteca;

public class App {

    public static void main(String[] args) {

            LivroDigital ld = new LivroDigital("Senhor dos aneis",
            new Autor("Tolkien", "Britanico", "tolkin@gmail.com"),
            "Aventura",
            5,
            1000,
            3500);

            ld.info();
        
    }
    
}
