import java.util.ArrayList;
import java.util.List;

public class Metflix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();

    // Metodo que inicializa el catalogo cno las pelis/series qeu querramos
    public void inicializarCatalogo() {

        // Pelis: Titanic, Batman: El caballero de la noche
        Pelicula titanic; // declara una variable que apuntara a una Pelicula
        titanic = new Pelicula(); // Estas ultimoas 2 lineas: Pelicula titanic = new Pelicula();

        titanic.nombre = "Titanic";
        titanic.añoLanzamiento = 1997;
        titanic.duracion = 210; // 3hs 30

        Actor actor = new Actor();
        actor.nombre = "Leo DiCaprio";

        // Agrego a la lista de actores del objeto titanic
        titanic.actores.add(actor); // metodo Add -> agregar a una lista

        // Recien ahora estoy agregando a Titanic al catalogo
        this.peliculas.add(titanic);

        // Otra Peli
        Pelicula batman = new Pelicula();
        batman.nombre = "Batman: el caballero de la nohe";
        batman.añoLanzamiento = 2008;
        batman.duracion = 152;

        // No voy a declarar otra variable actor, voy a reusar
        // siempre primero antes de reusar
        // re instanciar
        actor = new Actor(); // Creo un nuevo actor, pero referenciado con la variable actor
        actor.nombre = "Christian Bale";

        batman.actores.add(actor);

        this.peliculas.add(batman);

        Pelicula wonder = new Pelicula();
        wonder.nombre = "Wonder";
        wonder.añoLanzamiento = 2017;
        wonder.duracion = 113;

        actor = new Actor();
        actor.nombre = "Owen Wilson";

        wonder.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Julia Roberts";

        wonder.actores.add(actor);

        this.peliculas.add(wonder);

        // How I met your mother. Serie

        Serie howIMetYM = new Serie();
        howIMetYM.nombre = "How I met your mother";
        howIMetYM.añoLanzamiento = 2005;

        actor = new Actor();
        actor.nombre = "Neil Patrick Harris";

        howIMetYM.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Cobie Smulders";

        howIMetYM.actores.add(actor);

        // T5:E11
        // creo la temporada
        Temporada temporada = new Temporada();
        temporada.numero = 5;

        // Creo el episodio
        Episodio episodio = new Episodio();
        episodio.nombre = "The last cigarrette";
        episodio.numero = 11;

        // vinculo temporada con episodio
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.nombre = "Definitions";
        episodio.numero = 1;

        temporada.episodios.add(episodio);

        // Agrego la temporada
        howIMetYM.temporadas.add(temporada);

        // T3
        // creo la temporada
        temporada = new Temporada();
        temporada.numero = 3;

        // Creo el episodio
        episodio = new Episodio();
        episodio.nombre = "Wait for it";
        episodio.numero = 1;

        // vinculo temporada con episodio
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.nombre = "Little Boys";
        episodio.numero = 4;

        temporada.episodios.add(episodio);

        // Agrego la temporada
        howIMetYM.temporadas.add(temporada);

        // Aca esta toda la serie con 2 temporadas y cada una con 2 episodios.
        this.series.add(howIMetYM);

        Serie bbt = new Serie();
        bbt.nombre = "The BigBang Theory";
        bbt.añoLanzamiento = 2007;

        actor = new Actor();
        actor.nombre = "Kaley Cuoco";

        bbt.actores.add(actor);

        // creo la temporada
        temporada = new Temporada();
        temporada.numero = 1;

        // Creo el episodio
        episodio = new Episodio();
        episodio.nombre = "Pilot";
        episodio.numero = 1;

        // vinculo temporada con episodio
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.nombre = "The Cooper-Hofstadter Polarizatio";

        temporada.episodios.add(episodio);

        // Agrego la temporada
        bbt.temporadas.add(temporada);

        this.series.add(bbt);

        Serie youngSheldon = new Serie();
        youngSheldon.nombre = "Young Sheldon";
        youngSheldon.añoLanzamiento = 2017;

        actor = new Actor();
        actor.nombre = "Iain Armitage";
        youngSheldon.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Montana Jordan";
        youngSheldon.actores.add(actor);

        temporada = new Temporada();
        temporada.numero = 1;

        episodio = new Episodio();
        episodio.numero = 2;
        episodio.nombre = "Cohetes, comunistas y bibliotecas";

        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.numero = 4;
        episodio.nombre = "Un psicologo, un comic y una salchicha para desayunar";

        temporada.episodios.add(episodio);

        youngSheldon.temporadas.add(temporada);

        temporada = new Temporada();
        temporada.numero = 2;

        episodio = new Episodio();
        episodio.numero = 1;
        episodio.nombre = "Un zumbido agudo y ruedines";

        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.numero = 3;
        episodio.nombre = "Una crisis de fe y pulpos alienigenas";
        temporada.episodios.add(episodio);

        youngSheldon.temporadas.add(temporada);

        this.series.add(youngSheldon);

    }

    // Buscar Serie
    public Serie buscarSerie(String nombreABuscar) {

        // series = | serie1 | serie2 | serie25 | serie40 |
        // vamos a usar el foreach: que sirve para recorrer listas
        // este ciclo, tiene una variable, qeu apunta en cada vuelta
        // a cada elemento de la lista
        // o sea la primer vez, va a apuntar a serie1, despues a serie2 ddesp
        // serie25 hasta que termina.
        for (Serie serie : this.series) {
            // pregunto si el nombre de la serie actual
            // que estoy recorriendo es la que necesito
            if (serie.nombre.equals(nombreABuscar))

                return serie; // devuelvo esta serie.
        }
        // si llego hasta aca, es porque no encontro la serie.
        return null;

    }

    public Pelicula buscarPelicula(String nombreABuscar) {
        for (Pelicula pelicula : this.peliculas) {
            if (pelicula.nombre.equals(nombreABuscar))

                return pelicula;

        }
        return null;

    }
}