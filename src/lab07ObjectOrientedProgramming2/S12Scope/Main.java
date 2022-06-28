package lab07ObjectOrientedProgramming2.S12Scope;

public class Main {

    /*
    Access Modifiers- Erişim Belirleyiciler

    Erişim Belirleyiciler 2 düzeyde erişimi belirlerler.

    Sınıf Düzeyinde Erişim Belirleyiciler

    public : Bir class eğer public yazılmışsa bu classa paketin içindeki ve paketin dışındaki
    tüm classlar tarafından erişilir.

    default: default erişim belirleyici kullanmamak anlamına gelir.
    Eğer bir class hiçbir erişim belirleyici kullanmadan yazılmışsa, bu class'a sadece aynı paketin içindeki
    classlar erişebilir. Paketin dışındaki classlar bu class'a erişemez.

    *** protected, private erişim belirleyiciler classlar için kullanılamazlar.


    Metod ve Özellik Düzeyinde Erişim Belirleyiciler


    public: Eğer bir metod veya özellik(class member veya alan) public olarak tanımlanmışsa ,
    bu alana paketin içindeki ve dışındaki tüm classlar erişebilir.
    Ancak tabii ki bu alanın içinde bulunduğu classın da erişilebilir olması gerekir.

    default: Eğer bir metod veya özellik tanımlanırken hiçbir erişim belirleyici kullanılmamışsa (default),
    bu alana sadece kendi paketindeki classlar erişebilir.

    protected : Eğer bir metod veya özellik(class member veya alan) protected olarak tanımlanmışsa,
    bu alana aynı paketin içindeki diğer classlar tarafından erişilebilir. Paketin dışındaki classlar ise
    sadece ve sadece bu alanın bulunduğu classın bir alt classıysa erişebilir.

    private: Eğer bir alan private olarak tanımlanmışsa bu alana sadece kendi classı erişebilir.


    Daha önceden öğrendiğimiz gibi bir metodun içinde tanımlanmış değişkenler lokal değişken olarak tanımlanırlar.Yani,
    bu değişkenlere diğer metodlardan ve classlardan erişilemez. Bundan dolayı bu değişkenlere access modifier eklenemez.

 */


    public static void main(String[] args) {
        KapsamSinifi kapsamSinifi = new KapsamSinifi();
        kapsamSinifi.onIleCarp();

        System.out.println("******************");

        KapsamSinifi2.DahiliSinif kapsam = new KapsamSinifi2().new DahiliSinif();
        kapsam.onIleCarp();

    }
}
