package com.example.pokemon_login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    Spinner generaciones;
    ArrayList<Pokemones> listaPokemones ;
    RecyclerView recyclerPokemones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listaPokemones=new ArrayList<>();
        recyclerPokemones=findViewById(R.id.reciclerId);
        recyclerPokemones.setLayoutManager(new LinearLayoutManager(this));

        llenarPokemones();
        AdapterPokemon adapterPokemon = new AdapterPokemon(listaPokemones);
        recyclerPokemones.setAdapter(adapterPokemon);
        generaciones = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> a = ArrayAdapter.createFromResource(this, R.array.generaciones, android.R.layout.simple_spinner_item);
        generaciones.setAdapter(a);
        generaciones.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity2.this,"Seleccionado: " + parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void llenarPokemones() {
        listaPokemones.add(new Pokemones("Bulbasaur","Planta - Veneno",R.drawable.bulbasaur1));
        listaPokemones.add(new Pokemones("Ivysaur","Planta - Veneno",R.drawable.ivysaur2));
        listaPokemones.add(new Pokemones("Venusaur","Planta - Veneno",R.drawable.venusaur3));
        listaPokemones.add(new Pokemones("Charmander","Fuego",R.drawable.charmander4));
        listaPokemones.add(new Pokemones("Charmeleon","Fuego",R.drawable.charmeleon5));
        listaPokemones.add(new Pokemones("Charizard","Fuego - Volador",R.drawable.charizard6));
        listaPokemones.add(new Pokemones("Squirtle","Agua",R.drawable.squirtle7));
        listaPokemones.add(new Pokemones("Wartortle","Agua",R.drawable.wartortle8));
        listaPokemones.add(new Pokemones("Blastoise","Agua",R.drawable.blastoise9));
        listaPokemones.add(new Pokemones("Caterpie","Bicho",R.drawable.caterpie10));
        listaPokemones.add(new Pokemones("Metapod","Bicho",R.drawable.metapod11));
        listaPokemones.add(new Pokemones("Butterfree","Bicho - Volador",R.drawable.butterfree12));
        listaPokemones.add(new Pokemones("Weedle","Bicho - Veneno",R.drawable.weedle13));
        listaPokemones.add(new Pokemones("Kakuna","Bicho - Veneno",R.drawable.kakuna14));
        listaPokemones.add(new Pokemones("Beedril","Bicho - Veneno",R.drawable.beedril15));
        listaPokemones.add(new Pokemones("Pidgey","Normal - Volador",R.drawable.pidgey16));
        listaPokemones.add(new Pokemones("Pidgeotto","Normal - Volador",R.drawable.pidgeotto17));
        listaPokemones.add(new Pokemones("Pidgeot","Normal - Volador",R.drawable.pidgeot18));
        listaPokemones.add(new Pokemones("Rattata","Normal",R.drawable.rattata19));
        listaPokemones.add(new Pokemones("Raticate","Normal",R.drawable.raticate20));
        listaPokemones.add(new Pokemones("Spearow","Normal - Volador",R.drawable.spearow21));
        listaPokemones.add(new Pokemones("Fearow","Normal - Volador",R.drawable.fearow22));
        listaPokemones.add(new Pokemones("Ekans","Veneno",R.drawable.ekans23));
        listaPokemones.add(new Pokemones("Arbok","Veneno",R.drawable.ekans24));
        listaPokemones.add(new Pokemones("Pickachu","Electrico",R.drawable.pikachu25));
        listaPokemones.add(new Pokemones("Raichu","Electrico",R.drawable.raichu26));
        listaPokemones.add(new Pokemones("Sandshrew","Tierra",R.drawable.sandshrew27));
        listaPokemones.add(new Pokemones("Sandslash","Tierra",R.drawable.sandslash28));
        listaPokemones.add(new Pokemones("Nidoran","Veneno",R.drawable.nidoran29));
        listaPokemones.add(new Pokemones("Nidorina","Veneno",R.drawable.nidorina30));
        listaPokemones.add(new Pokemones("Nidoqueen","Veneno - Tierra",R.drawable.nidoqueen31));
        listaPokemones.add(new Pokemones("Nidoran","Veneno",R.drawable.nidoran32));
        listaPokemones.add(new Pokemones("Nidorino","Veneno",R.drawable.nidorino33));
        listaPokemones.add(new Pokemones("NidoKing","Veneno - Tierra",R.drawable.nidoking34));
        listaPokemones.add(new Pokemones("Cleafairy","Hada",R.drawable.clefairy35));
        listaPokemones.add(new Pokemones("Cleafable","Hada",R.drawable.clefable36));
        listaPokemones.add(new Pokemones("Vulpix","Fuego",R.drawable.vulpix37));
        listaPokemones.add(new Pokemones("Ninetales","Fuego",R.drawable.ninetails38));
        listaPokemones.add(new Pokemones("Jigglypuff","Normal - Hada",R.drawable.jigglypuff39));
        listaPokemones.add(new Pokemones("Wigglytuff","Normal - Hada",R.drawable.wiggltuff40));
        listaPokemones.add(new Pokemones("Zubat","Veneno - Volador",R.drawable.zubat41));
        listaPokemones.add(new Pokemones("Golbat","Veneno - Volador",R.drawable.golbat42));
        listaPokemones.add(new Pokemones("Oddish","Planta - Veneno",R.drawable.oddish43));
        listaPokemones.add(new Pokemones("Gloom","Planta - Veneno",R.drawable.gloom44));
        listaPokemones.add(new Pokemones("Vileplume","Planta - Veneno",R.drawable.vileplume45));
        listaPokemones.add(new Pokemones("Paras","Bicho - Planta",R.drawable.paras46));
        listaPokemones.add(new Pokemones("Parasect","Bicho - Planta",R.drawable.parasect47));
        listaPokemones.add(new Pokemones("Venonat","Bicho - Veneno",R.drawable.venonat48));
        listaPokemones.add(new Pokemones("Venomoth","Bicho - Veneno",R.drawable.venomoth49));
        listaPokemones.add(new Pokemones("Digglet","Tierra",R.drawable.diglett50));
        listaPokemones.add(new Pokemones("Dugtrio","Tierra",R.drawable.dugtrio51));
        listaPokemones.add(new Pokemones("Meowth","Normal",R.drawable.meowth));
        listaPokemones.add(new Pokemones("Persian","Normal",R.drawable.persian53));
        listaPokemones.add(new Pokemones("Psyduck","Agua",R.drawable.psyduck54));
        listaPokemones.add(new Pokemones("Golduck","Agua",R.drawable.golduck55));
        listaPokemones.add(new Pokemones("Mankey","Lucha",R.drawable.mankey56));
        listaPokemones.add(new Pokemones("Primeape","Lucha",R.drawable.primeape57));
        listaPokemones.add(new Pokemones("Growlithe","Fuego",R.drawable.growlithe58));
        listaPokemones.add(new Pokemones("Arcanine","Fuego",R.drawable.arcanine59));
        listaPokemones.add(new Pokemones("Poliwag","Agua",R.drawable.poliwag60));
        listaPokemones.add(new Pokemones("Poliwhirl","Agua",R.drawable.poliwhirl61));
        listaPokemones.add(new Pokemones("Poliwrath","Agua - Lucha",R.drawable.poliwrath62));
        listaPokemones.add(new Pokemones("Abra","Psiquico",R.drawable.abra63));
        listaPokemones.add(new Pokemones("Kadabra","Psiquico",R.drawable.kadabra64));
        listaPokemones.add(new Pokemones("Alakazam","Psiquico",R.drawable.alakazam65));
        listaPokemones.add(new Pokemones("Machop","Lucha",R.drawable.machop66));
        listaPokemones.add(new Pokemones("Machoke","Lucha",R.drawable.machoke67));
        listaPokemones.add(new Pokemones("Machamp","Lucha",R.drawable.machamp68));
        listaPokemones.add(new Pokemones("Bellsprout","Planta - Veneno",R.drawable.bellsprout69));
        listaPokemones.add(new Pokemones("Weepinbell","Planta - Veneno",R.drawable.weepinbell70));
        listaPokemones.add(new Pokemones("Victreebel","Planta - Veneno",R.drawable.victreebel71));
        listaPokemones.add(new Pokemones("Tentacool","Agua - Veneno",R.drawable.tentacool72));
        listaPokemones.add(new Pokemones("Tentacruel","Agua - Veneno",R.drawable.tentacruel73));
        listaPokemones.add(new Pokemones("Geodude","Roca - Tierra",R.drawable.geodude74));
        listaPokemones.add(new Pokemones("Graveler","Roca - Tierra",R.drawable.gravaeler75));
        listaPokemones.add(new Pokemones("Golem","Roca - Tierra",R.drawable.golem76));
        listaPokemones.add(new Pokemones("Ponyta","Fuego",R.drawable.ponyta77));
        listaPokemones.add(new Pokemones("Rapidash","Fuego",R.drawable.rapidash78));
        listaPokemones.add(new Pokemones("Slowpoke","Agua - Psiquico",R.drawable.slowpoke79));
        listaPokemones.add(new Pokemones("Slowbro","Agua - Psiquico",R.drawable.slowbro80));
        listaPokemones.add(new Pokemones("Magnemite","Electrico - Acero",R.drawable.magnemite81));
        listaPokemones.add(new Pokemones("Magneton","Electrico - Acero",R.drawable.magnemite82));
        listaPokemones.add(new Pokemones("Farfetch´d","Normal - Volador",R.drawable.farfetchd83));
        listaPokemones.add(new Pokemones("Doduo","Normal - Volador",R.drawable.doduo84));
        listaPokemones.add(new Pokemones("Dodrio","Normal - Volador",R.drawable.dodrio85));
        listaPokemones.add(new Pokemones("Seel","Agua",R.drawable.seel86));
        listaPokemones.add(new Pokemones("Dewgong","Agua - Hielo",R.drawable.dewgong87));
        listaPokemones.add(new Pokemones("Grimer","Veneno",R.drawable.grimer));
        listaPokemones.add(new Pokemones("Muk","Veneno",R.drawable.muk89));
        listaPokemones.add(new Pokemones("Shellder","Agua",R.drawable.shellder90));
        listaPokemones.add(new Pokemones("Cloyster","Agua - Hielo",R.drawable.cloyster91));
        listaPokemones.add(new Pokemones("Gastly","Fantasma - Veneno",R.drawable.gastly92));
        listaPokemones.add(new Pokemones("Haunter","Fantasma - Veneno",R.drawable.haunter93));
        listaPokemones.add(new Pokemones("Gengar","Fantasma - Veneno",R.drawable.gengar94));
        listaPokemones.add(new Pokemones("Onix","Roca - Tierra",R.drawable.onix95));
        listaPokemones.add(new Pokemones("Drowzee","Psiquico",R.drawable.drowzee96));
        listaPokemones.add(new Pokemones("Hypno","Psiquico",R.drawable.hypno97));
        listaPokemones.add(new Pokemones("Krabby","Agua",R.drawable.krabby98));
        listaPokemones.add(new Pokemones("Kingler","Agua",R.drawable.kingler99));
        listaPokemones.add(new Pokemones("Voltorb","Electrico",R.drawable.voltorb100));
        listaPokemones.add(new Pokemones("Electrode","Electrico",R.drawable.electrode101));
        listaPokemones.add(new Pokemones("Exeggcute","Planta - Psiquico",R.drawable.exeggcute102));
        listaPokemones.add(new Pokemones("Exeggutor","Planta - Psiquico",R.drawable.exeggutor103));
        listaPokemones.add(new Pokemones("Cubone","Tierra",R.drawable.cubone104));
        listaPokemones.add(new Pokemones("Marowak","Tierra",R.drawable.marowak105));
        listaPokemones.add(new Pokemones("Hitmonlee","Lucha",R.drawable.hitmolee106));
        listaPokemones.add(new Pokemones("Hitmochan","Lucha",R.drawable.hitmochan107));
        listaPokemones.add(new Pokemones("Lickitung","Normal",R.drawable.lickitung108));
        listaPokemones.add(new Pokemones("Koffing","Veneno",R.drawable.koffing109));
        listaPokemones.add(new Pokemones("Weezing","Veneno",R.drawable.weezinf110));
        listaPokemones.add(new Pokemones("Rhyhorn","Tierra - Roca",R.drawable.ryhorn111));
        listaPokemones.add(new Pokemones("Rhydon","Tierra - Roca",R.drawable.rhydon112));
        listaPokemones.add(new Pokemones("Chansey","Normal",R.drawable.chansey113));
        listaPokemones.add(new Pokemones("Tangela","Planta",R.drawable.tangela114));
        listaPokemones.add(new Pokemones("Kangaskhan","Normal",R.drawable.kangaskhan115));
        listaPokemones.add(new Pokemones("Horsea","Agua",R.drawable.horsea116));
        listaPokemones.add(new Pokemones("Seadra","Agua",R.drawable.seadra117));
        listaPokemones.add(new Pokemones("Goldeen","Agua",R.drawable.gondeen118));
        listaPokemones.add(new Pokemones("Seaking","Agua",R.drawable.seaking119));
        listaPokemones.add(new Pokemones("Staryu","Agua",R.drawable.staryu120));
        listaPokemones.add(new Pokemones("Starmie","Agua - Psiquico",R.drawable.starmie121));
        listaPokemones.add(new Pokemones("Mr.Mime","Psiquico - Hada",R.drawable.mrmime122));
        listaPokemones.add(new Pokemones("Scyther","Bicho - Volador",R.drawable.scyther123));
        listaPokemones.add(new Pokemones("Jynx","Hielo - Psiquico",R.drawable.jynx124));
        listaPokemones.add(new Pokemones("Electabuz","Electrico",R.drawable.electabuzz125));
        listaPokemones.add(new Pokemones("Magmar","Fuego",R.drawable.magmar126));
        listaPokemones.add(new Pokemones("Pinsir","Bicho",R.drawable.pinsir127));
        listaPokemones.add(new Pokemones("Tauros","Normal",R.drawable.tauros128));
        listaPokemones.add(new Pokemones("Magikarp","Agua",R.drawable.magikarp129));
        listaPokemones.add(new Pokemones("Gyarados","Agua - Dragon",R.drawable.gyarados130));
        listaPokemones.add(new Pokemones("Lapras","Agua - Hielo",R.drawable.lapras131));
        listaPokemones.add(new Pokemones("Ditto","Normal",R.drawable.ditto132));
        listaPokemones.add(new Pokemones("Eevee","Normal",R.drawable.eevee133));
        listaPokemones.add(new Pokemones("Vaporeon","Agua",R.drawable.vaporeon134));
        listaPokemones.add(new Pokemones("Jolteon","Electrico",R.drawable.jolteon135));
        listaPokemones.add(new Pokemones("Flareon","Fuego",R.drawable.flareon136));
        listaPokemones.add(new Pokemones("Porygon","Normal",R.drawable.porygon137));
        listaPokemones.add(new Pokemones("Omanyte","Roca - Agua",R.drawable.omanyte138));
        listaPokemones.add(new Pokemones("Omastar","Roca - Agua",R.drawable.omastar139));
        listaPokemones.add(new Pokemones("Kabuto","Roca - Agua",R.drawable.kabuto140));
        listaPokemones.add(new Pokemones("Kabutops","Roca - Agua",R.drawable.kabutops141));
        listaPokemones.add(new Pokemones("Aerodactyl","Roca - Volador",R.drawable.aerodactyl142));
        listaPokemones.add(new Pokemones("Snorlax","Normal",R.drawable.snorlax143));
        listaPokemones.add(new Pokemones("Articuno","Hielo - Volador",R.drawable.kakuna14));
        listaPokemones.add(new Pokemones("Zapdos","Electrico - Volador",R.drawable.zapdos145));
        listaPokemones.add(new Pokemones("Moltres","Fuego - Volador",R.drawable.moltres146));
        listaPokemones.add(new Pokemones("Dratini","Dragon",R.drawable.dratini147));
        listaPokemones.add(new Pokemones("Dragonair","Dragon",R.drawable.dragonair148));
        listaPokemones.add(new Pokemones("Dragonite","Dragon - Volador",R.drawable.dragonair149));
        listaPokemones.add(new Pokemones("Mewtwo","Psiquico",R.drawable.mewtwo150));
        listaPokemones.add(new Pokemones("Mew","Psiquico",R.drawable.mew151));
    }
}