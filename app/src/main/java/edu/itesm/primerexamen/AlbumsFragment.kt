package edu.itesm.primerexamen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_albums.*
import kotlinx.android.synthetic.main.renglon_album.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AlbumsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AlbumsFragment : Fragment() {
    // TODO: Rename and change types of parameters

    //private val args by navArgs<MovieFragmentArgs>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_albums, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        album_recycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = AlbumAdapter(createData())
        }
    }

    fun createData(): ArrayList<Album>{
        val albums = ArrayList<Album>()
        albums.add(Album(R.drawable.bridges_to_babylon_1558714556,"Fear and Desire", 1997, "Bridges to Babylon llegó en un momento complicado de la banda, cuando el legado de Stones se estrelló contra el florecimiento del indie-rock, los ritmos mochileros del hip-hop, la música electrónica y otros géneros que hicieron que la banda británica pareciera terriblemente irrelevante. Teniendo todo eso en cuenta, nos encontramos con un álbum esquizofrénico que despachaba algunos de los viejos trucos del grupo con algunos de los géneros mencionados. Fue, probablemente, la peor decisión que pudieron haber tomado los Stones (incluso contando con la producción de los Dust Brothers). Otras opciones: 1) No, y 2) En serio, ¡tomaros un descanso!"))
        albums.add(Album(R.drawable.dirty_work,"Dirty Work", 1986, "No hay más que ver la portada: los Stones adoptaron el aspecto y el sonido de los cash-ins del pop más de moda, dejando algo de lado todo aquello que les había convertido en icono del rock 'n' roll mundial. Sinceramente, suenan flojos y confusos. Un álbum sin pies ni cabeza, donde todo estaba equivocado: desde la producción hasta la composición de las canciones, algo que abocó a este disco a caer en el olvido. ¿Podemos salvar algo? Sí: One Hit to the Body es una canción de apertura convincente, así como la versión de Harlem Shuffle, el clásico de 1963 de Bob & Earl . Mantente alejado del resto."))
        albums.add(Album(R.drawable.voodoo_lounge, "Voodoo Lounge", 1994, "Producido por Don Was, los Stones quisieron mantener el buen momento que vivieron con Steel Wheels en 1989, poniendo el foco en hacer temas sin muchos artificios que sonaran a lo que siempre sonaron los británicos. Los resultados son variados, con un listado de canciones que bien podría haberse quedado en tres o cuatro menos sin ningún problema, ya que hay overbooking de medios tiempos que no llevan a nada. Aún así, hay algo cautivador en el hecho de que Jagger se dejó llevar por la sordidez de los Stones, cuando estaba llegando a la mitad de los 50 en su vida, y llevada ya varias décadas siendo un multimillonario. Imaginar una versión en los 60 de la brillante \"Sparks Will Fly\", es como editar La Amenaza Fantasma para eliminar a Jar Jar Binks."))
        albums.add(Album(R.drawable.black_and_blue,"Black and Blue", 1976, "Agotados de ideas interesantes, y en general, los Stones comenzaron a dar pasos hacia la música disco con Black and Blue, pero los resultados se vieron afectados por contar con algunos miembros en la banda que estaban ahí de forma transitoria y una falta de enfoque. Hay canciones reggae, por supuesto, pero en general Jagger y Richards parecen más interesados en cumplir con el expediente contractual y seguir siendo famosos. El lado positivo: si no has escuchado \"Hand of Fate\", \"Memory Motel\" o \"Fool to Cry\" desde hace tiempo, las encontrarás más confortables y más vivas que la última vez que las escuchaste."))
        albums.add(Album(R.drawable.the_rolling_stones_now, "The Rolling Stones, Now!", 1965, "Al igual que sucede con la mayoría de sus primeros trabajos, aquí hay canciones que aparecieron en otros discos (incluida la luminosa \"Heart of Stone\"), pero en general, el tercer LP estadounidense de los Stones sigue siendo un importante reflejo del más clásico R&B de la British Invasion . Mientras los Beatles comenzaban a despertarse, los Stones empezaban a escribir mejores canciones e incluso insinuaban temas de violencia en medio de la angustia que se vivía en aquellos años. Es como escuchar el crepitar de una línea eléctrica caída sobre unos árboles, sabiendo que pronto incendiará algo."))
        albums.add(Album(R.drawable.steel_wheels, "Steel Wheels", 1989, "Lo mejor que se puede decir de Steel Wheels es que en él escuchamos a una banda de gente honesta que han estado tocando juntos durante décadas. Considerado como un disco de reunión (otra más, y no la última), en Steel Wheels vemos a un grupo lleno de energía, tanto en la carretera como en el estudio, disfrutando de su estatus como leyendas del rock mientras producían un AOR respetable, que está más que claro en canciones como \"Mixed Emotions\", \"Sad Sad Sad\", y la más contundente \"Rock and a Hard Place\". Por cierto, todas ellas recuerdan por muchas razones a la época de Tattoo You, sobre todo por los tics vocales y los riffs de guitarra. Es uno de los pocos álbumes de los Stones que se beneficia de su modesta pero tensa producción, ya que Mick y Keith estaban a brazo partido, algo que ayudó a definir lo que la banda podía hacer cuando el siglo XX se iba acercando a su fin."))
        albums.add(Album(R.drawable.goats_head_soup, "Goats Head Soup", 1973, "Independientemente del título y es horrorosa portada, (¿es esto acaso Captain Beefheart?) Goats Head Soup saca una nota muy respetable por contener canciones bastante buenas, encabezadas sobre todo por la inmortal \"Angie\". La razón principal por la que este disco no está entre los 10 mejores es su combinación de esa más que evidente depresiva sordidez y el hecho de que inmediatamente le siguieron la mayor racha de excelsos álbumes de estudio en la historia del rock. Independientemente de si los Stones estaban físicamente preparados para despachar un mejor trabajo en aquel momento (Keith estaba en las profundidades de la adicción a la heroína), Soup se quedó un poco a medias, como esas sopas tibias que tienen cosas muy ricas, pero otras no tanto."))
        albums.add(Album(R.drawable.twelve_x_five, "12 x 5", 1964, "Durante los primeros dos años tras el debut de los Stones en los EE. UU., la banda vivió un torbellino de actividades y lanzamientos. Pero 12 x 5, su segundo LP en Estados Unidos, contiene un buen puñado de fantásticas versiones y canciones originales cada vez más potentes y depuradas. Time Is On My Side de Jerry Ragovoy, y que los Stones popularizaron, todavía suena maravillosamente, mientras que Under the Boardwalk, Susie Q, y It's All Over Now son imprescindibles en cualquier colección de canciones hechas para disfrutar mientras se conduce en el coche. Podemos considerar a este álbum como el principio de casi todo lo que vino más tarde."))
        albums.add(Album(R.drawable.out_of_our_hands, "Out Of Our Hands", 1965, "\"Time Is One My Side\" fue el primer éxito que entró en el Top 10 de los Stones, pero fue \"(I Can't Get No) Satisfaction\", la canción de Jagger / Richards, la que presentó ante el mundo a la banda como una fuerza lujuriosa y desinhibida dispuesta a revolucionar la cultura popular. Los matices sexuales ayudaron a los Stones a alejarse de la greñuda escena musical británica, mientras que \"The Last Time\" y otras versiones como \"Hitch Hike\" (de Marvin Gaye) y \"I'm Alright\" sonaban más a los propios Stones que a las canciones originales."))
        albums.add(Album(R.drawable.blue_and_lonesome,"Blue And Lonesome", 2016, "Seguro que te estás preguntando: ¿cómo puede estar un álbum nuevo tan alto en esta lista? Por supuesto, el sentimentalismo ayuda a completar la lista de canciones en este disco, pero los mejores álbumes de los Stones siempre han girado sobre talentos complementarios que han conseguido encajar perfectamente. La edad ayuda a Jagger a sonar más cómodo o triste en esta colección de versiones de canciones de blues de Chicago, grabadas en el estudio de Mark Knopfler, y ni siquiera los invitados de alto nivel (sí, aquí toca la guitarra un tal Clapton) consiguen eclipasar esa emocionante y despreocupada manera que tiene Jagger de hacer este tipo de cosas."))
        albums.add(Album(R.drawable.emotional_rescue, "Emotional Rescue", 1980, "Rescue es uno de los álbumes más relajados y casuales del catálogo de los Stones, con temas que en gran parte fueron cocinados durante las sesiones de Some Girls. Teniendo en cuenta lo bueno que es ese álbum, no nos quejamos. El sonido optimista de la batería en temas como \"Summer Romance\" oculta letras típicamente siniestras. Muchas recuerdan a \"Lies\", una de las clásicas de Some Girls, por ejemplo \"Let Me Go\". Un trabajo travieso y colegial, que luego sería imposible viendo el camino que llevó la banda, y porque los años iban cayendo, en él también encontramos a Jagger cantando con el mejor falsete de su carrera en la pista que da título al disco."))
        albums.add(Album(R.drawable.tattoo_you, "Tatoo You", 1981, "El último gran álbum de la banda. Tattoo You no fue drásticamente diferente en su concepción o producción a Emotional Rescue, pero la calidad de las canciones lo distinguió al instante. \"Start Me Up\" y \"Waiting on a Friend\" son temas consagrados, pero rara vez la sección rítmica de los últimos días del grupo aulló como lo hizo en \"Slave\", una canción que quedó fuera de Black and Blue que mostró el camino de los Stones hacia el boogie más extático. \"Black Limousine\" es un clásico honkytonk poco apreciado que merece estar en todas las máquinas de discos por debajo de la línea Mason-Dixon."))
        albums.add(Album(R.drawable.its_rock_and_roll, "It's Rock And Roll", 1974, "Aquí hay temas que suenan vivos, que innovan y que suenan a puro rock con inspiraciones en sonidos como los de Bowie. Pero, sin duda, lo más destacable es que los Stones suenan a los Stones, con olor a humo, cigarrillos, botellas rotas y colillas por el suelo. La canción que da nombre al disco es un ejemplo perfecto. Un disco que a veces suena como si se todo se tambaleara, pero que es uno de esos álbumes que agradeces revisitar de vez en cuando para recordar a lo que sonaba una banda de rock tan grande en aquella época. Tras el gigantesco Exile era complicado mantener el nivel, pero sin duda es un disco que tienen algunas de las últimas perlas de la banda antes del agujero negro que supuso parte de la década de los 70 para los Stones, donde hubo maravillas y grandes decepciones. Por cierto, fue el último álbum con Mick Taylor en la banda."))
        albums.add(Album(R.drawable.between_the_buttons, "Between the Buttons", 1967, "Este no es solo el álbum que presentó maravillas com \"Ruby Tuesday\" y la vibrante \"Let's Spend the Night Together\" al público estadounidense, es un disco tremendo repleto de música de altísimo nivel y matices que solo los más grandes pueden aspira a crear. \"Yesterday's Papers\" es una canción de rock atípica que no puede sonar más garajera, mientras que \"Connection\" es una de las obras vocales más concisas y rotundas de la banda. \"Something Happened to Me Yesterday\" cierra el disco con una nota que suena a los Kinks, demostrando que los Stones pueden (casi) hacer a sus competidores mejores que ellos mismos."))
        albums.add(Album(R.drawable.aftermath, "Aftermath", 1966, "Otro álbum que muestra el músculo de un equipo de compositores astutos y de rápida evolución. Aftermath nos deja maravillas de Mick y Keith del tipo de \"Paint It Black\" y \"Under My Thumb\", canciones interminables como \"Goin 'Home\" (11 minutos), que dejó claro que estos chicos blancos podían tocar blues sin ruborizarse. Es genial de principio a fin (menos \"Stupid Girl\"), pero las canciones mencionadas anteriormente son tan fuertes que dominan el conjunto, tanto entonces como ahora. También vale la pena preguntarse cuánto más podría Brian Jones haber impulsado la música pop, al estilo de George Harrison, si hubiera vivido toda la década."))
        albums.add(Album(R.drawable.some_girl, "Some Girls", 1978, "Some Girls funciona perfectamente como álbum, con esa maravillosa secuencia de temas que van enlazados de una forma magistral unos con otros, y de paso, como una especie de colección de singles donde los Stones quisieron experimentar con nuevas fórmulas. Seguro que una de las opciones era la música disco, pero seguro que pesó el hecho de tener que ver esa transición en la banda de rock más grande de la historia, especialmente con el surgimiento del punk y el desmantelamiento de los mitos hippies. Un disco divertido, áspero y repleto de energía, en el que casi todas las canciones son clásicos. \"Beast of Burden\", en particular, es una canción deliciosamente lánguida, a la par de endiabladamente dulce, que ni los mismos Stones pudieron superar con el paso de los años."))
        albums.add(Album(R.drawable.beggars_banquet, "Beggars Banquet", 1968, "Beggars Banquet no fue el primer disco de la banda completamente original, pero ciertamente suena así ahora, dado que inició la carrera más impecable en la historia del rock (que termina con el Exile on Main Street de 1972). Dejando de lado su reputación como la banda más caliente y rebelde de la música popular, Beggars Banquet reveló un creciente cansancio en el mundo en medio de la sutil decadencia del sueño flower power, que golpearía a la banda al año siguiente durante su concierto en Altamont. Ambiciosas y diversas, pero certeras a más no poder, estas 10 canciones se mecen sin aparente esfuerzo entre pisotones, arrogancias y lamentos acústicos. Suena grandilocuente a ratos (\"Stray Cat Blues\") y melancólicamente modesto en otros (\"Factory Girl\"), pero todo está anclado por himnos como \"Sympathy for the Devil\" y \"Street Fighting Man\"."))
        return albums
    }

}