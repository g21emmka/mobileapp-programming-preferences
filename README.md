
# Rapport

Jag har börjat med att skapa en second activity, i denna har jag lagt in en TextView, EditText och en button
som jag sedan positionerat ut. Jag har lagt in shared preferences i både MainActivity (sida 1)och i SecondActivity (sida 2),
detta gör så att det som skrivs in i SecondActivity syns i MainActivity, även om vi stänger ner SecondActivity.
I SecondActivity är även en editor tillagd till SharedPreferences. 

En bit programkod som visar SharedPreferences i MainActivity (sida 1).
```
@Override
    protected void onResume() {
        super.onResume();

        SharedPreferences MyPreferences = this.getSharedPreferences("Preferences", Context.MODE_PRIVATE);
        String name = MyPreferences.getString("name", "no name found");
        textViewName.setText(name);
    }
```
En bit programkod som visar SharedPreferences i SecondActivity (sida 2).
```
 // Store the new preference
        SharedPreferences MyPreferences = this.getSharedPreferences("Preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = MyPreferences.edit();
        editor.putString("name", getname);
        editor.apply();
```

ParentActivityName är tillagd i Manifest filen, detta för att göra MainActivity till en förälder för SecondActivity.
Detta visas genom en tillbaka pil som finns uppe i vänstra hörnet på sidan.
Sedan la jag till en finish activity i SecondActivity så att när man klickar på knappen "Go" så kommer man tillbaka 
till sida 1 där namnet visas. Så det går att gå till sida 1 igen antingen genom tillbaka pilen eller genom att klicka
på knappen. 



Bild från sida 2, där namnet Emma skrivs in.

![](page2.png)

Bild från sida 1, där man kan se att namnet Emma dyker upp, som skrevs in på föregående sida.

![](page1.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
