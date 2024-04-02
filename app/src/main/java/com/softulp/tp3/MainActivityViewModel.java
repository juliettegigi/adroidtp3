package com.softulp.tp3;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import com.softulp.tp3.modelo.Pelicula;

import java.util.ArrayList;

public class MainActivityViewModel extends AndroidViewModel {
    private ArrayList<Pelicula> lista;
    private MutableLiveData<RecyclerView.Adapter<PeliculaAdapter.ViewHolder>> mutableAdapter;
    Context context;

    public MainActivityViewModel(@NonNull Application application, Context c) {
        super(application);
        lista=new ArrayList<>();
        context=c;
    }
    public MutableLiveData<RecyclerView.Adapter<PeliculaAdapter.ViewHolder>> getMutableAdapter() {
        if(mutableAdapter==null){
            mutableAdapter=new MutableLiveData<>();
            cargarDatos();
            RecyclerView.Adapter<PeliculaAdapter.ViewHolder>  adapter=new PeliculaAdapter(lista,context);
            mutableAdapter.setValue(adapter);
        }
        return mutableAdapter;
    }

    private void cargarDatos(){

        lista.add(new Pelicula(R.drawable.peli1,
                             "En Toledo, en 2012, el doctor Robert Ledgard (Antonio Banderas) vive en El Cigarral, una mansión en las afueras de la ciudad donde tiene su laboratorio y quirófano personales. Allí mantiene cautiva a una joven que ese día ha intentado suicidarse abriendo sus muñecas; Ledgard logra salvarla pero se muestra molesto por la fragilidad de la piel. Posteriormente, usa plasma animal para crear piel sintética que injerta en la muchacha. Atándola en la camilla de su laboratorio experimenta apoyándole la llama de un soplete y posteriormente un mosquito que intenta picarla; curiosamente, ninguno de los dos logra lastimarla.",
                             "La piel que habito.",
                             "Antonio Banderas\n" +
                "Elena Anaya\n" +
                "Marisa Paredes\n" +
                "Blanca Suárez\n" +
                "Jan Cornet\n" +
                "Roberto Álamo",
                           "Pedro Almodóvar"));
        lista.add(new Pelicula(R.drawable.peli4,
                              "A mediados de los años 90, veinte jóvenes bailarines de danza urbana que se habían reunido para varias jornadas de ensayos durante tres días en un internado en desuso situado en el corazón de un bosque. Cuando terminan su último baile común, celebran con una fiesta alrededor de una gran fuente de sangría. Descubren que la sangría de la cual bebieron había sido adulterada con LSD, pero no saben por quién o por qué. Pronto, la atmósfera se vuelve eléctrica y una extraña locura los atrapa, convirtiendo su exultante noche en una pesadilla, cuando uno a uno sienten las consecuencias de una crisis psicodélica colectiva.",
                              "Climax.",
                              "Sofia Boutella\n" +
                "Kiddy Smile\n" +
                "Roman Guillermic\n" +
                "Souheila Yacoub\n" +
                "Claude Gajan Maull\n" +
                "Giselle Palmer\n" +
                "Taylor Kastle\n" +
                "Thea Carla Schott",
                             "Gaspar Noé"));
        lista.add(new Pelicula(R.drawable.peli3,
                "Doug Billings (Justin Bartha) va a casarse con Tracy Garner (Sasha Barrese). Doug realizará una despedida de soltero en Las Vegas con sus amigos Phil Wenneck (Bradley Cooper), Stuart \"Stu\" Price (Ed Helms), y el hermano de Tracy, Alan Garner (Zach Galifianakis). Doug, Phil, Alan y Stu se dirigen esa misma noche a Las Vegas donde reservan una suite en el hotel Caesars Palace. Justo antes de que comience la despedida de soltero se dirigen a la azotea del hotel donde toman unos tragos preparados por Alan.",
                "Qué pasó ayer?",
                "\tBradley Cooper\n" +
                "Ed Helms\n" +
                "Zach Galifianakis\n" +
                "Heather Graham\n" +
                "Mike Epps\n" +
                "Justin Bartha\n" +
                "Jeffrey Tambor",
                "Todd Phillips"));
        lista.add(new Pelicula(R.drawable.crisken,"La Barbie estereotipada (\"Barbie\") y sus compañeras residen en Barbieland, una sociedad matriarcal poblada por diferentes versiones de Barbies, Kens y un grupo de modelos descatalogadas, que son tratadas como raras debido a sus rasgos poco convencionales. Mientras los Kens se pasan el día jugando en la playa, considerándola su profesión, las Barbies desempeñan trabajos de prestigio como médico, abogado y político. Beach Ken (\"Ken\") sólo es feliz cuando está con Barbie y busca una relación más estrecha, pero Barbie lo rechaza en favor de otras actividades y amistades femeninas.",
                "Barbie.",
                "\tMargot Robbie\n" +
                        "Ryan Gosling\n" +
                        "America Ferrera\n" +
                        "Kate McKinnon\n" +
                        "Issa Rae\n" +
                        "Rhea Perlman\n" +
                        "Hari Nef\n" +
                        "Alexandra Shipp\n" +
                        "Emma Mackey",
                "Greta Gerwig"));
        lista.add(new Pelicula(R.drawable.peli2,
                "Durante la Segunda Guerra Mundial, el coronel de la Wehrmacht, Claus von Stauffenberg (Tom Cruise) es gravemente herido durante un ataque aéreo llevado a cabo por la Royal Air Force en Túnez, como resultado pierde una mano y un ojo, siendo evacuado a Alemania. Mientras tanto, el comandante Henning von Tresckow (Kenneth Branagh) fracasa en su intento por asesinar a Adolf Hitler escondiendo una bomba en el avión donde viajaba el Führer. Más tarde descubre que la Gestapo ha arrestado al comandante Hans Oster, por lo que ordena al general Friedrich Olbricht (Bill Nighy) encontrar un sustituto. El elegido es Stauffenberg. Olbricht acompaña a Stauffenberg a una reunión secreta de los conspiradores, entre los que se encuentran el general Ludwig Beck (Terence Stamp), el doctor Carl Goerdeler (Kevin McNally) y Erwin von Witzleben (David Schofield). Stauffenberg descubre que el grupo no tiene nada previsto para después del asesinato de Hitler.",
                "Operación Valquiria.",
                "Tom Cruise\n" +
                "Bill Nighy\n" +
                "Carice van Houten\n" +
                "Kenneth Branagh\n" +
                "Tom Wilkinson\n" +
                "Eddie Izzard\n" +
                "Thomas Kretschmann\n" +
                "Terence Stamp\n" +
                "David Schofield",
                "\t\n" +
                "Bryan Singer"));
    }
}
