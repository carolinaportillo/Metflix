public class App {

    public static void main(String[] args) throws Exception {

        // A partir de Metflix, buscar la temporada 5 episodio 1 de la serie

        // How I met your mother y

        // reproducir el episodio.

        Metflix miMetflix = new Metflix();

        System.out.println("Inicializando catalogo de Metflix");

        miMetflix.inicializarCatalogo();// Estoy llamando al metodo que crea las pelis y series.

        Pelicula peliculaBuscada = miMetflix.buscarPelicula("Wonder");

        peliculaBuscada.reproducir();

        Serie serieBuscada = miMetflix.buscarSerie("Young Sheldon");

        Temporada temporada = serieBuscada.buscarTemporada(2);

        Episodio episodio = temporada.buscarEpisodio(1);

        episodio.reproducir();

    }
}
