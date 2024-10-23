public class Libro {
    
  String isbn;
  String titulo;
  Integer year;
  Boolean prestado = false;

  public Libro(String isbn, String titulo, Integer year) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.year = year;
    }

  public void prestar() {
    this.prestado = true;
  }

  public void devolver() {
    this.prestado = false;
  }

  public void estado() {
    if (prestado) {
        System.out.println("Este libro está prestado");
    } else {
        System.out.println("Este libro no está prestado");
    }
  }

  public static void main(String[] args) {
    Libro libro1 = new Libro("9788408297079", "Alas de Onix", 2025);
    
    Libro libro2 = libro1; // creamos nuevo objeto
    
    libro1.estado();      // preguntamos el estado de libro1
    
    libro2.estado();      // preguntamos el estado de libro2
    
    libro1.prestar();     // prestamos SOLO libro1
    
    libro1.estado();      // libro1 ahora está prestado
    
    libro2.estado();      // libro2 está prestado también ya que apunta a la misma referencia
  }
}